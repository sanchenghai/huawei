package testcase;

import huawei.Demo;
import java.util.Arrays;

import junit.framework.TestCase;

public class DemoTest extends TestCase {

	/*基本排序功能*/
	public void testCase01()
	{
	    int array_a[] = {32, 18, 74, 56, -16, 97, -50, -43, -80, 5, 87, 0};
	    int expected[] = {-80, -50, -43, -16, 0, 5, 18, 32, 56, 74, 87, 97};
	

	    int[] actual = Demo.sort(array_a);
	    assertTrue(Arrays.equals(expected, actual));
	    
	}

	
	
	
}
