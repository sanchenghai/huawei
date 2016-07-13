package huawei;

import java.util.ArrayList;


public final class Demo {

    /**
     * 连续输入字符串(输出次数为N,字符串长度小于100)，
     * 请按长度为8拆分每个字符串后输出到新的字符串数组，
     * 长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
     */
    public static String[] splitString(String[] input)
    {
        // TODO: Write Code Here
    	if(input[0] == ""){
			return null;
		}
		ArrayList<String> list = new ArrayList<String>();
		list.clear();
		int i, j, k, len;
		String str = "";
		for(i = 0; i < input.length; i += 1){
			if(input[i].contentEquals("")){
				break;
			}
			len = input[i].length();
			if(len < 9){
				str = input[i];
				for(j = 0; j < 8 - len; j += 1){
					str += "0";
				}
				list.add(str);
			}else{
				for(j = 0; j < len; ){
					if(j + 8 < len){
						list.add(input[i].substring(j, j + 8));
						j += 8;
					}else{
						str = input[i].substring(j, len);
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

    	//        return new String[0];
    }

	
}


