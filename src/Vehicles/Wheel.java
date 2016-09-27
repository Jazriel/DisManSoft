package Vehicles;

public class Wheel implements IWheel {

	private double velocity;
	private double angle;

	public Wheel() {
		velocity = 0;
		angle = 0;
	}

	@Override
	public void accelerate(double km) {
		velocity += km;
	}

	@Override
	public void setAngle(double degrees) {
		angle = degrees;
	}

	public double getVelocity() {
		return velocity;
	}

	public double getAngle() {
		return angle;
	}
}
