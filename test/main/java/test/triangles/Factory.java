package main.java.test.triangles;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.java.triangles.TriangleFactory;

public class Factory {

	private TriangleFactory tf;
	
	@Before
	public void createTriangleFactory(){
		tf = new TriangleFactory();
	}
	
	
	@Test
	public void test() {
		assertTrue(tf.crearTriangulo(10, 10, 10).getDescription().equals("Equilateral"));
		assertTrue(tf.crearTriangulo(10, 20, 10).getDescription().equals("Isosceles"));
		assertTrue(tf.crearTriangulo(10, 15, 20).getDescription().equals("Scalene"));
	}

}
