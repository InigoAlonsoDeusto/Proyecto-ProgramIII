package Juego.FasesDeJuego;

import javax.swing.JLabel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import Juego.Launcher.WombatWarsMain;
import Juego.Utilidades.Reloj;

public class Inicio {

    public static void InicioCode(){ 

        WombatWarsMain.randomWombat();
        
        Reloj.RelojCode();

        for( int i = 0; i<WombatWarsMain.agujeros.length;i++ ){
           WombatWarsMain.agujeros[i].addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e){
                    JLabel lbl = (JLabel)e.getSource();
                    int id = Integer.parseInt(lbl.getName());
                    WombatWarsMain.presionarBoton(id);
                }
            });
        }

         
     }
    
}
