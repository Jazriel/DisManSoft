package Vehicles.concrete;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import Vehicles.ABCCar;
import Vehicles.IDriving;
import Vehicles.IManufacturer;
import Vehicles.ISteering;
import Vehicles.IWheel;
import Vehicles.MultiWheelDriving;
import Vehicles.SimpleSteering;
import Vehicles.Wheel;

public class RenaultMegane extends ABCCar {

	public RenaultMegane() {
		super();
		IWheel leftFrontWheel = new Wheel();
		IWheel rightFrontWheel = new Wheel();
		IWheel leftRearWheel = new Wheel();
		IWheel rightRearWheel = new Wheel();
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
		temporalWheels.add(leftRearWheel);
		temporalWheels.add(rightRearWheel);
		super.wheels = temporalWheels;
	}

}
