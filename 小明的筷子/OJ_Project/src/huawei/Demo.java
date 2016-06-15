package huawei;

import java.util.ArrayList;
import java.util.Arrays;

public final class Demo
{
    /**
     * С���Ǹ�������ĳ������������������˫���ӣ�n<20��
     *  ���ӵĳ��Ȳ�����ͬ������ȫ�����Ӷ����ڹ���������ûؼң�·�ϲ�С��©��һ��
     *  �����ó�������ҳ���©���Ŀ����Ƕ೤�ġ�
     * 
     * 
     * @param chopsticks  ʣ�µĿ������飬�磺1, 2, 3, 2, 1, 3, 2
     * @return int ©���Ŀ��ӳ��ȣ����������뷵�أ�2��������Ŀ��������쳣ʱ����-1���磺�Ҳ���©���Ŀ��ӣ�
     * 
     */
    public static int checkChopsticks(int[] chopsticks)
    {      
    	try{
        	if(chopsticks.length % 2 == 0){
        		return -1;
        	}
        	Arrays.sort(chopsticks);
        	if(chopsticks[0] <= 0){
        		return -1;
        	}
        	int i, j = 0, k = 0;
        	ArrayList<Integer> list = new ArrayList<Integer>();
    		list.clear();
    		if(chopsticks[0] != chopsticks[1]){
    			list.add(k, chopsticks[0]);
    			k = k + 1;
    			j = j + 1;
    		}
        	for(i = j; i < chopsticks.length - 2;){
        		if(chopsticks[i] == chopsticks[i + 1]){
        			chopsticks[i] = -1;
        			chopsticks[i + 1] = -1;
        			i += 2;
        		}else{
        			list.add(k, chopsticks[i]);
        			k = k + 1;
        			i += 1;
        		}
        	}
        	if(chopsticks[chopsticks.length - 2] != chopsticks[chopsticks.length - 1]){
    			list.add(k, chopsticks[chopsticks.length - 1]);
    			k = k + 1;
    		}
        	System.out.println(k);
        	System.out.println(list.get(0));
        	if(k == 1){
        		return list.get(0);
        	}
            return -1;
    	}catch(Exception e){
    		return -1;
    	}
    	
    }
}
