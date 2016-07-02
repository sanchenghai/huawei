package huawei;


public final class Demo {
	
	/*
	功能: 根据一组规则识别一个特定的字符串是常见的计算机问题，

	定义了如下三种字符串类型：

	Slump是一串字符，具有如下性质：
	    1.以'D'或'E'开始
	    2.第一个字符后由1个或多个'F'
	    3.之后跟着一个Slump或'G'，至此一个Slump结束。
	    4.其他的都不是Slump

	例如，DFFEFFFG是Slump

	Slimp是一串字符，具有如下性质：
	    1.第一个字符是'A'
	    2.如果Slimp只有2个字符，则第二个字符是'H'
	    3.如果大于2个字符，则可能有2种形式
	        a) 'A'后接一个'B'再接一个Slimp再接一个'C'
	        b) 'A'后接一个Slump再接一个'C'
	    4.其他的都不是Slimp

	Slurpy是一个Slimp后接一个Slump组成

	请编写程序判断一个字符串是否为Slurpy

	输入: 一个字符串
	    
	输出: 无
	     
	返回: 1，是Slurpy
	      0，不是
	     
	*/

	public static int  isSlurpy(String str)
	{
		/*在这里实现功能*/
		if(str.charAt(0) != 'A'){
			return 0;
		}
		if(str.charAt(1) == 'H'){
			return isSlump(str.substring(2));
		}else if(str.charAt(1) == 'B'){
			return isSlurpy(str.substring(2));
		}else{
			if(str.indexOf("C") < 4 || str.indexOf("C") > str.length() - 4){
				return 0;
			}
			int beforeC = 0, afterC = 0;
			beforeC = isSlump(str.substring(1,str.indexOf("C")));
			afterC = isSlump(str.substring(str.indexOf("C") + 1));
			if(beforeC + afterC == 2){
				return 1;
			}
		}
		return 0;
	}
	
	public static int isSlump(String str){
		if(str.charAt(0) != 'D' && str.charAt(0) != 'E'){
			return 0;
		}
		if(str.charAt(1) != 'F'){
			return 0;
		}
		if(str.charAt(str.length() - 1) != 'G'){
			return 0;
		}
		int i;
		for(i = 2; i < str.length(); i += 1){
			if(str.charAt(i) != 'F'){
				String strSlump = str.substring(i);
				if(strSlump.length() == 1){
					return 1;
				}
				return isSlump(strSlump);
			}
		}
		return 0;
	}
	
}


