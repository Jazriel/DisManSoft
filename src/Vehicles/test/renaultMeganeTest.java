package Vehicles.test;

import org.junit.Before;
import org.junit.Test;

import Vehicles.ABCCar;
import Vehicles.concrete.RenaultMegane;

public class renaultMeganeTest {

	private ABCCar renMeg;
	
	@Before
	public void createRM(){
		renMeg = new RenaultMegane();
	}
	
	@Test
	public void test() {
		System.out.println("---Accelerate:---");
		renMeg.accelerate(10);
		System.out.println("---TurnLeft---");
		renMeg.turnLeft(10);
		System.out.println("---TurnLeft---");
		renMeg.turnRight(20);
	}

}
