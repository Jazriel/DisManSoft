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
	
	@Test
	public void testPrintQueue() {
		printer.add("doc");
		assertTrue(printer.getImprQueue().equals(PrinterSingleton.getInstance().getImprQueue()));
	}
	
	@Test
	public void testPrintQueueDiffHashes() {
		printer.add("doc");
		assertFalse(printer.getImprQueue()==PrinterSingleton.getInstance().getImprQueue());
	}
	
}
