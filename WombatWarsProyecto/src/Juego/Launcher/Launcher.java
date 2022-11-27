package Juego.Launcher;



import Juego.Logger.logger;

import Juego.VentanasLogIn.VentanaLogin;
//import Juego.baseDeDatos.baseDeDatos;


public class Launcher {
    public static void main(String[] args) {

        VentanaLogin PrimeraVentana = new VentanaLogin();
        PrimeraVentana.Login();

        logger.LanzarLogger();
        //baseDeDatos.MeterDatos(); <- Este método ya se ha usado, no lo necesitamos otra vez.
        String[] wombats = {"wombatNormal", "wombatGordo", "wombatOro", "wombatDiamante", "wombatTiempo", "wombatBomba", "wombatNuke", "reyWombat"};

        mostrarDatosWombat(wombats, 0);

        
    }

    
    
     //Metodo recursivo para obtener los datos que hay metidos en el array datosWombat que representa todos los wombat de la BD.
     public static void mostrarDatosWombat(String[] wombats, int indice) {
        

        if(indice != wombats.length) {
            System.out.println(wombats[indice]);
            mostrarDatosWombat(wombats, indice+1);
        }
    }
  

    
}