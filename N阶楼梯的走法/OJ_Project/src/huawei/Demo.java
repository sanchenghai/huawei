package huawei;

public final class Demo {
	
	/* 功能：
	 * 输入：n
	 * 输出：
	 * 返回：N阶楼梯的走法
	 */
	public static long  stairs(int n)
	{
		/*在这里完成代码*/
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


