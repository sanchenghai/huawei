package huawei;

import java.util.ArrayList;
import java.util.Arrays;

public final class Demo
{
    /**
     * 小明是个马大哈，某天他到超市买了若干双筷子（n<20）
     *  筷子的长度不尽相同，他把全部筷子都放在购物袋里面拿回家，路上不小心漏了一根
     *  请你用程序帮他找出是漏掉的筷子是多长的。
     * 
     * 
     * @param chopsticks  剩下的筷子数组，如：1, 2, 3, 2, 1, 3, 2
     * @return int 漏掉的筷子长度，如上述输入返回：2（当输入的筷子数据异常时返回-1，如：找不到漏掉的筷子）
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
