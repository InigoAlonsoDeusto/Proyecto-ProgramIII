package metodosRecursivos;

public class WombatsRegistradosEnBD {
	
	
	//este  metodo se utiliza al llamar  a las  fotos de los wombats desde el libro
		 
	 public static void mostrarDatosWombat(String[] wombats, int indice) {        

	        if(indice != wombats.length) {
	            System.out.println(wombats[indice]);
	            mostrarDatosWombat(wombats, indice+1);
	        }
	    }


}


//Metodo recursivo para obtener los datos que hay metidos en el array datosWombat que representa todos los wombat de la BD.
