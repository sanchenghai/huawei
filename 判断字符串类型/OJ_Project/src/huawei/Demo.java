package huawei;


public final class Demo {
	
	/*
	����: ����һ�����ʶ��һ���ض����ַ����ǳ����ļ�������⣬

	���������������ַ������ͣ�

	Slump��һ���ַ��������������ʣ�
	    1.��'D'��'E'��ʼ
	    2.��һ���ַ�����1������'F'
	    3.֮�����һ��Slump��'G'������һ��Slump������
	    4.�����Ķ�����Slump

	���磬DFFEFFFG��Slump

	Slimp��һ���ַ��������������ʣ�
	    1.��һ���ַ���'A'
	    2.���Slimpֻ��2���ַ�����ڶ����ַ���'H'
	    3.�������2���ַ����������2����ʽ
	        a) 'A'���һ��'B'�ٽ�һ��Slimp�ٽ�һ��'C'
	        b) 'A'���һ��Slump�ٽ�һ��'C'
	    4.�����Ķ�����Slimp

	Slurpy��һ��Slimp���һ��Slump���

	���д�����ж�һ���ַ����Ƿ�ΪSlurpy

	����: һ���ַ���
	    
	���: ��
	     
	����: 1����Slurpy
	      0������
	     
	*/

	public static int  isSlurpy(String str)
	{
		/*������ʵ�ֹ���*/
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


