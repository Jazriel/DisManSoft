package Singleton;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import Singleton.PrinterSingleton;

public class SingTest {

	private IPrinter printer;
	
	@Before
	public void beforeTests(){
		printer = PrinterSingleton.getInstance();
	}
	
	
	@Test
	public void testGetInstance() {
		assertTrue(printer==PrinterSingleton.getInstance());
	}
	
}
