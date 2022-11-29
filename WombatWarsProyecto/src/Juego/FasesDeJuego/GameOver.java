package Juego.FasesDeJuego;

import javax.swing.JOptionPane;

import Juego.Launcher.WombatWarsMain;
import Juego.Logger.logger;
import Juego.UtilidadesJuego.Limpiador;
import Juego.Ventanas.VentanaLogin;
import Juego.Ventanas.ventanaDatosGameOver;
import Juego.baseDeDatos.baseDatos;

public class GameOver {

    public static void gameOver() { //generamos el gameover para cuando finalice la partida y para que nos muestre la WombatWarsMain.puntuacion obtenida
        try {
            if(WombatWarsMain.puntuacion < WombatWarsMain.puntuacionMaxima) {
                WombatWarsMain.puntuacionMaxima = WombatWarsMain.puntuacion;
                WombatWarsMain.lblPuntuacionMaxima.setText("" +WombatWarsMain.puntuacionMaxima);
                JOptionPane.showMessageDialog(null, "Tu puntuacion final es: " +WombatWarsMain.puntuacionMaxima);
                System.out.println("fer feo");

            } else {

                JOptionPane.showMessageDialog(null, "Tu puntuacion final es: " +WombatWarsMain.puntuacion);


                int puntuacionfinal = WombatWarsMain.puntuacion;                
                String nombre = VentanaLogin.textField.getText();
                //String[] datosTablaPuntuaciones = new String[4];
                //datosTablaPuntuaciones[1] = VentanaLogin.textField.getText();
                //datosTablaPuntuaciones[2] = null;
                //datosTablaPuntuaciones[3] = puntuacionfinal;
                //System.out.println(puntuacionfinal);
                //System.out.println(VentanaLogin.textField.getText());

                ventanaDatosGameOver ventana = new ventanaDatosGameOver();
                System.out.println("adrian feo");
                ventana.VentanaDatosGameOverCode();

                baseDatos.meterDatosPartida( nombre, puntuacionfinal);
            }
            WombatWarsMain.puntuacion = 0;
            WombatWarsMain.lblPuntuacion.setText("puntuacion: 0");
            WombatWarsMain.lblTiempoRestante.setText("0");
            Limpiador.limpiarCode();
            
        } catch (Exception e) {
            logger.log.error("ERROR: Se ha producido un error relacionado con la puntuacion."); 
            e.printStackTrace();

        } finally {

            WombatWarsMain.puntuacion = 0;
            WombatWarsMain.lblPuntuacion.setText("puntuacion: 0");
            Limpiador.limpiarCode();
        }
        
    }
    
}
