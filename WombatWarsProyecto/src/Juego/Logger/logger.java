package Juego.Logger;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class logger {

    public static final Logger log = Logger.getLogger(logger.class);
    


public static void LanzarLogger() {

    BasicConfigurator.configure();

    log.info("Programa comenzado"); //AL REVISAR ESTO AL FINAL, ACUERDATE DE PONER UN LOGGER PARA INDICAR EL FINAL


    //############################################################################

    //AL REVISAR ESTO AL FINAL, ACUERDATE DE PONER UN LOGGER PARA INDICAR EL FINAL

    //############################################################################




}
}