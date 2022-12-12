package utilidadesJuego;

import codigoLogger.GeneracionLogger;
import ventanasNiveles.Nivel1;

public class Puntuacion {

    public static void presionarBoton(int id){ //con este metodo primero comprueba si el agujero que tocamos es un wombat o un agujero vacio, si es un wonbat se le sumara un punto a la puntiacion y si es una agujero se le restara un punto.Despues actualizaria el contador de puntuacion limpiaria el tablero y generaria otro wonbat aleatorio
        int valor = Nivel1.agujeroConWombat[id];
        try {
            if (valor==1){
                Nivel1.puntuacion++;
                GeneracionLogger.log.info("INFO: Puntuacion aumentada."); 
                
                if (GeneradorDeWombats.tipoWombatGlobal == 1) {
                	
                	//Cod wombat oro
                	
                	Limpiador.limpiarCode();
                	
                }if (GeneradorDeWombats.tipoWombatGlobal == 2) {
                	
                	//Cod wombat diamant
                	
                	Limpiador.limpiarCode();
                	
                }if (GeneradorDeWombats.tipoWombatGlobal == 3) {
                	
                	Reloj.interval += 5;
                	
                	Limpiador.limpiarCode();
                	
                }if (GeneradorDeWombats.tipoWombatGlobal == 4) {
                	
                	//cod wombat bomba
                	
                	Limpiador.limpiarCode();
                	
                }if (GeneradorDeWombats.tipoWombatGlobal == 5) {
                	
                	//Cod wombat nuke
                	
                	Limpiador.limpiarCode();
                	
                }if (GeneradorDeWombats.tipoWombatGlobal == 6) {
                	
                	
                }if (GeneradorDeWombats.tipoWombatGlobal == 0) {
                	
                	Limpiador.limpiarCode();
                	
                	
                	
                }
                
                
                
                
                
            }else if (valor==0){  //cambio pal logger
                valor=0;
                Nivel1.puntuacion--;
                GeneracionLogger.log.info("INFO: Puntuacion reducida."); 
            }
            Nivel1.lblPuntuacion.setText("Score:"+ Nivel1.puntuacion);
            //Limpiador.limpiarCode();
            //GeneradorDeWombats.randomWombatCode();
        } catch (Exception e) {
            GeneracionLogger.log.error("ERROR: Se ha producido un error relacionado con la puntuacion."); 
 

            e.printStackTrace();
        }
    }
    
}
