package huawei;

import java.util.Scanner;

public class Main {
	/**
	 * @param args
	 * 数组模拟静态栈，由先序，中序，判断出后序，
	        也就是先找出先序的第一个，肯定是根节点，然后在中序中以此为分割，
	        前边的是左树，后边的是右树，  
	        然后先递归右树，再递归左树
	 */
	static char[] stack=new char[1000];  
	static int t=0;
	
	public static void main(String[] args) {  
      
		Scanner sc=new Scanner(System.in);  
		while(sc.hasNext()){  
			t=0;  
			String num = sc.nextLine();
			int number = Integer.parseInt(num);
			if(number < 1 || number > 1000){
				break; 
			}
			String s1=sc.nextLine().replaceAll(" ", "");  
			String s2=sc.nextLine().replaceAll(" ", ""); 
			//递归函数  
			try{
				post(s1,s2);
			}catch(Exception e){
				System.out.println("No"); 
				continue;
			}
			for(int i=t-1;i>=0;i--){  
				System.out.print(stack[i] + " ");  
			}
			System.out.println();  
		}  

	}
	
	//s1先序,s2中序  
	public static void post(String s1,String s2){  
		if(s1.length()==0){
			return ;  
		}  
		int i;  
		//找到中序中与先序第一个对应的值得位置，然后分开左右子树。递归  
		for(i=0;i<s2.length();i++){  
			if(s2.charAt(i)==s1.charAt(0)){
	               break;  
			}
		}  
		//入栈  
		stack[t]=s1.charAt(0);  
		t++;  
		//递归右子树  
		post(s1.substring(i+1),s2.substring(i+1));  
		//递归左子树  
		post(s1.substring(1,i+1),s2.substring(0,i));  
	}  
	   
}
