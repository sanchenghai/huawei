package testcase;

import huawei.Demo;
import junit.framework.TestCase;


public class DemoTest extends TestCase{

	// 测试用例实现示例
	Demo oj = new Demo();

	public void testCase01() {
		StringBuilder str = new StringBuilder();
		int result = oj.helpWatcherEscape(39, 200, 4, str);

		assertEquals(str.toString(), "No");
		assertEquals(197, result);
	}
}
