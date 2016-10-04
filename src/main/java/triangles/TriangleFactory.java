package main.java.triangles;

public class TriangleFactory {
	public ITriangle crearTriangulo(int side1, int side2, int side3) {
		if (side1 == side2 && side2 == side3) {
			return new Equilateral();
		}
		if (side2 == side3||side1 == side2 || side1 == side3) {
			return new Isosceles();
		}
		return new Scalene();
	}
}
