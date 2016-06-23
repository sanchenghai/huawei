package testcase;

import huawei.Demo;

import java.io.File;
import java.util.Arrays;

import junit.framework.Assert;
import junit.framework.TestCase;

public class DemoTest extends TestCase {
	private final static String TEST_PATH = System.getProperty("user.dir")
			+ File.separator + "src" + File.separator + "testcase"
			+ File.separator;

	/**
	 * 一维数组转二维
	 * 
	 * @param one
	 * @param two
	 * @param row
	 * @param col
	 */
	private void array1to2(int[] one, int[][] two) {
		if (null == one) {
			return;
		}
		int row = two.length;
		int col = two[0].length;

		if (one.length < row * col) {
			return;
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				two[i][j] = one[i * col + j];
			}
		}
	}

	public void testCase01() {
		File file = new File(TEST_PATH + "testcase_01.txt");
		Demo demo = new Demo();
		int[][] realvalue_11 = { { 11, 0 }, { 11, 0 }, { 1, 1 } };
		int[][] realvalue_21 = { { 21, 0 }, { 2, 1 } };
		int[][] relt_11 = new int[3][2];
		int[][] relt_21 = new int[2][2];
		demo.scoreresult(file, relt_11, relt_21);
		Assert.assertTrue(Arrays.deepEquals(realvalue_11, relt_11));
		Assert.assertTrue(Arrays.deepEquals(realvalue_21, relt_21));
	}

	public void testCase02() {
		File file = new File(TEST_PATH + "testcase_02.txt");
		Demo demo = new Demo();
		int[][] realvalue_11 = new int[122][2];
		int[] temp11 = { 11, 3, 11, 2, 11, 2, 11, 4, 11, 9, 11, 0, 11, 7, 11,
				4, 11, 9, 11, 4, 11, 3, 11, 5, 11, 8, 11, 9, 11, 6, 11, 5, 11,
				8, 11, 4, 11, 3, 11, 3, 11, 4, 11, 9, 11, 1, 11, 7, 11, 6, 11,
				4, 11, 3, 11, 8, 12, 10, 11, 4, 11, 4, 11, 3, 11, 6, 11, 7, 11,
				2, 11, 3, 11, 8, 11, 3, 12, 10, 11, 5, 11, 7, 11, 8, 9, 11, 11,
				4, 11, 3, 11, 7, 11, 5, 11, 8, 11, 2, 11, 9, 11, 7, 11, 5, 11,
				1, 11, 7, 11, 6, 11, 6, 12, 10, 11, 4, 11, 9, 7, 11, 11, 2, 11,
				8, 11, 5, 11, 3, 11, 9, 11, 7, 11, 9, 11, 2, 9, 11, 11, 3, 11,
				3, 8, 11, 11, 1, 11, 2, 11, 4, 11, 5, 11, 4, 11, 1, 11, 6, 11,
				4, 11, 7, 11, 4, 11, 4, 11, 7, 8, 11, 11, 6, 11, 5, 11, 3, 11,
				2, 16, 18, 11, 7, 11, 4, 11, 7, 11, 5, 11, 3, 14, 12, 11, 3,
				11, 3, 11, 3, 11, 7, 11, 8, 11, 4, 11, 4, 11, 5, 11, 6, 11, 9,
				11, 0, 11, 7, 11, 6, 12, 10, 11, 4, 11, 2, 11, 2, 11, 5, 11, 8,
				11, 9, 11, 3, 11, 4, 11, 5, 11, 7, 11, 5, 2, 0 };
		array1to2(temp11, realvalue_11);

		int[][] realvalue_21 = new int[64][2];
		int[] temp21 = { 21, 4, 21, 6, 21, 10, 21, 10, 21, 11, 21, 6, 21, 18,
				21, 11, 21, 13, 21, 6, 21, 7, 21, 10, 21, 12, 21, 8, 21, 17,
				21, 6, 21, 10, 21, 9, 21, 5, 21, 11, 21, 15, 21, 15, 21, 15,
				21, 10, 21, 12, 21, 6, 21, 16, 21, 9, 21, 8, 21, 15, 21, 13,
				21, 17, 21, 11, 21, 10, 21, 17, 21, 12, 21, 7, 21, 11, 21, 8,
				21, 7, 21, 7, 21, 11, 21, 8, 21, 16, 21, 13, 21, 5, 22, 20, 21,
				12, 21, 9, 21, 14, 21, 7, 21, 7, 21, 12, 21, 11, 21, 9, 21, 8,
				21, 13, 21, 13, 21, 4, 21, 13, 21, 10, 21, 10, 21, 11, 7, 2 };
		array1to2(temp21, realvalue_21);

		int[][] relt_11 = new int[122][2];
		int[][] relt_21 = new int[64][2];
		demo.scoreresult(file, relt_11, relt_21);
		Assert.assertTrue(Arrays.deepEquals(realvalue_11, relt_11));
		Assert.assertTrue(Arrays.deepEquals(realvalue_21, relt_21));
	}

	
}