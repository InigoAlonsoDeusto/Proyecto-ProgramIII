package utilidadesJuego;

import codigoLogger.GeneracionLogger;
import ventanasNiveles.Nivel1;

public class Limpiador {

    public static void limpiarCode(){ //con ese metodo el tablero empieza vacio en un principio
        for(int i = 0 ; i < 9; i++){
            Nivel1.agujeros[i].setBorder(Nivel1.borde);
            Nivel1.agujeroConWombat[i]= 0;
        }
    }
    
}
