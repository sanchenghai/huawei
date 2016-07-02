package testcase;

import huawei.Demo;


import junit.framework.TestCase;

public class DemoTest extends TestCase {

	public void testCase01()
	{
		assertEquals(1, Demo.isSlurpy("AHDFG"));  
		assertEquals(0, Demo.isSlurpy("DFGAH"));  
	}

}
