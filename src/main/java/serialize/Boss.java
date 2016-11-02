package main.java.serialize;

import java.io.Serializable;

public class Boss extends Employee implements Serializable{
	
	private static final long serialVersionUID = -7371310745244471379L;
	private double bonus;

	public Boss(String name, double wage, double _bonus) {
		super(name, wage);
		this.bonus = _bonus;
	}
	
	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public String toString() {
		return super.toString()+"Boss("+this.bonus+");";		
	}
	
}
