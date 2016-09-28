package Vehicles.concrete;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import Vehicles.ABCCar;
import Vehicles.IWheel;
import Vehicles.MultiWheelDriving;
import Vehicles.SimpleSteering;
import Vehicles.Toyota;
import Vehicles.Wheel;

public class ToyotaCorolaSport extends ABCCar{
	
	public ToyotaCorolaSport() {
		IWheel leftFrontWheel = new Wheel("leftFrontWheel");
		IWheel rightFrontWheel = new Wheel("rightFrontWheel");
		IWheel leftRearWheel = new Wheel("leftRearWheel");
		IWheel rightRearWheel = new Wheel("rightRearWheel");

		List<IWheel> drivingWheels = new LinkedList<IWheel>();
		drivingWheels.add(leftRearWheel);
		drivingWheels.add(rightRearWheel);
		super.driving = new MultiWheelDriving(drivingWheels);

		List<IWheel> steeringWheels = new LinkedList<IWheel>();
		steeringWheels.add(rightFrontWheel);
		steeringWheels.add(leftFrontWheel);
		super.steering = new SimpleSteering(steeringWheels);

		List<IWheel> allWheels = new ArrayList<>(drivingWheels);
		allWheels.addAll(steeringWheels);
		super.wheels = allWheels;

		super.manufacturer = new Toyota();
	}

}
