package huawei;

public final class Demo {

	
	/*
	����: ����Ļ�׼�ַ�����ͳ��ָ���ַ����ֵ�Ƶ��
	      �ַ���������Ӣ�Ĵ�Сд��ĸ�Ϳո񡢶��š����
		  С�������2λ��Ч���֣�����λ��������

	����: String pString  ����Ļ�׼�ַ���
		 char c ָ�����ַ�
	
	����: ���ָ���ַ����ֵ�Ƶ��
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