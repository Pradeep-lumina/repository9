package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample3 {
	
	@Test (groups="sanity")
	public void testA() {		
		Assert.assertEquals("Gmail", "Gmail");
	}	
	@Test (priority=1)
	public void testC() {		
		Assert.assertEquals("Google", "Google");
	}	
	@Test (groups="smoke")
	public void testB() {		
		Assert.assertEquals("Yahoo", "Yahoo");
	}


}
