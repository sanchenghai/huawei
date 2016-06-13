package testcase;

import junit.framework.TestCase;
import huawei.Demo;

public class DemoTest extends TestCase {

	public void testCase01() {
		Demo demo = new Demo();
		int result = demo.NumType("123.456");
		assertEquals(0, result);
	}

	public void testCase2() {
		Demo demo = new Demo();
		int result = demo.NumType("123a");
		assertEquals(-1, result);
	}

	public void testCase3() {
		// 在此添加用例
	}
}
