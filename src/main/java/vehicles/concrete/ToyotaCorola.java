package main.java.vehicles.concrete;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import main.java.vehicles.ABCCar;
import main.java.vehicles.IWheel;
import main.java.vehicles.MultiWheelDriving;
import main.java.vehicles.SimpleSteering;
import main.java.vehicles.Toyota;
import main.java.vehicles.Wheel;

public class ToyotaCorola extends ABCCar {

	public ToyotaCorola() {
		IWheel leftFrontWheel = new Wheel("leftFrontWheel");
		IWheel rightFrontWheel = new Wheel("rightFrontWheel");
		IWheel leftRearWheel = new Wheel("leftRearWheel");
		IWheel rightRearWheel = new Wheel("rightRearWheel");

		List<IWheel> drivingWheels = new LinkedList<IWheel>();
		drivingWheels.add(leftFrontWheel);
		drivingWheels.add(rightFrontWheel);
		super.driving = new MultiWheelDriving(drivingWheels);

		List<IWheel> steeringWheels = new LinkedList<IWheel>();
		steeringWheels.add(rightFrontWheel);
		steeringWheels.add(leftFrontWheel);
		super.steering = new SimpleSteering(steeringWheels);

		List<IWheel> allWheels = new ArrayList<>(drivingWheels);
		allWheels.add(leftRearWheel);
		allWheels.add(rightRearWheel);
		super.wheels = allWheels;

		super.manufacturer = new Toyota();
	}
}
