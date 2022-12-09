package utilidadesJuego;

import java.util.Timer;
import java.util.TimerTask;

import codigoLogger.GeneracionLogger;
import fasesDeJuego.GameOver;
import ventanasNiveles.Nivel1;

public class Reloj {
    
    static int interval;
    static Timer timer;
    
    public Reloj(int interval, Timer timer) {
		super();
		this.interval = interval;
		this.timer = timer;
	}
    
    public int getInterval() {
        return this.interval;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }
    
    public Timer getTimer() {
        return this.timer;
    }

    public void setTimer(Timer timer) {
        this.timer = timer;
        }

public static void RelojCode() {
    int secs = 20;
    int delay = 1000;
    int period = 1000;
    timer = new Timer();
    interval = secs;
    System.out.println(secs);
    timer.scheduleAtFixedRate(new TimerTask() {

        public void run() {

            int tiempoRestante = (setInterval());
            Nivel1.lblTiempoRestante.setText(Integer.toString(tiempoRestante));
            System.out.println(tiempoRestante);
            
            if (tiempoRestante%2==0) {
            	
                GeneradorDeWombats.randomWombatCode();
            }


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
