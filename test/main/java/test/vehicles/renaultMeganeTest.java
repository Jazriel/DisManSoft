package main.java.test.vehicles;

import org.junit.Before;
import org.junit.Test;

import main.java.vehicles.ABCCar;
import main.java.vehicles.concrete.RenaultMegane;

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
