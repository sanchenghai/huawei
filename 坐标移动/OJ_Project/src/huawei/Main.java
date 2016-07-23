package huawei;

import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = "";
		int x, y;
		while(sc.hasNextLine()){
			x = 0;
			y = 0;
			input = sc.nextLine();
			if(input.length() == 0){
				continue;
			}
			String[] arr = input.split(";");
			for(int i = 0; i < arr.length; i += 1){
				if(arr[i].length() < 2 || arr[i].length() > 3){
					continue;
				}
				if(arr[i].charAt(0) == 'W' || arr[i].charAt(0) == 'S'){
					int disy = 0;
					try{
						disy = Integer.parseInt(arr[i].substring(1));
					}catch(Exception e){
						continue;
					}
					if(disy > 0 && disy < 100){
						if(arr[i].charAt(0) == 'W'){
							y += disy;
						}else if(arr[i].charAt(0) == 'S'){
							y -= disy;
						}
					}
				}
				if(arr[i].charAt(0) == 'A' || arr[i].charAt(0) == 'D'){
					int disx = 0;
					try{
						disx = Integer.parseInt(arr[i].substring(1));
					}catch(Exception e){
						continue;
					}
					if(disx > 0 && disx < 100){
						if(arr[i].charAt(0) == 'D'){
							x += disx;
						}else if(arr[i].charAt(0) == 'A'){
							x -= disx;
						}
					}
				}
			}
			System.out.println(x + "," + y);
		}
	}

}
