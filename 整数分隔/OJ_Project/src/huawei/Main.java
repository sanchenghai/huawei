package huawei;

import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []f = new int[1000002];  
        f[0] = f[1] = 1;  
        f[2] = f[3] = 2;  
        for(int i = 2;i<=500000;i++){  
            f[2*i] = (f[i]+f[2*i-2])%1000000000;  
            f[2*i+1] = f[2*i];  
        }  
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int input = sc.nextInt();
			if(input >= 1 && input <= 1000000){
				System.out.println(f[input]);
			}else{
				System.out.println(-1);
			}
		}
	}

}
