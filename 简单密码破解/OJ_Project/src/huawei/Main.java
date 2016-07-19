package huawei;

import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str, result;
		int size, i;
		String letter = "bcdefghijklmnopqrstuvwxyza";
		String number = "22233344455566677778889999";
		while(sc.hasNextLine()){
			str = sc.nextLine();
			while(str.isEmpty()){
				str = sc.nextLine();
			}
			result = "";
		    size = str.length();
		    for(i = 0; i < size; i += 1){
		        // Ð¡Ð´×ÖÄ¸
		        if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
		            result += number.charAt(str.charAt(i) - 'a');
		        }//if
		        // ´óÐ´×ÖÄ¸
		        else if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
		            result += letter.charAt(str.charAt(i) - 'A');
		        }//else
		        else{
		            result += str.charAt(i);
		        }
		    }//for
		    System.out.println(result);
		}
	}

}
