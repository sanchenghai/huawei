package oj24;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Demo {

	/**
	 * @param args
	 * 这个是输出次数最多的字符，不对啊
	 * 找了半天，符合题意的只有C程序
	 */
	public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  
        System.out.println("输入字母序列：");  
        String input = sc.nextLine();  
        System.out.println(new Demo().getMaxCharacters(input));  
    }  
	
	public String getMaxCharacters(String input){  
        char[] chars = new char[255];  
        char[] in = input.toCharArray();  
  
        Set<Character> set = new HashSet<Character>();//记录所有出现的最大的字符  
        int maxCount = 0;//最大的次数  
        for (int i = 0; i < in.length; i++) {  
            int tempCount = (int)++chars[in[i]];//统计字符出现的次数，数组下标代表字符，数组内容记录次数  
            if(tempCount >= maxCount){  
  
                if(tempCount > maxCount)//如果当前的字符次数比最大的大则清除记录  
                    set.clear();  
                maxCount = tempCount;  
                set.add(in[i]);  
            }  
        }  
  
        StringBuilder sb = new StringBuilder();  
        Object[] array = set.toArray();//保存所有出现次数最大的字符的数组  
        for (int i = 0; i < array.length; i++) { //可能有多个字符出现次数都是最大  
            for (int j = 1; j <= maxCount; j++) {//最大的次数  
                sb.append((array[i]).toString());  
            }  
        }  
  
        return sb.toString();  
    }  

}
