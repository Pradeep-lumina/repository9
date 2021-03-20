package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample4 {
	
	@Test (groups="smoke")
	public void testA() {		
		Assert.assertEquals("Gmail", "Gmail");
	}	
	@Test (groups="sanity")
	public void testC() {		
		Assert.assertEquals("Googl", "Google");
	}	
	@Test (dependsOnMethods="testC", alwaysRun=true)
	public void testB() {		
		Assert.assertEquals("Yahoo", "Yahoo");
	}

}
