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
		System.out.println("accelerate "+name);
		velocity += km;
	}

	@Override
	public void setAngle(double degrees) {
		angle = degrees;
		System.out.println(name + " rotates to " + (new Double(angle)).toString());
	}

	public double getVelocity() {
		return velocity;
	}

	public double getAngle() {
		return angle;
	}
}
