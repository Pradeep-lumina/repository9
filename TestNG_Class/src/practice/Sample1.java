package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample1 {
	
	@Test (groups="smoke")
	public void testA() {		
		Assert.assertEquals("Gmail", "Gmail");
	}	
	@Test (groups={"sanity","smoke"})
	public void testC() {		
		Assert.assertEquals("Google", "Google");
	}	
	@Test
	public void testB() {		
		Assert.assertEquals("Yahoo", "Yahoo");
	}

}
