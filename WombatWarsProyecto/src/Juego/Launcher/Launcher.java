package Juego.Launcher;

import Juego.VentanasLogIn.VentanaLogin;
//import Juego.baseDeDatos.baseDeDatos;

public class Launcher {
    public static void main(String[] args) {

        VentanaLogin PrimeraVentana = new VentanaLogin();
        PrimeraVentana.Login();
        //baseDeDatos.MeterDatos(); <- Este método ya se ha usado, no lo necesitamos otra vez.
    }


}