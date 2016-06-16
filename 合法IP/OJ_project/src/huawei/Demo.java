package huawei;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @param inputStr
 *            �����ַ���
 * @param outputStr
 *            ����жϽ��
 * 
 * @description�� �����inputStr�ǺϷ���IP������YES�����򷵻�NO ʾ�� ���룺10.138.15.1 ���أ�YES
 * 
 */
public class Demo {
	public void checkIP(String inputStr, StringBuffer outputStr) 
	{		
		if (inputStr.length() < 7 || inputStr.length() > 15 || "".equals(inputStr)) {
			outputStr.append("NO");
		}
		String rexp = "((?:(?:25[0-5]|2[0-4]\\d|((1\\d{2})|([1-9]?\\d)|(0\\d)|(0\\d\\d)))\\.){3}(?:25[0-5]|2[0-4]\\d|((1\\d{2})|([1-9]?\\d)|(0\\d?)|(0\\d\\d))))";
		Pattern pat = Pattern.compile(rexp);
		Matcher mat = pat.matcher(inputStr);
		boolean flag = mat.matches();
		if(flag){
			outputStr.append("YES");
		}else{
			outputStr.append("NO");
		}
	}
}
