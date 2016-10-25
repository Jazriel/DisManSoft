package main.java;

import java.util.ArrayList;
import java.util.List;

import main.java.triangles.TriangleFactory;
import main.java.vehicles.ABCCar;
import main.java.vehicles.concrete.MitsubishiOutlander;
import main.java.vehicles.concrete.RenaultMegane;
import main.java.vehicles.concrete.RenaultMeganeSport;
import main.java.vehicles.concrete.ToyotaCorola;
import main.java.vehicles.concrete.ToyotaCorolaSport;
import main.java.vehicles.concrete.Tractor;
import main.java.composite.CompositePart;
import main.java.composite.IPart;
import main.java.composite.Part;
import main.java.iouse.Console;

public class Main {
	public static void main(String args[]){
		String mode = "Composite";
		
		switch (mode) {
		case "Car":
			List<ABCCar> cars = new ArrayList<>();
			cars.add(new ToyotaCorola());
			cars.add(new ToyotaCorolaSport());
			cars.add(new RenaultMegane());
			cars.add(new RenaultMeganeSport());
			cars.add(new MitsubishiOutlander());
			cars.add(new Tractor());
			
			for (ABCCar car : cars) {
				System.out.println("________Accelerate_"+ car.getClass() +"________");
				car.accelerate(5);
				System.out.println("________TurnLeft_"+ car.getClass() +"_______");
				car.turnLeft(5);
				System.out.println("________TurnRight_"+ car.getClass() +"_______");
				car.turnRight(5);
			}
			break;
			
		case "Triangles":
			TriangleFactory tf = new TriangleFactory();
			System.out.print("Equilateral triangle correctly created: ");
			System.out.println(tf.crearTriangulo(10, 10, 10).getDescription().equals("Equilateral"));
			System.out.print("Scalene triangle correctly created: ");
			System.out.println(tf.crearTriangulo(10, 15, 20).getDescription().equals("Scalene"));
			System.out.print("Isosceles triangle correctly created: ");
			System.out.println(tf.crearTriangulo(10, 20, 10).getDescription().equals("Isosceles"));
			break;
			
		case "Console":
			System.out.println("Numero entero");
			System.out.println("		" + Console.readInt());
			System.out.println("Numero double");
			System.out.println("		" + Console.readDouble());
			System.out.println("Numero float");
			System.out.println("		" + Console.readFloat());
			System.out.println("Caracter");
			System.out.println("		" + Console.readChar());
			break;
			
		case "Composite":
			Part tornillo = new Part(34, "Tornillo", "Esta es la descripcion de un tornillo");
			Part valvula = new Part(100, "Valvula", "ESta es la descripcion de una valvula");
			List<IPart> partesValvula = new ArrayList<>();
			partesValvula.add(tornillo);
			partesValvula.add(tornillo);
			CompositePart llanta = new CompositePart(500, "Llanta", "Esto es una llanta", partesValvula);
			List<IPart> partesNeumatico = new ArrayList<>();
			partesNeumatico.add(llanta);
			partesNeumatico.add(valvula);
			CompositePart neumatico = new CompositePart(3000, "Neumatico", "Esto es un neumatico", partesNeumatico);
			System.out.print("Coste de un neumatico: ");
			System.out.println(neumatico.getPrice());
			break;
			
			
		default:
			break;
		}
		
		
	}
}
