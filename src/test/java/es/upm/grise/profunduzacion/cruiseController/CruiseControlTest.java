package es.upm.grise.profunduzacion.cruiseController;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CruiseControlTest {
	
	@Test
	void setSpeedSetNegativaTest() {
		assertThrows(IncorrectSpeedSetException.class,() ->{
			
		});
	}
	
	@Test
	void speedSetAboveSpeedLimitTest() {
		assertThrows(SpeedSetAboveSpeedLimitException.class,() ->{
			
		});
	}
}
