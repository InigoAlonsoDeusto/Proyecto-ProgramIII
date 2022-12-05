package fasesDeJuego;

import javax.swing.JLabel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import utilidadesJuego.GeneradorDeWombats;
import utilidadesJuego.Puntuacion;
import utilidadesJuego.Reloj;
import ventanasNiveles.Nivel1;

public class Inicio {

    public static void InicioCode(){ 

        GeneradorDeWombats.randomWombatCode();
        
        Reloj.RelojCode();

        for( int i = 0; i<Nivel1.agujeros.length;i++ ){
           Nivel1.agujeros[i].addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e){
                    JLabel lbl = (JLabel)e.getSource();
                    int id = Integer.parseInt(lbl.getName());
                    Puntuacion.presionarBoton(id);
                }
            });
        }

         
     }
    
}
