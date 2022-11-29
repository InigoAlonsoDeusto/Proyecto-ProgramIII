package Juego.UtilidadesLogin;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import Juego.Ventanas.Registrarse;

public class UsuarioRepetido {
	
	public static boolean ComprobarSiUsuarioRepetido() {

        List<String> usuarios = new ArrayList<String>();
		
            File f = new File("usuarios.txt");
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(f)));
                
                String s = reader.readLine();
                String[] students = new String[16];

                int i=0;
                while(s != null){
                    students[i] = s.split(";")[0];
                    s=reader.readLine(); 
                    i++;
                }

                String[] arr = null;
                for(i = 0; i<students.length;i++){
                    System.out.println(students[i]);
                    usuarios.add(students[i]);
                }
                
            } catch (FileNotFoundException ex) {
            } catch (IOException ex) {
            }   
        

		
		System.out.println(usuarios);
		
		if (usuarios.contains(Registrarse.textField.getText())) {

            System.out.println("La persona ya existe en la lista");
            return true;
        
		} else {
        
			System.out.println("La persona NO existe en la lista");
            return false;
        
		}
	
		
	}


}