package huawei;

import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int len = sc.nextInt();
			int i, out = 3, s = 0;
			for (i = 2; i <= len; i += 1){
				s = (s + out) % i;
			}
			System.out.println(s + 1);
		}
		sc.close();
	}
	
}
