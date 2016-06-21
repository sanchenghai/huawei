package testcase;


import huawei.Demo;
import junit.framework.TestCase;

public class DemoTest extends TestCase {
	
	public void testCase01()
	{	
		assertEquals(3,Demo.stairs(3));
	}	
	
}