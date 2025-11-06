package es.upm.grise.profundizacion.cruiseControl;

public class SpeedSetAboveSpeedLimitException extends RuntimeException{
	SpeedSetAboveSpeedLimitException(String mensaje){
		super(mensaje);
	}
}
