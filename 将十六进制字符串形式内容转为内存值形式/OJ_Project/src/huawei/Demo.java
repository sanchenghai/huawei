package huawei;


public final class Demo {

	/* 功能：将十六进制字符串形式内容转为内存值形式（注：pBuffer的内存申请由调用者保证）
	 * 输入：szHexText：十六进制字符串形式，如: "6566"
	 * 输出：dataOutput,其中：内存值形式Buffer，即内存的{0x65, 0x66}
	 * 返回：返回转换成功的buffer的有效字节数
	 */
	
	//坑比较多啊，注意
	public static int[] hexToBin(String szHexText)
	{
	    /* 请实现 */
		if(szHexText == ""){
			return null;
		}
		int length = szHexText.length() / 2;
		int[] result = new int[length];
		String range = "0123456789abcdefABCDEF";
		int i , j = 0;
		CharSequence s;
		String middle = "";
		for(i = 0; i < szHexText.length(); i += 1){
			s = String.valueOf(szHexText.charAt(i));
			if(range.contains(s)){
				middle += s;
				if(middle.length() == 2){
					result[j] = Integer.parseInt(middle, 16);
					j += 1;
					middle = "";
				}
			}
		}
		if(j == 0){
			return null;
		}
		int k;
		int[] returnThis = new int[j];
		for(k = 0; k < j; k += 1){
			returnThis[k] = result[k];
		}
	    return returnThis;
	}





}