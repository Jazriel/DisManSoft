package main.java.vehicles;

import java.util.List;

public class InverseSteering implements ISteering {

	private List<IWheel> simpleSteeringWheels;
	private List<IWheel> inverseSteeringWheels;
	
	public InverseSteering(List<IWheel> simpleSteeringWheels, List<IWheel> inverseSteeringWheels) {
		this.simpleSteeringWheels = simpleSteeringWheels;
		this.inverseSteeringWheels = inverseSteeringWheels;
	}
	
	@Override
	public void turnLeft(double degrees) {
		for (IWheel wheel : simpleSteeringWheels) {
			wheel.setAngle(-degrees);
		}
		for (IWheel wheel : inverseSteeringWheels) {
			wheel.setAngle(degrees);
		}

	}

	@Override
	public void turnRight(double degrees) {
		for (IWheel wheel : simpleSteeringWheels) {
			wheel.setAngle(degrees);
		}
		for (IWheel wheel : inverseSteeringWheels) {
			wheel.setAngle(-degrees);
		}


	}

}
