package jnuitTesting;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class Testing {
	
	@Test
	public  void m1() {
		int a=10;
		assertEquals(10,a);	
		assertNotNull(a);
	}

}
