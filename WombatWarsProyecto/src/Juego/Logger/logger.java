package Juego.Logger;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class logger {

    public static final Logger log = Logger.getLogger(logger.class);
    


public static void LanzarLogger() {
    String propertiesPath = "WombatWarsProyecto/logConfig/log4j.properties";
    PropertyConfigurator.configure(propertiesPath);

    log.info("Programa comenzado"); //AL REVISAR ESTO AL FINAL, ACUERDATE DE PONER UN LOGGER PARA INDICAR EL FINAL


    //############################################################################

    //AL REVISAR ESTO AL FINAL, ACUERDATE DE PONER UN LOGGER PARA INDICAR EL FINAL

    //############################################################################




}
}