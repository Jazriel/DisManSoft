package Vehicles;

public class Wheel implements IWheel {

	private String name;
	private double velocity;
	private double angle;

	public Wheel(String name) {
		velocity = 0;
		angle = 0;
		this.name = name;
	}
	
	@Override
	public void accelerate(double km) {
		System.out.println(name);
		velocity += km;
	}

	@Override
	public void setAngle(double degrees) {
		System.out.println(name);
		angle = degrees;
	}

	public double getVelocity() {
		return velocity;
	}

	public double getAngle() {
		return angle;
	}
}
