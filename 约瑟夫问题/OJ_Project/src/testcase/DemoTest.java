package testcase;

import huawei.Demo;


import junit.framework.TestCase;

public class DemoTest extends TestCase {

	public void testCase01()
	{
		assertEquals(5, Demo.getMinimumM(3));  
                assertEquals(30, Demo.getMinimumM(4));  
	}
	
}
