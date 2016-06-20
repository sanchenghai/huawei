package huawei;


public final class Demo {

	/* ���ܣ���ʮ�������ַ�����ʽ����תΪ�ڴ�ֵ��ʽ��ע��pBuffer���ڴ������ɵ����߱�֤��
	 * ���룺szHexText��ʮ�������ַ�����ʽ����: "6566"
	 * �����dataOutput,���У��ڴ�ֵ��ʽBuffer�����ڴ��{0x65, 0x66}
	 * ���أ�����ת���ɹ���buffer����Ч�ֽ���
	 */
	
	//�ӱȽ϶డ��ע��
	public static int[] hexToBin(String szHexText)
	{
	    /* ��ʵ�� */
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