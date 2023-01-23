package recursosBaseDeDatos;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import clases.NivelJuego;
import clases.NivelTienda;


public class DBManager {

	
	private static Connection conexion;
	
	
	
	public static boolean abrirConexion( String nombreBD, boolean reiniciaBD ) {
		try {
			
			Class.forName("org.sqlite.JDBC");  
			
			conexion = DriverManager.getConnection("jdbc:sqlite:" + nombreBD );
			if (reiniciaBD) {
				Statement statement = conexion.createStatement();
				String sent = "DROP TABLE IF EXISTS nivel";
				
				statement.executeUpdate( sent );
				sent = "CREATE TABLE nivel (nombreNivel String PRIMARY KEY, descripcion varchar(100), numeroAgujeros int, tiempo int, precio int);";
		
				
				statement.executeUpdate( sent );
				try {
					Scanner scanner = new Scanner( DBManager.class.getResourceAsStream("niveles.txt") );
					while (scanner.hasNextLine()) {
						String linea = scanner.nextLine();
						String[] datos = linea.split( ";" );
						sent = "insert into nivel (nombreNivel, descripcion, numeroAgujeros, tiempo, precio) values (" + datos[0] + ",'" + datos[1] + "'," + datos[2] + "," + datos[3] + "," + datos[4] + ");";
						
						statement.executeUpdate( sent );
					}
					
					scanner.close();
					
				} catch(Exception e) {
					System.out.println("Error");
				}
			}
			return true;
		} catch(Exception e) {
			System.out.println("Error");
			return false;
		}
	}	
	
	
	public static void cerrarConexion() {
		try {
			
			conexion.close();
		} catch (SQLException e) {
			System.out.println("Error");
		}
	}
	
	
	
	public static ArrayList<NivelTienda> getNivelesTienda() {
		try (Statement statement = conexion.createStatement()) {
			ArrayList<NivelTienda> nivelesTienda = new ArrayList<>();
			String sent = "select * from nivel;";
			
			ResultSet rs = statement.executeQuery( sent );
			while( rs.next() ) { 
				String nombreNivel = rs.getString("nombreNivel");
				String descripcion = rs.getString("descripcion");
				int precio = rs.getInt("precio");
				nivelesTienda.add( new NivelTienda (nombreNivel, descripcion, precio) );
			}
			return nivelesTienda;
		} catch (Exception e) {
			System.out.println("No se ha generado correctamente el nivel de Tienda.");
			return null;
		}
	}

	
	public static ArrayList<NivelJuego> getNivelesJuego() {
		try (Statement statement = conexion.createStatement()) {
			ArrayList<NivelJuego> nivelesJuego = new ArrayList<>();
			String sent = "select * from nivel;";
			
			ResultSet rs = statement.executeQuery( sent );
			while( rs.next() ) { // Leer el resultset
				String nombreNivel = rs.getString("nombreNivel");
				String descripcion = rs.getString("descripcion");
				int numeroAgujeros = rs.getInt("numeroAgujeros");
				int tiempo = rs.getInt("tiempo");
				nivelesJuego.add( new NivelJuego (nombreNivel, descripcion, numeroAgujeros, tiempo) );
			}
			return nivelesJuego;
		} catch (Exception e) {
			System.out.println("No se ha generado correctamente el nivel de Juego.");
			return null;
		}
	}


	
}
