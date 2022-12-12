package utilidadesJuego;

import javax.swing.ImageIcon;

import codigoLogger.GeneracionLogger;
import ventanasNiveles.Nivel1;

public class Limpiador {

    public static void limpiarCode(){ //con ese metodo el tablero empieza vacio en un principio
        for(int i = 0 ; i < 9; i++){
        	ImageIcon iconoAgujero = new ImageIcon("WombatWarsProyecto/res/agujeroVacioPNG.png");
        	//Nivel1.agujeros[i].setIcon(iconoAgujero);
      

            Nivel1.agujeros[i].setBorder(Nivel1.borde);
            Nivel1.agujeroConWombat[i]= 0;
        }
    }
    
}
