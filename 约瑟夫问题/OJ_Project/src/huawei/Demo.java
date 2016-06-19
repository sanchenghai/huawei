package huawei;

import java.util.ArrayList;


public final class Demo {
	
	/*
	功能: 约瑟夫问题众所周知，原始的约瑟夫问题是这样的：有n个人，编号为1,2,..., n，站成一圈，
	每次第m个将会被处决，直到只剩下一个人。约瑟夫通过给出m来决定赦免其中的一个人。
	例如当n=6,m=5时，5,4,6,2,3将会被依次处决，而1将会幸免。

	假如有k个好人，和k个坏人，所有人站成一圈，前k个人是好人，后k个人是坏人，
	编写程序计算一个最小的m，使k个坏人都被处决，而不处决任何好人。

	    
	输入: k 为正整数
	    
	输出: 
	     
	返回: 最小的m，使k个坏人都被处决，而不处决任何好人。
	     
	*/
	

	public static  int getMinimumM(int K)
	{
	    /*在这里实现功能*/
		int totalNum = 2 * K, countNum = K + 1;
		boolean flag = true; 
		flag = yuesefu(totalNum, countNum, flag);
		while(flag == false){
			countNum += 1;
			flag = true;
			flag = yuesefu(totalNum, countNum, flag);
		}
		return countNum;
	}
	
	public static boolean yuesefu(int totalNum, int countNum, boolean flag) {
		ArrayList<Integer> start = new ArrayList<Integer>();  
		int i;
		for (i = 1; i <= totalNum; i += 1) {  
			start.add(i);  
		}  
		//从第K个开始计数  
		int k = 0;
		while (start.size() >0) {  
			k = k + countNum;  
			//第m人的索引位置  
			k = k % (start.size()) - 1;  
			// 判断是否到队尾  
			if (k < 0) {  
				if(start.get(start.size()-1) <= totalNum /2){
					flag = false;
				}
				k = 0;  
				start.remove(start.size() - 1);  
				
			} else {  
				if(start.get(k) <= totalNum /2){
					flag = false;
				}
				start.remove(k); 
			}  
			if(flag == false || start.size() == totalNum /2){
				break;
			}
		}  
		return flag;
	}

	
}


