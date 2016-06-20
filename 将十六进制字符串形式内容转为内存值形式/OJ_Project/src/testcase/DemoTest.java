package testcase;

import huawei.Demo;
import java.util.Arrays;
import junit.framework.TestCase;

public class DemoTest extends TestCase {

	public void testCase01() {
		int[] expectedBuffer = { 0x65, 0x66 };
		assertTrue(Arrays.equals(Demo.hexToBin("6566"), expectedBuffer));
	}

	public void testCase02() {
		int[] expectedBuffer = null;
		assertTrue(Arrays.equals(Demo.hexToBin(""), expectedBuffer));
	}

	
}
