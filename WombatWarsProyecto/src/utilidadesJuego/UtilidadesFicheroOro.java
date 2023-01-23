package utilidadesJuego;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import utilidadesUsuario.Usuario;
import ventanasNiveles.Nivel1;

public class UtilidadesFicheroOro {

	public static ArrayList<Usuario> leerOros() {
		ArrayList<Usuario> oros = new ArrayList<Usuario>();
		File aFile = new File("WombatWarsProyecto/src/utilidadesUsuario/oro.txt");
		
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
		return oros;
	}

	
	
	
	public static void escribirOros(ArrayList<Usuario> oros) {
		File aFile = new File("WombatWarsProyecto/src/utilidadesJuego/oro.txt");
				
				try {
					FileWriter fw = new FileWriter(aFile,true);
					BufferedWriter bw = new BufferedWriter(fw);
				
					for (Usuario oro : oros) {
						int puntuacionfinal = Nivel1.puntuacion;
						puntuacionfinal += "\n";
						bw.write(puntuacionfinal);
					}
					bw.flush();
					bw.close();
					fw.close();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
	
	
}
