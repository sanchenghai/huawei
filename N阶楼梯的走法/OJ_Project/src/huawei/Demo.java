package huawei;

public final class Demo {
	
	/* ���ܣ�
	 * ���룺n
	 * �����
	 * ���أ�N��¥�ݵ��߷�
	 */
	public static long  stairs(int n)
	{
		/*��������ɴ���*/
		if(n <= 0 ){
			return 0;
		}
		long result = fib(n);
	    return result;
	}
	
	public static long fib(int n){
		if(n <=2){
			return n;
		}
		return fib(n - 1) + fib(n - 2);
	}
}


