package main.java.vehicles;

import java.util.List;

public class SimpleSteering implements ISteering {
	
	private List<IWheel> steeringWheels;
	
	public SimpleSteering(List<IWheel> steeringWheels) {
		this.steeringWheels = steeringWheels;
	}
	
	@Override
	public void turnLeft(double degrees) {
		for (IWheel wheel : steeringWheels) {
			wheel.setAngle(-degrees);
		}
	}

	@Override
	public void turnRight(double degrees) {
		for (IWheel wheel : steeringWheels) {
			wheel.setAngle(degrees);
		}
	}

}
