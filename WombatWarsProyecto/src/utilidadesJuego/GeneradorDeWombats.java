package utilidadesJuego;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.border.Border;

import codigoLogger.GeneracionLogger;
import ventanasNiveles.Nivel1;

import java.awt.Color;
import java.awt.Image;

public class GeneradorDeWombats extends Nivel1{

	private Random numeroRandom;
	private int wombat;
	public static int tipoWombatGlobal;
	
    public static Border borde = BorderFactory.createLineBorder(new Color (0, 100, 0), 5); //temporal para marcar los agujeros mientras no tengamos imagenes
    public static Border borde2 = BorderFactory.createLineBorder(new Color (100, 0, 0), 5); //temporal para marcar los agujeros mientras no tengamos imagenes
    public static Border borde3 = BorderFactory.createLineBorder(new Color (100, 100, 0), 5); //temporal para marcar los agujeros mientras no tengamos imagenes
    public static Border borde4 = BorderFactory.createLineBorder(new Color (10, 80, 100), 5); //temporal para marcar los agujeros mientras no tengamos imagenes
    public static Border borde5 = BorderFactory.createLineBorder(new Color (100, 0, 100), 5); //temporal para marcar los agujeros mientras no tengamos imagenes
    public static Border borde7 = BorderFactory.createLineBorder(new Color (100, 50, 200), 5); //temporal para marcar los agujeros mientras no tengamos imagenes

		
    public GeneradorDeWombats(Random numeroRandom, int wombat) {
		super();
		this.numeroRandom = numeroRandom;
		this.wombat = wombat;
	}

	public Random getNumeroRandom() {
		return numeroRandom;
	}

	public void setNumeroRandom(Random numeroRandom) {
		this.numeroRandom = numeroRandom;
	}

	public int getWombat() {
		return wombat;
	}

	public void setWombat(int wombat) {
		this.wombat = wombat;
	}

	public static void randomWombatCode() {//Esta clase va a generar un numero aleatorio (del 0 al 9 por los agujeros)
                                        //para determinar el nÂº del hoyo en el que saldrÃ¡ el wombat.
        try {
            Random numeroRandom = new Random(System.currentTimeMillis()); //Inicializamos el numeroRandom
            int wombat = numeroRandom.nextInt(9); //Creamos la variable wombat (para luego poder saber cual es el que sale)
                                                        //Y le ponemos el numero random que va a crear este metodo entre el 0 y 9.
            Random random = new Random();
            int upperbound = 8;
            int tipoWombat = random.nextInt(upperbound);
            tipoWombatGlobal = tipoWombat;
            System.out.println(tipoWombatGlobal);
            
            
            
            //CHULETA
            /* 
             0- Wombat normal
             1- W oro
             2- W diamante
             3- W tiempo
             4- W bomba
             5- W nuke
             6- W gordo
             
          
             */
            if(tipoWombat == 0) {
            
            Nivel1.agujeroConWombat[wombat] = 1;//Ponemos el agujero a 1 para que el wombat esta visible (salga del agujero).
            //ImageIcon wonbatSali = new ImageIcon("WombatWarsProyecto/res/agujeroConWonbat.png");
            //Nivel1.agujeros[wombat].setIcon(wonbatSali);
            Nivel1.agujeros[wombat].setBorder(borde);
            
            
            //Nivel1.agujeros[i].setIcon("/moleIn.png"); //Lo pintamos por ahora para comprobar que sale, aquÃ­ le meteremos la imagen del wombat con .setIcon().
            
            }
            
            if(tipoWombat == 1) {
                
                Nivel1.agujeroConWombat[wombat] = 1; //Ponemos el agujero a 1 para que el wombat estÃ© visible (salga del agujero).
                Nivel1.agujeros[wombat].setBorder(borde3); //Lo pintamos por ahora para comprobar que sale, aquÃ­ le meteremos la imagen del wombat con .setIcon().
                }
            
            if(tipoWombat == 2) {
                
                Nivel1.agujeroConWombat[wombat] = 1; //Ponemos el agujero a 1 para que el wombat estÃ© visible (salga del agujero).
                Nivel1.agujeros[wombat].setBorder(borde5); //Lo pintamos por ahora para comprobar que sale, aquÃ­ le meteremos la imagen del wombat con .setIcon().
                }
            
            if(tipoWombat == 3) {
                
                Nivel1.agujeroConWombat[wombat] = 1; //Ponemos el agujero a 1 para que el wombat estÃ© visible (salga del agujero).
                Nivel1.agujeros[wombat].setBorder(borde7); //Lo pintamos por ahora para comprobar que sale, aquÃ­ le meteremos la imagen del wombat con .setIcon().
                }
            
            if(tipoWombat == 4) {
                
                Nivel1.agujeroConWombat[wombat] = 1; //Ponemos el agujero a 1 para que el wombat estÃ© visible (salga del agujero).
                Nivel1.agujeros[wombat].setBorder(borde2); //Lo pintamos por ahora para comprobar que sale, aquÃ­ le meteremos la imagen del wombat con .setIcon().
                }
            
            if(tipoWombat == 5) {
                
                Nivel1.agujeroConWombat[wombat] = 1; //Ponemos el agujero a 1 para que el wombat estÃ© visible (salga del agujero).
                Nivel1.agujeros[wombat].setBorder(borde3); //Lo pintamos por ahora para comprobar que sale, aquÃ­ le meteremos la imagen del wombat con .setIcon().
                }
            
            if(tipoWombat == 6) {
                
                Nivel1.agujeroConWombat[wombat] = 1; //Ponemos el agujero a 1 para que el wombat estÃ© visible (salga del agujero).
                ImageIcon wombatGordo = new ImageIcon("WombatWarsProyecto/res/gordo.png");
                Nivel1.agujeros[wombat].setIcon(wombatGordo);
                Nivel1.agujeros[wombat].setBorder(borde4); //Lo pintamos por ahora para comprobar que sale, aquÃ­ le meteremos la imagen del wombat con .setIcon().


                }
            
            
            GeneracionLogger.log.info("INFO: Wombat generado.");
            
            TimeUnit.SECONDS.sleep(2);
            
            Limpiador.limpiarCode();

            
            //Nivel1.agujeros[wombat].setBorder(borde); //Lo pintamos por ahora para comprobar que sale, aquÃ­ le meteremos la imagen del wombat con .setIcon().
            //Nivel1.agujeroConWombat[wombat] = 0;

        } catch (Exception e) {
            GeneracionLogger.log.error("ERROR: Se ha producido un error al  determinar el agujero del wombat."); 
            e.printStackTrace();
        }
    }  
}
