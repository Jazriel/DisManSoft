package Vehicles.concrete;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import Vehicles.ABCCar;
import Vehicles.IWheel;
import Vehicles.MultiWheelDriving;
import Vehicles.Renault;
import Vehicles.SimpleSteering;
import Vehicles.Wheel;

public class RenaultMegane extends ABCCar {

	public RenaultMegane() {
		IWheel leftFrontWheel = new Wheel("leftFrontWheel");
		IWheel rightFrontWheel = new Wheel("rightFrontWheel");
		IWheel leftRearWheel = new Wheel("leftRearWheel");
		IWheel rightRearWheel = new Wheel("rightRearWheel");
		List<IWheel> temporalWheels = new LinkedList<IWheel>();
		temporalWheels.add(rightFrontWheel);
		temporalWheels.add(leftFrontWheel);
		super.driving = new MultiWheelDriving(temporalWheels);
		super.manufacturer = new Renault();
		super.steering = new SimpleSteering(temporalWheels);
		List<IWheel> allWheels = new ArrayList<>(temporalWheels);
		
		allWheels.add(leftRearWheel);
		allWheels.add(rightRearWheel);
		super.wheels = allWheels;
	}

}
