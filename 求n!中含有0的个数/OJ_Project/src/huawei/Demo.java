package huawei;


public final class Demo {
	
	/*
	����:
	    
	����: 
	    
	���:	����n!���ж��ٸ�0
	     
	����: 
	     
	*/
	public static   int getZeroCount(int n)
	{
		/*������ʵ�ֹ���*/
		int result = 0;
		if(n <= 0){
			return 0;
		}
		result = (int)Math.floor(n / 5);
		return result;
	}
}


