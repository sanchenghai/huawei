package huawei;

import java.util.Scanner;

public class Main {
	/**
	 * @param args
	 * ����ģ�⾲̬ջ�������������жϳ�����
	        Ҳ�������ҳ�����ĵ�һ�����϶��Ǹ��ڵ㣬Ȼ�����������Դ�Ϊ�ָ
	        ǰ�ߵ�����������ߵ���������  
	        Ȼ���ȵݹ��������ٵݹ�����
	 */
	static char[] stack=new char[1000];  
	static int t=0;
	
	public static void main(String[] args) {  
      
		Scanner sc=new Scanner(System.in);  
		while(sc.hasNext()){  
			t=0;  
			String s1=sc.nextLine();  
			String s2=sc.nextLine();  
			if(s1.length()>26||s2.length()>26){
				break; 
			}
			//�ݹ麯��  
			post(s1,s2);  
			for(int i=t-1;i>=0;i--){  
				System.out.print(stack[i]);  
			}
			System.out.println();  
		}  

	}
	
	//s1����,s2����  
	public static void post(String s1,String s2){  
		if(s1.length()==0){
			return ;  
		}  
		int i;  
		//�ҵ��������������һ����Ӧ��ֵ��λ�ã�Ȼ��ֿ������������ݹ�  
		for(i=0;i<s2.length();i++){  
			if(s2.charAt(i)==s1.charAt(0)){
	               break;  
			}
		}  
		//��ջ  
		stack[t]=s1.charAt(0);  
		t++;  
		//�ݹ�������  
		post(s1.substring(i+1),s2.substring(i+1));  
		//�ݹ�������  
		post(s1.substring(1,i+1),s2.substring(0,i));  
	}  
	   
}
