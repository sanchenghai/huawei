package testcase;

import huawei.Demo;

import junit.framework.TestCase;

public class DemoTest extends TestCase {
	//用例1:
	public void testCase01() {
		String minuend = "85";
		String subtrahend = "79";
		String result = Demo.decrease(minuend, subtrahend);
		assertEquals(result, "6");

	}

	// 用例2:
	public void testCase02() {
		String minuend = "8.5";
		String subtrahend = "0.91";
		String result = Demo.decrease(minuend, subtrahend);
		assertEquals(result, "7.59");

	}

	// 用例3:
	public void testCase03() {
		String minuend = "8.5";
		String subtrahend = "7.5";
		String result = Demo.decrease(minuend, subtrahend);
		assertEquals(result, "1");

	}

	// 用例4:
	public void testCase04() {
		String minuend = "12.34";
		String subtrahend = "17.24";

		String result = Demo.decrease(minuend, subtrahend);
		assertEquals(result, "-4.9");

	}

	
}
