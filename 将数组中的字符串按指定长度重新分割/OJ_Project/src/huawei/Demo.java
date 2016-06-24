package huawei;

import java.util.ArrayList;


public final class Demo {
	/*
	����:���дһ������������Ϊһ���ַ������飬
	�밴ָ������iInputLenth��������е�ÿ���ַ�����������µ��ַ��������С����Ȳ���iInputLenth���������ַ������ں��油����0��
	���ַ����������������ַ������ʾ����������������ء�
	����:
	    String inputStrArray     �ַ�������ָ�� �ַ����������Ϊ50,�ַ����������255
	    int iInputLenth   ָ���ķָ�� iInputLenth>=1 && <=32 
	     
	����:�ַ�������ָ��     

	ʾ�� ������8���
	���룺 abc 
	       12345789 
	���أ� abc00000
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