package huawei;

import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i;
		String res = "";
		while(sc.hasNextInt()){
			int input = sc.nextInt();
			String str = String.valueOf(input);
			System.out.print(str.length());
			System.out.print(" ");
			for(i = 0; i < str.length(); i+= 1){
				res += str.charAt(str.length() - 1 - i);
			}
			System.out.print(Integer.parseInt(res));
			res = "";
		}
	}

}
