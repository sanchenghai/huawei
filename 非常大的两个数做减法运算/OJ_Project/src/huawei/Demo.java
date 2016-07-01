package huawei;

import java.math.BigDecimal;


public final class Demo {
	/*****************************************************************************
	Description  : 两个任意长度的正数相减
	Input Param  : String minuend   被减数，以\0表示字符串结束
	               String subtrahend  减数，以\0表示字符串结束
	Return Value :  减法结果，必须以\0表示字符串结束
	*****************************************************************************/
	public static String decrease(String minuend,String subtrahend )
	{

	    /* 在这里实现功能 */
		BigDecimal m = new BigDecimal(minuend);
		BigDecimal n = new BigDecimal(subtrahend);
		String res = m.add(n.negate()).toString();
		res = removeZero(res);
	    return res;

	}
	
	public static String removeZero(String str){
		if(str.contains(".")){
			if(str.charAt(str.length()-1) == '0' || str.charAt(str.length()-1) == '.'){
				str = str.substring(0, str.length()-1);
				return removeZero(str);
			}
		}
		return str;
	}


}