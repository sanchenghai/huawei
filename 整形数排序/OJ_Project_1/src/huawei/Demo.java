package huawei;

import java.util.ArrayList;
import java.util.Arrays;

public final class Demo {
	/*****************************************************************************
	Description : ʵ���������򣬼��Ƚ���A��������������н��������޳��ظ�������������õ�����������B��
	Input       : array_A                 ����������������������������A
	Return      : ����������������
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


