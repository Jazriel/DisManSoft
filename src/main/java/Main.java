package main.java;

import java.util.ArrayList;
import java.util.List;

import Vehicles.ABCCar;
import Vehicles.concrete.MitsubishiOutlander;
import Vehicles.concrete.RenaultMegane;
import Vehicles.concrete.RenaultMeganeSport;
import Vehicles.concrete.ToyotaCorola;
import Vehicles.concrete.ToyotaCorolaSport;
import Vehicles.concrete.Tractor;

public class Main {
	public static void main(String args[]){
		List<ABCCar> cars = new ArrayList<>();
		cars.add(new ToyotaCorola());
		cars.add(new ToyotaCorolaSport());
		cars.add(new RenaultMegane());
		cars.add(new RenaultMeganeSport());
		cars.add(new MitsubishiOutlander());
		cars.add(new Tractor());
		
		for (ABCCar car : cars) {
			System.out.println("________Acelera_"+ car.getClass() +"________");
			car.accelerate(5);
			System.out.println("________Gira_"+ car.getClass() +"_izda_______");
			car.turnLeft(5);
			System.out.println("________Gira_"+ car.getClass() +"_drch_______");
			car.turnRight(5);
		}
		
	}
}
