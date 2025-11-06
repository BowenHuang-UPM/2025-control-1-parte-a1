package es.upm.grise.profundizacion.cruiseControl;

public class IncorrectSpeedSetException extends RuntimeException{
	IncorrectSpeedSetException(String mensaje){
		super(mensaje);
	}
}
