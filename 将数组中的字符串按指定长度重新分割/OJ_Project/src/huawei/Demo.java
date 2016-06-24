package huawei;

import java.util.ArrayList;


public final class Demo {
	/*
	功能:请编写一个函数，输入为一个字符串数组，
	请按指定长度iInputLenth拆分数组中的每个字符串，输出到新的字符串数组中。长度不是iInputLenth整数倍的字符串请在后面补数字0。
	空字符串不处理，遇到空字符串则表示数组结束，函数返回。
	输入:
	    String inputStrArray     字符串数组指针 字符串个数最大为50,字符串长度最大255
	    int iInputLenth   指定的分割长度 iInputLenth>=1 && <=32 
	     
	返回:字符串数组指针     

	示例 按长度8拆分
	输入： abc 
	       12345789 
	返回： abc00000
	       12345678
	       90000000

	*/

	public static String[] convertStringArray(String[] inputStrArray, int iInputLenth)
	{
		if(inputStrArray[0] == ""){
			return null;
		}
		ArrayList<String> list = new ArrayList<String>();
		list.clear();
		int i, j, k, len;
		String str = "";
		for(i = 0; i < inputStrArray.length; i += 1){
			if(inputStrArray[i].contentEquals("")){
				break;
			}
			len = inputStrArray[i].length();
			if(len < 9){
				str = inputStrArray[i];
				for(j = 0; j < 8 - len; j += 1){
					str += "0";
				}
				list.add(str);
			}else{
				for(j = 0; j < len; ){
					if(j + 8 < len){
						list.add(inputStrArray[i].substring(j, j + 8));
						j += 8;
					}else{
						str = inputStrArray[i].substring(j, len);
						for(k = 0; k < 8 - len + j; k += 1){
							str += "0";
						}
						list.add(str);
						j = len;
					}
				}
				
			}
		}
		String res[] = new String[list.size()];
		for(i = 0; i < list.size(); i += 1){
			res[i] = list.get(i);
//			System.out.println(res[i]);
		}
	    return res;
	}





}