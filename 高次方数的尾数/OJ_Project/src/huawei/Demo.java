package huawei;

import java.math.BigInteger;

public final class Demo {
	/*
	功能: 求解M的N次方的最后三位数(M，N均大于10)
	输入参数：
	    int M：M > 10
	    int N：N > 10
	返回值：
	    M的N次方的最后三位数
	*/

	public static int getLast3DigitsOfMN(int M, int N)
	{
	    /*在这里实现功能*/
		/***
		不知道BigInteger的上限是多少，反正测试用例过不了，要注意特别大的数
		用笔记本试了一下，风扇响的飞起
		
		BigInteger mNumber = new BigInteger(String.valueOf(M));
		BigInteger bigNum = mNumber.pow(N);
		BigInteger thousand = new BigInteger("1000");
		BigInteger smallNum = bigNum.divide(thousand).multiply(thousand).negate();
		int result = bigNum.add(smallNum).intValue();
		System.out.println(bigNum);
		System.out.println(smallNum);
		System.out.println(result);
		return result;
		***/
		
		int i, result = 1;
		for(i = 0; i < N; i += 1){
			result = (result * (M % 1000)) % 1000;
		}
		return result;
	}

}


