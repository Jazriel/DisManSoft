package Vehicles.concrete;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import Vehicles.ABCCar;
import Vehicles.IManufacturer;
import Vehicles.IWheel;
import Vehicles.MultiWheelDriving;
import Vehicles.SimpleSteering;
import Vehicles.Wheel;

public class RenaultMegane extends ABCCar {

	public RenaultMegane() {
		IWheel leftFrontWheel = new Wheel("leftFront");
		IWheel rightFrontWheel = new Wheel("rightFront");
		IWheel leftRearWheel = new Wheel("leftRearWheel");
		IWheel rightRearWheel = new Wheel("rightRearWheel");
		List<IWheel> temporalWheels = new LinkedList<IWheel>();
		temporalWheels.add(rightFrontWheel);
		temporalWheels.add(leftFrontWheel);
		super.driving = new MultiWheelDriving(temporalWheels);
		super.manufacturer = new IManufacturer() {
			@Override
			public String name() {
				return "RenaultMegane";
			}
		};
		super.steering = new SimpleSteering(temporalWheels);
		List<IWheel> allWheels = new ArrayList<>(temporalWheels);
		
		allWheels.add(leftRearWheel);
		allWheels.add(rightRearWheel);
		super.wheels = allWheels;
	}

}
