package huawei;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String res = "", str1, str2;
		while(sc.hasNextLine()){
			str1 = sc.nextLine();
			while(str1.isEmpty()){
				str1 = sc.nextLine();
			}
			str2 = sc.nextLine();
			while(str2.isEmpty()){
				str2 = sc.nextLine();
			}
			BigDecimal m = new BigDecimal(str1);
			BigDecimal n = new BigDecimal(str2);
			res = m.add(n).toString();
			System.out.println(res);
		}
	}
}
