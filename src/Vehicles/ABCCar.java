package Vehicles;

import java.util.List;

public abstract class ABCCar {

	protected List<IWheel> wheels;
	
	protected IManufacturer manufacturer;
	protected IDriving driving;
	protected ISteering steering;
	
	public ABCCar() {
		
	}

	public void turnLeft(double degrees){
		this.steering.turnLeft(degrees);
	}

	public void turnRight(double degrees){
		this.steering.turnRight(degrees);
	}

	public void accelerate(double km){
		this.driving.accelerate(km);
	}
}
