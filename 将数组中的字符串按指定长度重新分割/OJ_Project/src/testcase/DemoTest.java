package testcase;


import huawei.Demo;
import junit.framework.TestCase;

public class DemoTest extends TestCase {
	
	public void testCase01()
	{
		String [] arrStringInPut={"abc","123456789"};
		
		 String[] output= Demo.convertStringArray(arrStringInPut, 8);
	    assertEquals("abc00000", output[0]);
	    assertEquals("12345678", output[1]);
	    assertEquals("90000000", output[2]);
	}

	
}


