package Juego.Utilidades;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
public class Utilidades {

	public static ArrayList<Usuario> leerUsuarios() {
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		File aFile = new File("usuarios.txt");
		
		try {
			FileReader fr = new FileReader(aFile);
			BufferedReader br = new BufferedReader(fr);
			String linea = br.readLine();
		
			while (linea != null) {
				String[] lineaSeparada = linea.split(";");
				linea = br.readLine();
			}
			br.close();
			fr.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return usuarios;
	}

	public static HashMap<String, Usuario> usuarios() {
		HashMap<String, Usuario> usuarios = new HashMap<String, Usuario>();
		File aFile = new File("usuarios.txt");
		
		try {
			FileReader fr = new FileReader(aFile);
			BufferedReader br = new BufferedReader(fr);
			String linea = br.readLine();
		
			while (linea != null) {
				String[] lineaSeparada = linea.split(";");
				usuarios.put(lineaSeparada[0], new Usuario(lineaSeparada[0], lineaSeparada[1]));
				linea = br.readLine();
			}
			br.close();
			fr.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return usuarios;
	}

	public static void escribirUsuarios(ArrayList<Usuario> usuarios) {
File aFile = new File("usuarios.txt");
		
		try {
			FileWriter fw = new FileWriter(aFile);
			BufferedWriter bw = new BufferedWriter(fw);
		
			for (Usuario usuario : usuarios) {
				String texto = usuario.getUsername() + ";" + usuario.getContrasenya();
				bw.write(texto);
			}
			bw.close();
			fw.close();
			fw.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}