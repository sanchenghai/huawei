package huawei;

/**
 * 
 * @param String s 输入字符串
 * 
 * @description： 
 *     判断字符串是否是有效数字，是返回0，不是返回-1
 *    
 * @example:
 *     123.456 是有效数字，返回0
 *     123a 不是有效数字，返回-1
 * 
 */
public class Demo
{
	public int NumType(String s)
	{
		try{
			double result = Double.valueOf(s);
			if(Double.isNaN(result)){
				return -1;
			}
			return 0;
		}catch(Exception e){
			return -1;
		}
		
	}
}
