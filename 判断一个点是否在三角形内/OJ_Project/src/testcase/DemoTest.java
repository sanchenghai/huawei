package testcase;


import huawei.Demo;
import huawei.POINT;
import junit.framework.TestCase;

public class DemoTest extends TestCase {
	
	//ֱ��б����
	public void testCase01()
	{	
		POINT A=new POINT(0,0);
		POINT B=new POINT(0,80);
		POINT C=new POINT(80,0);
		POINT P=new POINT(20,60);

		assertEquals(true,Demo.isInTriangle(A, B, C, P));
	}
		//ֱ��б����
	public void testCase02()
	{	
		POINT A=new POINT(0,0);
		POINT B=new POINT(0,80);
		POINT C=new POINT(80,0);
		POINT P=new POINT(21,60);

		assertEquals(false,Demo.isInTriangle(A, B, C, P));
	}
	
	
}