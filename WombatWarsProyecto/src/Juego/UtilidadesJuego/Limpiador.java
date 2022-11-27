package Juego.UtilidadesJuego;

import Juego.Launcher.WombatWarsMain;

public class Limpiador {

    public static void limpiarCode(){ //con ese metodo el tablero empieza vacio en un principio
        for(int i = 0 ; i < 9; i++){
            WombatWarsMain.agujeros[i].setBorder(WombatWarsMain.borde);
            WombatWarsMain.agujeroConWombat[i]= 0;
        }
    }
    
}
