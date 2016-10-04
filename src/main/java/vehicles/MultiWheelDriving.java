package main.java.vehicles;

import java.util.List;

public class MultiWheelDriving implements IDriving {
	
	private List<IWheel> wheels;
	
	public MultiWheelDriving(List<IWheel> wheels) {
		this.wheels = wheels;
	}
	
	@Override
	public void accelerate(double km) {
		for (IWheel wheel : wheels) {
			wheel.accelerate(km);
		}
	}
}
