package Vehicles.concrete;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import Vehicles.ABCCar;
import Vehicles.IWheel;
import Vehicles.InverseSteering;
import Vehicles.JohnDeere;
import Vehicles.MultiWheelDriving;
import Vehicles.Wheel;

public class Tractor extends ABCCar {
	public Tractor(){
		IWheel leftFrontWheel = new Wheel("leftFrontWheel");
		IWheel rightFrontWheel = new Wheel("rightFrontWheel");
		IWheel leftRearWheel = new Wheel("leftRearWheel");
		IWheel rightRearWheel = new Wheel("rightRearWheel");

		List<IWheel> drivingWheels = new LinkedList<IWheel>();
		drivingWheels.add(leftRearWheel);
		drivingWheels.add(rightRearWheel);
		drivingWheels.add(rightFrontWheel);
		drivingWheels.add(leftFrontWheel);
		super.driving = new MultiWheelDriving(drivingWheels);

		List<IWheel> simpleSteeringWheels = new LinkedList<>();
		simpleSteeringWheels.add(rightFrontWheel);
		simpleSteeringWheels.add(leftFrontWheel);
		List<IWheel> inverseSteeringWheels = new LinkedList<>();
		inverseSteeringWheels.add(leftRearWheel);
		inverseSteeringWheels.add(rightRearWheel);
		super.steering = new InverseSteering(simpleSteeringWheels, inverseSteeringWheels);

		List<IWheel> allWheels = new ArrayList<>(drivingWheels);
		super.wheels = allWheels;

		super.manufacturer = new JohnDeere();
	}
}
