package Juego;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class baseDatos {

    public Connection conn; 
	
    
	public static Connection conectar() {
		Connection conn = null;
		String url = "jdbc:sqlite:bdWW.db"; 
		try {
			conn = DriverManager.getConnection(url); 
			
		} catch (Exception e) {
			System.out.println(e.getMessage());	
		}
		return conn;
	}



    public static void crearTablaWombat() {
		String sqlwombat = "Create table if not exists wombat(nombre String, corazones integer not null, monedas integer not null, descripcion String)";
		
		try (Connection conn = baseDatos.conectar(); Statement stmt = conn.createStatement()){
			
			
			stmt.execute(sqlwombat); 
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
 
	public static void crearTablaPersonajes() {
		String sqlpersonajes = "Create table if not exists personajes(personaje String, corazones int, descripcion String)";
		
		try (Connection conn = baseDatos.conectar(); Statement stmt = conn.createStatement()){
			
			
			stmt.execute(sqlpersonajes); 
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}



    public static void insertarWombat(String nombre, int corazones, int monedas, String descripcion) {
		
		String sql = "insert into wombat(nombre, corazones, monedas, descripcion) values(?,?,?,?)";
		try (Connection conn = baseDatos.conectar(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
			
			
			
			pstmt.setString(1, nombre); 
			
			pstmt.setInt(2, corazones); 

            pstmt.setInt(3, monedas);

            pstmt.setString(4, descripcion);
			
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	public static void insertarPersonaje(String personaje, int corazones, String descripcion) {
		
		String sql = "insert into personajes(personaje, corazones, descripcion) values(?,?,?)";
		try (Connection conn = baseDatos.conectar(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
			
			
			
			pstmt.setString(1, personaje); 

			pstmt.setInt(2, corazones);

            pstmt.setString(3, descripcion);
			
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}







    
}
