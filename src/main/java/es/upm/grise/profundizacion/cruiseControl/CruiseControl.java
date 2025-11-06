package es.upm.grise.profundizacion.cruiseControl;

public class CruiseControl {
	
	@SuppressWarnings("unused")
	private Speedometer speedometer;
	private Integer speedSet;
	private Integer speedLimit;

	/*
	 * Constructor
	 */
	public CruiseControl(Speedometer speedometer) {
		
		this.speedometer = speedometer;
		this.speedSet = speedSet;
		this.speedLimit = speedLimit;

	}
	
	/*
	 * Method to code
	 */
	public void setSpeedSet(int speedSet) {
		if (speedSet < 0) {
			throw new IncorrectSpeedSetException("speedset no puede ser creo o negativa.");
		}else if(speedSet >= getSpeedLimit()){
			throw new SpeedSetAboveSpeedLimitException("SpeedSet no puede superar SpeedLimit");
		}else {
			speedSet += getSpeedSet();
		}
	}

	/*
	 * Other setters & getters
	 */
	public Integer getSpeedLimit() {
		return speedLimit;
	}

	public void setSpeedLimit(Integer speedLimit) {
		this.speedLimit = speedLimit;
	}

	public Integer getSpeedSet() {
		return speedSet;
	}

}
