package main.java.serialize;

import java.io.Serializable;

public class Employee implements Serializable {


	private static final long serialVersionUID = -160480749762390945L;
	
	
	private String name;
	private double wage;


	public Employee(String _name, double _wage) {
		this.name = _name;
		this.wage = _wage;
	}

	public double getWage() {
		return wage;
	}

	public String getName() {
		return name;
	}

	public void increaseWage(double percentage) {
		this.wage *= percentage/100;
	}
	
	@Override
	public String toString() {
		return "Employee("+this.name+", "+this.wage+");";
	}
	
}
