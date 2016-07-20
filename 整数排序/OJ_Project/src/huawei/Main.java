package huawei;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String input = sc.nextLine();
			String[] arr =  input.split(",");
			int[] array_A = new int[arr.length];
			for(int i = 0; i < arr.length; i += 1){
				array_A[i] = Integer.parseInt(arr[i]);
			}
			int[] res = sort(array_A);
			for(int i = 0; i < res.length - 1; i += 1){
				System.out.print(res[i] + " ");
			}
			System.out.println(res[res.length - 1]);
		}
	}
	
	public static int[] sort(int []array_A)  
    {  
        int count=0;  
        int len=array_A.length;  
        for (int i = len-1; i >0; i--)  
        {  
            for (int j = 0; j < i; j++)  
            {  
                if (array_A[j]>array_A[j+1])  
                {  
                    int temp=array_A[j];  
                    array_A[j]=array_A[j+1];  
                    array_A[j+1]=temp;  
                }  
            }  
        }  
        Map<Integer,Integer> hm=new HashMap<Integer,Integer>();  
        hm.put(count, array_A[0]);  
        count++;
        for (int i = 1; i < len - 1; i++)  
        {  
            if(array_A[i + 1] - array_A[i] > 1)
            {  
            	if (!hm.containsValue(array_A[i])){
            		hm.put(count, array_A[i]);  
                    count++;  
            	}
            	if (!hm.containsValue(array_A[i + 1])){
            		hm.put(count, array_A[i + 1]);  
                    count++;  
            	}
            }  
        }  
        if (!hm.containsValue(array_A[len - 1])){
        	hm.put(count, array_A[len - 1]);  
            count++;  
        }
        int[] output=new int[count];  
        for (int i = 0; i < count; i++)  
        {  
            output[i]=hm.get(i);  
        }  
        return output;  
          
    }  

}
