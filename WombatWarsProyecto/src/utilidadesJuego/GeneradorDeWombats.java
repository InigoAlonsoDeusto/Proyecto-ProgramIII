package utilidadesJuego;

import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import codigoLogger.GeneracionLogger;
import ventanasNiveles.Nivel1;

import java.awt.Image;

public class GeneradorDeWombats {

    public static void randomWombatCode() {//Esta clase va a generar un numero aleatorio (del 0 al 9 por los agujeros)
                                        //para determinar el nº del hoyo en el que saldrá el wombat. 
        try {
            Random numeroRandom = new Random(System.currentTimeMillis()); //Inicializamos el numeroRandom
            int wombat = numeroRandom.nextInt(9); //Creamos la variable wombat (para luego poder saber cual es el que sale)
                                                        //Y le ponemos el numero random que va a crear este metodo entre el 0 y 9.

            Nivel1.agujeroConWombat[wombat] = 1; //Ponemos el agujero a 1 para que el wombat esté visible (salga del agujero).
            Nivel1.agujeros[wombat].setBorder(Nivel1.borde2); //Lo pintamos por ahora para comprobar que sale, aquí le meteremos la imagen del wombat con .setIcon().
            GeneracionLogger.log.info("INFO: Wombat generado."); 

        } catch (Exception e) {
            GeneracionLogger.log.error("ERROR: Se ha producido un error al  determinar el agujero del wombat."); 
            e.printStackTrace();
        }
    }  
}
