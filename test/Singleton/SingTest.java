package Singleton;

import static org.junit.Assert.*;

import org.junit.Test;
import Singleton.Sing;

public class SingTest {

	@Test
	public void testGetInstance() {
		assertTrue(Sing.getInstance()==Sing.getInstance());
	}
	
}
