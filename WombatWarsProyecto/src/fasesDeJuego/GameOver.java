package fasesDeJuego;

import javax.swing.JOptionPane;

import codigoLogger.GeneracionLogger;
import recursosBaseDeDatos.InputBaseDatos;
import utilidadesJuego.Limpiador;
import ventanas.VentanaLogin;
import ventanasNiveles.Nivel1;
import ventanas.VentanaDatosGameOver;

public class GameOver {
	
	
    public static int puntuacionfinal = Nivel1.puntuacion;
    public static String nombre = VentanaLogin.textField.getText();

    public static void gameOver() { //generamos el gameover para cuando finalice la partida y para que nos muestre la WombatWarsMain.puntuacion obtenida
        try {
        	
        	GeneracionLogger.log.info("INFO: Se ha acabado la partida."); 
        	
        		

                JOptionPane.showMessageDialog(null, "Tu puntuacion final es: " +Nivel1.puntuacion);

                InputBaseDatos.meterDatosPartida( nombre, puntuacionfinal); //Con esto va a la BD

                VentanaDatosGameOver ventana = new VentanaDatosGameOver();
                ventana.VentanaDatosGameOverCode(); //Con esto va a la JTable
                

                
            Nivel1.puntuacion = 0;
            Nivel1.lblPuntuacion.setText("puntuacion: 0");
            Nivel1.lblTiempoRestante.setText("0");
            Limpiador.limpiarCode();
            
        } catch (Exception e) {
            GeneracionLogger.log.error("ERROR: Se ha producido un error relacionado con la puntuacion."); 
            e.printStackTrace();

        } finally {

            Nivel1.puntuacion = 0;
            Nivel1.lblPuntuacion.setText("puntuacion: 0");
            Limpiador.limpiarCode();
        }
        
    }
    
}