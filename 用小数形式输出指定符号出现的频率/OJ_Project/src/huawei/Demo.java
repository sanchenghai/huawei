package huawei;

public final class Demo {

	
	/*
	功能: 输入的基准字符串中统计指定字符出现的频率
	      字符串仅包括英文大小写字母和空格、逗号、点号
		  小数点后保留2位有效数字，第三位四舍五入

	输入: String pString  输入的基准字符串
		 char c 指定的字符
	
	返回: 输出指定字符出现的频率
	*/

	public static float getRateFromString(String pString, char c)
	{		
		int num = 0, length = pString.length(), i;
		for(i = 0; i < length; i += 1){
			if(pString.charAt(i) == c){
				num += 1;
			}
		}
		double db = (double) 100 * num / length;
		float result = (float)Math.round(db) / 100;
		return result;	
	}

}