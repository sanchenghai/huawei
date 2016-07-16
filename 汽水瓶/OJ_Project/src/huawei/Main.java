package huawei;

import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] input = new int[10];
		int[] output = new int[10];
		int len = 0, i;
		while(sc.hasNextInt()){
			input[len] = sc.nextInt();
			if(input[len] == 0){
				break;
			}
			len += 1;
		}
		for(i = 0; i < len; i += 1){
			output[i] = Drink(input[i]);
			System.out.println(output[i]);
		}
//        System.out.println(new Demo().getMaxCharacters(input));  
	}
	
	public static int Drink(int n){
	    if(n <= 1){
	        return 0;
	    }//if
	    if(n == 2){
	        return 1;
	    }//if
	    int[] result = {0};
	    helper(n,result);
	    return result[0];
	}
	
	public static void helper(int n, int[] result){
	    if(n == 1){
	        return;
	    }//if
	    if(n == 2){
	        result[0] += 1;
	        return;
	    }//if
	    result[0] += n / 3;
	    n = n % 3 + n / 3;
	    helper(n,result);
	}

}
