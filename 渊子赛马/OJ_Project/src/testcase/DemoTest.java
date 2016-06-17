package testcase;

import huawei.Demo;
import junit.framework.TestCase;


public class DemoTest extends TestCase{

	// 测试用例实现示例
	Demo oj = new Demo();

	public void testCase01() {
		int horseNum = 5;
		int[] speedYuanzi = { 2, 3, 3, 4, 5 };
		int[] speedOpp = { 1, 2, 3, 4, 5 };
		String aResult = oj.isYuanziWin(horseNum, speedYuanzi, speedOpp);

		assertEquals(aResult, "YES");
	}

	public void testCase02() {
		int horseNum = 4;
		int[] speedYuanzi = { 2, 2, 1, 2 };
		int[] speedOpp = { 2, 2, 3, 1 };
		String aResult = oj.isYuanziWin(horseNum, speedYuanzi, speedOpp);

		assertEquals(aResult, "NO");
	}
}
