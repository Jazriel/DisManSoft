package Singleton;

import static org.junit.Assert.*;

import org.junit.Test;
import Singleton.PrinterSingleton;

public class SingTest {

	@Test
	public void testGetInstance() {
		IPrinter pr = PrinterSingleton.getInstance();
		assertTrue(pr==PrinterSingleton.getInstance());
	}
	
}
