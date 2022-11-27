package Juego.UtilidadesJuego;

import java.util.Random;

import Juego.Launcher.WombatWarsMain;
import Juego.Logger.logger;

public class GeneradorDeWombats {

    public static void randomWombatCode() {//Esta clase va a generar un numero aleatorio (del 0 al 9 por los agujeros)
        //para determinar el nº del hoyo en el que saldrá el wombat. 
try {
Random numeroRandom = new Random(System.currentTimeMillis()); //Inicializamos el numeroRandom
int wombat = numeroRandom.nextInt(9); //Creamos la variable wombat (para luego poder saber cual es el que sale)
                               //Y le ponemos el numero random que va a crear este metodo entre el 0 y 9.

                               WombatWarsMain.agujeroConWombat[wombat] = 1; //Ponemos el agujero a 1 para que el wombat esté visible (salga del agujero).
WombatWarsMain.agujeros[wombat].setBorder(WombatWarsMain.borde2); //Lo pintamos por ahora para comprobar que sale, aquí le meteremos la imagen del wombat con .setIcon().

} catch (Exception e) {
logger.log.error("ERROR: Se ha producido al  determinar el agujero del wombat."); 
e.printStackTrace();
}
}
    
}
