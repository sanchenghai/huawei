package huawei;

import java.util.Arrays;

public final class Demo {
	
    // ���ܣ������������飬����Ԫ�ذ�����������������
    // ���룺pIntegerArray ��Ҫ�������������
    //       sortFlg 0:���� 1������
    // ���أ�û���ظ����ֵ�����
    public static void sortArray(Integer[] pIntegerArray, int sortFlg)
    {
    	//ע�⣬������DemoTest�ļ�
    	Arrays.sort(pIntegerArray);
    	int i, temp;
        if(sortFlg == 1){
        	int loop = pIntegerArray.length / 2;
        	for(i = 0; i < loop; i += 1){
        		temp = pIntegerArray[i];
        		pIntegerArray[i] = pIntegerArray[pIntegerArray.length -1 - i];
        		pIntegerArray[pIntegerArray.length -1 - i] = temp;
        	}
        }
    }
	

}