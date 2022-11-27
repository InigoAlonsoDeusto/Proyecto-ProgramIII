package Juego.UtilidadesJuego;

import Juego.Launcher.WombatWarsMain;
import Juego.Logger.logger;

public class Puntuacion {

    public static void presionarBoton(int id){ //con este metodo primero comprueba si el agujero que tocamos es un wombat o un agujero vacio, si es un wonbat se le sumara un punto a la puntiacion y si es una agujero se le restara un punto.Despues actualizaria el contador de puntuacion limpiaria el tablero y generaria otro wonbat aleatorio
        int valor = WombatWarsMain.agujeroConWombat[id];
        try {
            if (valor==1){
                WombatWarsMain.puntuacion++;
            }else if (valor==0){  //cambio pal logger
                valor=0;
                WombatWarsMain.puntuacion--;
            }
            WombatWarsMain.lblPuntuacion.setText("Score:"+ WombatWarsMain.puntuacion);
            Limpiador.limpiarCode();
            GeneradorDeWombats.randomWombatCode();
        } catch (Exception e) {
            logger.log.error("ERROR: Se ha producido un error relacionado el valor de los agujeros."); 
 

            e.printStackTrace();
        }
    }
    
}
