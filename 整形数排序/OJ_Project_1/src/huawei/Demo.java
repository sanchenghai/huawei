package huawei;

import java.util.ArrayList;
import java.util.Arrays;

public final class Demo {
	/*****************************************************************************
	Description : 实现整数排序，即先将从A输入的整型数序列进行排序，剔除重复整型数，输出得到的升序序列B；
	Input       : array_A                 输入参数，输入待排序整型数序列A
	Return      : 排序后的整型数序列
	*****************************************************************************/
	public static int[] sort(int []array_A)
	{
		try{
			if(array_A.length == 0){
			    return null;
			}
			
			Arrays.sort(array_A);
			int i, j = 0;
			ArrayList<Integer> list = new ArrayList<Integer>();
			list.clear();
			for(i = 0; i < array_A.length - 1; i++){
				if(array_A[i] != array_A[i + 1]){
					list.add(j, array_A[i]);
					j += 1;
				}
			}
			list.add(j, array_A[array_A.length - 1]);
			j += 1;
			int result[] = new int[j];
			int k;
			for(k = 0; k < j; k++){
				result[k] = list.get(k);
			}
			return result;
		}catch(Exception e){
			return null;
		}
		
	}

	
}


