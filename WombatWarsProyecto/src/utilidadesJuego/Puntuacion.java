package utilidadesJuego;

import codigoLogger.GeneracionLogger;
import ventanasNiveles.Nivel1;

public class Puntuacion {

	private int valor;
	
    public Puntuacion(int valor) {
		super();
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

    public static void presionarBoton(int id){ //con este metodo primero comprueba si el agujero que tocamos es un wombat o un agujero vacio, si es un wonbat se le sumara un punto a la puntiacion y si es una agujero se le restara un punto.Despues actualizaria el contador de puntuacion limpiaria el tablero y generaria otro wonbat aleatorio
        int valor = Nivel1.agujeroConWombat[id];
        try {
            if (valor==1){
                
                
                if (GeneradorDeWombats.tipoWombatGlobal == 0) { //Cod wombat normal
                	
                	Nivel1.puntuacion+=10;
                    GeneracionLogger.log.info("INFO: Puntuacion aumentada.");
                	
                	
                	
                	Limpiador.limpiarCode();
                	
                
				}if (GeneradorDeWombats.tipoWombatGlobal == 1) { //Cod wombat oro
                	
                	Nivel1.puntuacion+=50;
                    GeneracionLogger.log.info("INFO: Puntuacion aumentada.");
                	
                	
                	
                	Limpiador.limpiarCode();
                	
                }if (GeneradorDeWombats.tipoWombatGlobal == 2) { //Cod wombat diamante
                	
                	Nivel1.puntuacion+=500;
                    GeneracionLogger.log.info("INFO: Puntuacion aumentada.");
                	
                	
                	
                	Limpiador.limpiarCode();
                	
                }if (GeneradorDeWombats.tipoWombatGlobal == 3) { //Cod wombat tiempo
                	
                	Reloj.interval += 5;
                	
                	Limpiador.limpiarCode();
                	
                }if (GeneradorDeWombats.tipoWombatGlobal == 4) { //Cod wombat bomba
                	
                	
                	
                	Limpiador.limpiarCode();
                	
                }if (GeneradorDeWombats.tipoWombatGlobal == 5) { //Cod wombat nuke
                	
                	
                	
                	Limpiador.limpiarCode();
                	
                }if (GeneradorDeWombats.tipoWombatGlobal == 6) { //Cod wombat gordo
                	
                	Nivel1.puntuacion+=30;
                	GeneracionLogger.log.info("INFO: Puntuacion aumentada.");
                	
                	Limpiador.limpiarCode();
                	
                	
                	
                }
                
                
                
                
                
            }else if (valor==0){  //cambio pal logger
                valor=0;
                Nivel1.puntuacion = 0;
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
