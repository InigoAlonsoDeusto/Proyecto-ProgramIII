package Juego.FasesDeJuego;

import javax.swing.JLabel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import Juego.Launcher.WombatWarsMain;
import Juego.UtilidadesJuego.GeneradorDeWombats;
import Juego.UtilidadesJuego.Puntuacion;
import Juego.UtilidadesJuego.Reloj;

public class Inicio {

    public static void InicioCode(){ 

        GeneradorDeWombats.randomWombatCode();
        
        Reloj.RelojCode();

        for( int i = 0; i<WombatWarsMain.agujeros.length;i++ ){
           WombatWarsMain.agujeros[i].addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e){
                    JLabel lbl = (JLabel)e.getSource();
                    int id = Integer.parseInt(lbl.getName());
                    Puntuacion.presionarBoton(id);
                }
            });
        }

         
     }
    
}
