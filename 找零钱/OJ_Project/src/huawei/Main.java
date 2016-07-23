package huawei;

import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int n=sc.nextInt();
			if(n==0){
				break;
			}
			int a1=n/2;
			int a2=n/5;
			int a3=n/10;
			int a4=n/20;
			int a5=n/50;
			int a6=n/100;
			int count=1+a1+a2+a3+a4+a5+a6;
			System.out.println(count);
		}
	}

}
