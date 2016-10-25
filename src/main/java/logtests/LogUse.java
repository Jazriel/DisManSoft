package main.java.logtests;
import java.util.logging.*;


public class LogUse {
	public static void use(){
		Logger logger = Logger.getLogger("nope");
		logger.setLevel(Level.ALL);
		logger.info("Antes de asignar un manejador de fichero");
		try {
			FileHandler handler = new FileHandler(".\\errores.log");
			 handler.setLevel(Level.WARNING);
			 logger.addHandler(handler);
			 logger.info("Después de asignar un manejador de fichero");
			 logger.warning("Después de asignar un manejador de fichero");
		}catch(Exception e){
			logger.severe(e.getMessage());
		}
	}
}


