package Juego.baseDeDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class baseDatos {

    public Connection conn; 
	
    
	public static Connection conectar() {
		Connection conn = null;
		String url = "jdbc:sqlite:basedatosWW.db"; 
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

	
	public void seleccionarTodosWombats() { //Guarda los wombats que haya en la BD en un array
		
		String sql = "select nombre from wombat";
		
		try (Connection conn = this.conectar(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
			
			
				while(rs.next()) { 
					System.out.println(rs.getString("nombre"));
					
				}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}


	public static void crearTablaPUNTUACIONES() {
		String sql = "Create table if not exists puntuaciones(nombre String, fecha String, puntuacion int)";
		
		try (Connection conn = baseDatos.conectar(); Statement stmt = conn.createStatement()){
			
			
			stmt.execute(sql); 
            System.out.println("La tabla ha sido creada");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

    public static void meterDatosPartida(String nombre, int puntuacion) {
        String sql = "Insert into puntuaciones(nombre, fecha, puntuacion) values (?,?,?)";

        try (Connection conn = baseDatos.conectar(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
			
			
			
			pstmt.setString(1, nombre); 
			
			pstmt.setDate(2, new java.sql.Date(System.currentTimeMillis()));

            pstmt.setInt(3, puntuacion);
			
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
    }






    
}
