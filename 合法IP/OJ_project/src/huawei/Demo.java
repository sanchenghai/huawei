package huawei;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @param inputStr
 *            输入字符串
 * @param outputStr
 *            输出判断结果
 * 
 * @description： 输入的inputStr是合法的IP，返回YES，否则返回NO 示例 输入：10.138.15.1 返回：YES
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
