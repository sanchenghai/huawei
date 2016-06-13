package testcase;

import huawei.Demo;

import junit.framework.TestCase;

public class DemoTest extends TestCase {
	public void testCase01() {
		assertEquals(253, Demo.getLast3DigitsOfMN(13, 13));

	}
}
