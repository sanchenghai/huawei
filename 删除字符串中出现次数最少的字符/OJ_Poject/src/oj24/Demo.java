package oj24;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Demo {

	/**
	 * @param args
	 * �����������������ַ������԰�
	 * ���˰��죬���������ֻ��C����
	 */
	public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  
        System.out.println("������ĸ���У�");  
        String input = sc.nextLine();  
        System.out.println(new Demo().getMaxCharacters(input));  
    }  
	
	public String getMaxCharacters(String input){  
        char[] chars = new char[255];  
        char[] in = input.toCharArray();  
  
        Set<Character> set = new HashSet<Character>();//��¼���г��ֵ������ַ�  
        int maxCount = 0;//���Ĵ���  
        for (int i = 0; i < in.length; i++) {  
            int tempCount = (int)++chars[in[i]];//ͳ���ַ����ֵĴ����������±�����ַ����������ݼ�¼����  
            if(tempCount >= maxCount){  
  
                if(tempCount > maxCount)//�����ǰ���ַ����������Ĵ��������¼  
                    set.clear();  
                maxCount = tempCount;  
                set.add(in[i]);  
            }  
        }  
  
        StringBuilder sb = new StringBuilder();  
        Object[] array = set.toArray();//�������г��ִ��������ַ�������  
        for (int i = 0; i < array.length; i++) { //�����ж���ַ����ִ����������  
            for (int j = 1; j <= maxCount; j++) {//���Ĵ���  
                sb.append((array[i]).toString());  
            }  
        }  
  
        return sb.toString();  
    }  

}
