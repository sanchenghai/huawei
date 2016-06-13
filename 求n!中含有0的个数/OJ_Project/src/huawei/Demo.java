package huawei;


public final class Demo {
	
	/*
	功能:
	    
	输入: 
	    
	输出:	计算n!中有多少个0
	     
	返回: 
	     
	*/
	public static   int getZeroCount(int n)
	{
		/*在这里实现功能*/
		int result = 0;
		if(n <= 0){
			return 0;
		}
		result = (int)Math.floor(n / 5);
		return result;
	}
}


