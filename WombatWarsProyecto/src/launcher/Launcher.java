package launcher;



import codigoLogger.GeneracionLogger;
import metodosRecursivos.WombatsRegistradosEnBD;
import ventanas.VentanaBD;
import ventanas.VentanaLogin;



public class Launcher extends Thread{

    private int id;

    public Launcher (int id){
        this.id = id;

    }

    public void run(){
        GeneracionLogger.LanzarLogger();

    }
    public static void main(String[] args) {

        Launcher h1 = new Launcher(1);

        VentanaLogin PrimeraVentana = new VentanaLogin();
        PrimeraVentana.Login2();
        VentanaLogin PrimeraVentanaB = new VentanaLogin();
        PrimeraVentanaB.Login();

        h1.start();

        //baseDeDatos.MeterDatos(); <- Este método ya se ha usado, no lo necesitamos otra vez.
   
    }
    
}