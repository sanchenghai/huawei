package testcase;


import huawei.Demo;
import junit.framework.TestCase;

public class DemoTest extends TestCase {

	public void testCase01() 
	{	
		String str="wo shi, yi zhi.xiao xiao niao";
		float Rate= Demo.getRateFromString(str, ' ');
	    
	    assertEquals(0.17f ,Rate, 0.0001);
	    return;
	}
	
}