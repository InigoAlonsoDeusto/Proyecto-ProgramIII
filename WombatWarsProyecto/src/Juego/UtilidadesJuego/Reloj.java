package Juego.UtilidadesJuego;

import java.util.Timer;
import java.util.TimerTask;

import Juego.FasesDeJuego.GameOver;
import Juego.Launcher.WombatWarsMain;

public class Reloj {
    
    static int interval;

    public int getInterval() {
        return this.interval;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }

    static Timer timer;

public static void RelojCode() {
    int secs = 10;
    int delay = 1000;
    int period = 1000;
    timer = new Timer();
    interval = secs;
    System.out.println(secs);
    timer.scheduleAtFixedRate(new TimerTask() {

        public void run() {

            int tiempoRestante = (setInterval());


            WombatWarsMain.lblTiempoRestante.setText(Integer.toString(tiempoRestante));

             if (tiempoRestante == 0){

                GameOver.gameOver();

            }

            
    
        }

        
    }, delay, period);
}

private static final int setInterval() {
    if (interval == 1)
        timer.cancel();

    return --interval;
}


}

/* temporizador = new Timer(1000, new ActionListener() { //creamos el temporizador para que cuente los 60 segundos que dura una partida
            public void actionPerformed(ActionEvent evt) {
                if(tiempoRestante == 0) {
                    lblTiempoRestante.setText("" + tiempoRestante);
                    temporizador.stop();
                    gameOver();
                }else {
                    lblTiempoRestante.setText("" + tiempoRestante);
                    tiempoRestante--;
                }
            }
        } ); */
