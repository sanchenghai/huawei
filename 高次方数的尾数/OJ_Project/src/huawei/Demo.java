package huawei;

import java.math.BigInteger;

public final class Demo {
	/*
	����: ���M��N�η��������λ��(M��N������10)
	���������
	    int M��M > 10
	    int N��N > 10
	����ֵ��
	    M��N�η��������λ��
	*/

	public static int getLast3DigitsOfMN(int M, int N)
	{
	    /*������ʵ�ֹ���*/
		/***
		��֪��BigInteger�������Ƕ��٣������������������ˣ�Ҫע���ر�����
		�ñʼǱ�����һ�£�������ķ���
		
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


