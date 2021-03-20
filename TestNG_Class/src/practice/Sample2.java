package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample2 {
	
	@Test(groups="sanity")
	public void testA() {		
		Assert.assertEquals("Gmail", "Gmail");
	}	
	@Test(groups="smoke")
	public void testC() {		
		Assert.assertEquals("Google", "Google");
	}	
	@Test
	public void testB() {		
		Assert.assertEquals("Yaho", "Yahoo");
	}


}
