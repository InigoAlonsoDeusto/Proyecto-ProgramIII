package recursosBaseDeDatos;

public class DatosPrimeraBaseDatos {

    public static void MeterDatos() {
        InputBaseDatos.conectar();
        InputBaseDatos.crearTablaWombat();
        InputBaseDatos.insertarWombat("wombatNormal", 1, 10, "El wombat comun que aparecera con mas frecuencia en las partidas.");
        InputBaseDatos.insertarWombat("wombatGordo", 5, 30, "wombat con mas vida de lo normal, proporcionando mas monedas al matarlo.");
        InputBaseDatos.insertarWombat("wombatOro",1 ,50, "Wombat que al matarlo te proporcionara mas monedas de lo habitual, pocas probabilidades de que aparezca.");
        InputBaseDatos.insertarWombat("wombatDiamante",1 ,500, "Wombat que al matarlo te proporcionara muchisimas mas monedas de lo habitual, muy pocas probabilidades de que aparezca.");
        InputBaseDatos.insertarWombat("wombatTiempo", 1, 0, "Añade 5 segundos de partida al matarlo.");
        InputBaseDatos.insertarWombat("wombatBomba",1 ,0, "Si lo pinchas explota y te quita 1 corazon.");
        InputBaseDatos.insertarWombat("wombatNuke", 1, 0, "Si lo pinchas, tu tambien moriras pues trae consigo una bomba nuclear.");
        InputBaseDatos.insertarWombat("reyWombat", 1000, 0, "jefe final, requiere el MegaMataWombats™ que se obtendrá en la Tienda, después de avanzar bastante en el juego");
       
        InputBaseDatos.crearTablaPersonajes();
        InputBaseDatos.insertarPersonaje("Protagonista", 3, "Según vaya jugando partidas podrá ir acumulando oro.");
        InputBaseDatos.insertarPersonaje("Granjero", 0, "Aparece al final de cada nivel con vida para ofrecer al protagonista su recompensa.");
        
    }
    
}
