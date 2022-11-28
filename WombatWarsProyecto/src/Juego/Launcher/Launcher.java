package Juego.Launcher;



import Juego.Logger.logger;
import Juego.Ventanas.VentanaBD;
import Juego.Ventanas.VentanaLogin;


public class Launcher extends Thread{

    private int id;

    public Launcher (int id){
        this.id = id;

    }

    public void run(){
        logger.LanzarLogger();

    }
    public static void main(String[] args) {

        Launcher h1 = new Launcher(1);

        VentanaLogin PrimeraVentana = new VentanaLogin();
        PrimeraVentana.Login2();
        VentanaLogin PrimeraVentanaB = new VentanaLogin();
        PrimeraVentanaB.Login();

        h1.start();

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