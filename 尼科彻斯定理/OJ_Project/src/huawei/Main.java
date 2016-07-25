package huawei;

import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = 0;
		String output = "";
		while(sc.hasNext()){
			input = sc.nextInt();
			output = "";
			if(input < 1 || input > 100){
				System.out.println(-1);
			}
			if(input == 1){
				System.out.println(1);
				continue;
			}
			for(int i = input; i < input * input * input; i += 1){
				if(input * input + (i - 1) * input == input * input * input){
					for(int j = 0; j < input; j += 1){
						output += i + "+";
						i += 2;
					}
					i = input * input * input;
					output = output.substring(0, output.length()- 1);
					System.out.println(output);
				}
			}
			if(output == ""){
				System.out.println(-1);
			}
		}
	}

}
