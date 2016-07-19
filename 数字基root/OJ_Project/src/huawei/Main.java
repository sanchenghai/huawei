package huawei;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			try{
				String input = sc.nextLine();
				int num = Integer.parseInt(input);
				if(num <= 0){
					System.out.println(-1);
					continue;
				}
				if(num <= 9){
					System.out.println(num);
					continue;
				}
				System.out.println(sum(num));
			}catch(Exception e){
				System.out.println(-1);
			}
			
		}
		sc.close();
	}
	
	public static int sum(int num){
		int res = 0;
		if(num > 9){
			String str = String.valueOf(num);
			for(int i = 0; i < str.length(); i += 1){
				res += (int)(str.charAt(i)) - (int)('0');
			}
			return sum(res);
		}
		return num;
	}
}
