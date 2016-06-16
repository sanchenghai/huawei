package testcase;

import junit.framework.TestCase;
import huawei.Demo;


public class DemoTest extends TestCase
{	
	public void testCase01()
	{
		Demo demo = new Demo();
		StringBuffer buffer = new StringBuffer();
		demo.checkIP("0092.12.1.1", buffer);
		assertEquals("NO", buffer.toString());
	}
		
	public void testCase02()
	{
		Demo demo = new Demo();
		StringBuffer buffer = new StringBuffer();
		demo.checkIP("192.168.0.0", buffer);
		assertEquals("YES", buffer.toString());
	}
}
