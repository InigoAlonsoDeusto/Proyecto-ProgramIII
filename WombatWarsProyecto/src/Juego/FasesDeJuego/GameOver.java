package Juego.FasesDeJuego;

import javax.swing.JOptionPane;

import Juego.Launcher.WombatWarsMain;
import Juego.Logger.logger;

public class GameOver {

    public static void gameOver() { //generamos el gameover para cuando finalice la partida y para que nos muestre la WombatWarsMain.puntuacion obtenida
        try {
            if(WombatWarsMain.puntuacion > WombatWarsMain.puntuacionMaxima) {
                WombatWarsMain.puntuacionMaxima = WombatWarsMain.puntuacion;
                WombatWarsMain.lblPuntuacionMaxima.setText("" +WombatWarsMain.puntuacionMaxima);
                JOptionPane.showMessageDialog(null, "Tu puntuacion final es: " +WombatWarsMain.puntuacionMaxima);
            } else {
                JOptionPane.showMessageDialog(null, "Tu puntuacion final es: " +WombatWarsMain.puntuacion);
            }
            WombatWarsMain.puntuacion = 0;
            WombatWarsMain.lblPuntuacion.setText("puntuacion: 0");
            WombatWarsMain.lblTiempoRestante.setText("0");
            WombatWarsMain.limpiar();
            
        } catch (Exception e) {
            logger.log.error("ERROR: Se ha producido un error relacionado con la puntuacion."); 
            e.printStackTrace();

        } finally {
            WombatWarsMain.puntuacion = 0;
            WombatWarsMain.lblPuntuacion.setText("puntuacion: 0");
            WombatWarsMain.limpiar();
        }
        
    }
    
}
