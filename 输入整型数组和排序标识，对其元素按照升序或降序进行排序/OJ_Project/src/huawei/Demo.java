package huawei;

import java.util.Arrays;

public final class Demo {
	
    // 功能：输入整型数组，对其元素按照升序或降序进行排序
    // 输入：pIntegerArray 需要排序的整型数组
    //       sortFlg 0:升序 1：降序
    // 返回：没有重复数字的整型
    public static void sortArray(Integer[] pIntegerArray, int sortFlg)
    {
    	//注意，更改了DemoTest文件
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