package huawei;

import java.util.ArrayList;


public final class Demo {
	
	/*
	����: Լɪ������������֪��ԭʼ��Լɪ�������������ģ���n���ˣ����Ϊ1,2,..., n��վ��һȦ��
	ÿ�ε�m�����ᱻ������ֱ��ֻʣ��һ���ˡ�Լɪ��ͨ������m�������������е�һ���ˡ�
	���統n=6,m=5ʱ��5,4,6,2,3���ᱻ���δ�������1�������⡣

	������k�����ˣ���k�����ˣ�������վ��һȦ��ǰk�����Ǻ��ˣ���k�����ǻ��ˣ�
	��д�������һ����С��m��ʹk�����˶������������������κκ��ˡ�

	    
	����: k Ϊ������
	    
	���: 
	     
	����: ��С��m��ʹk�����˶������������������κκ��ˡ�
	     
	*/
	

	public static  int getMinimumM(int K)
	{
	    /*������ʵ�ֹ���*/
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
		//�ӵ�K����ʼ����  
		int k = 0;
		while (start.size() >0) {  
			k = k + countNum;  
			//��m�˵�����λ��  
			k = k % (start.size()) - 1;  
			// �ж��Ƿ񵽶�β  
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


