package huawei;

import java.math.BigDecimal;


public final class Demo {
	/*****************************************************************************
	Description  : �������ⳤ�ȵ��������
	Input Param  : String minuend   ����������\0��ʾ�ַ�������
	               String subtrahend  ��������\0��ʾ�ַ�������
	Return Value :  ���������������\0��ʾ�ַ�������
	*****************************************************************************/
	public static String decrease(String minuend,String subtrahend )
	{

	    /* ������ʵ�ֹ��� */
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