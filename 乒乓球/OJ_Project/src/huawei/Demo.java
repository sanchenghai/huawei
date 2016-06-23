package huawei;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Demo {

	/**
	 * 功能:将文件中的字符数据转换11进制的分数和21进制的分数输出
	 * 
	 * @param input
	 *            字符数据的存储文件
	 * @param relt_11
	 *            按照11进制转换的结果，顺序存放在二维数组中。其中 relt_11[0]表示华华的成绩，relt_11[1]表示对手的成绩
	 * @param relt_21
	 *            按照21进制转换的结果，顺序存放在二维数组中。其中 relt_21[0]表示华华的成绩，relt_21[1]表示对手的成绩
	 */
	public void scoreresult(File input, int[][] relt_11, int[][] relt_21) {
		String str = readTxtFile(input);
		if(str.contains("null") || str == "" || str == "E"){
			relt_11[0][0] = 0;
			relt_11[0][1] = 0;
			relt_21[0][0] = 0;
			relt_21[0][1] = 0;
			return;
		}
		int i, len = str.length(), winNum1 = 0, loseNum1 = 0, winNum2 = 0, loseNum2 = 0;
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.clear();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.clear();
		for(i = 0; i < len; i += 1){
			if(str.charAt(i) == 'W'){
				winNum1 += 1;
				winNum2 += 1;
			}else if(str.charAt(i) == 'L'){
				loseNum1 += 1;
				loseNum2 += 1;
			}else if(str.charAt(i) == 'E'){
				break;
			}
			if((winNum1 >= 11 || loseNum1 >= 11) && Math.abs(winNum1 - loseNum1) >= 2){
				list1.add(winNum1);
				list1.add(loseNum1);
				winNum1 = 0;
				loseNum1 = 0;
			}
			if((winNum2 >= 21 || loseNum2 >= 21) && Math.abs(winNum2 - loseNum2) >= 2){
				list2.add(winNum2);
				list2.add(loseNum2);
				winNum2 = 0;
				loseNum2 = 0;
			}
		}
		if(winNum1 + loseNum1 != 0){
			list1.add(winNum1);
			list1.add(loseNum1);
		}
		if(winNum2 + loseNum2 != 0){
			list2.add(winNum2);
			list2.add(loseNum2);
		}
		int len1 = list1.size();
		int len2 = list2.size();
		if(len1 == 0 && len2 == 0){
			relt_11[0][0] = 0;
			relt_11[0][1] = 0;
			relt_21[0][0] = 0;
			relt_21[0][1] = 0;
			return;
		}
		int result1[] = new int[len1];
		int result2[] = new int[len2];
		for(i = 0; i < len1; i += 1){
			result1[i] = list1.get(i);
		}
		for(i = 0; i < len2; i += 1){
			result2[i] = list2.get(i);
		}
		array1to2(result1, relt_11);
		array1to2(result2, relt_21);
	}
	
	public static String readTxtFile(File file){
        try {
                if(file.isFile() && file.exists()){ //判断文件是否存在
                    InputStreamReader read = new InputStreamReader(
                    new FileInputStream(file),"utf-8");//考虑到编码格式
                    BufferedReader bufferedReader = new BufferedReader(read);
                    String lineTxt = null;
                    String res = "";
                    while((lineTxt = bufferedReader.readLine()) != null){
                    	res += lineTxt;
                    }
                    read.close();
                    return res;
                }else{
//                	System.out.println("找不到指定的文件");
                	return "";
                }
        } catch (Exception e) {
//            System.out.println("读取文件内容出错");
//            e.printStackTrace();
            return "";
        }
     
    }
	
	private void array1to2(int[] one, int[][] two) {
		if (null == one) {
			return;
		}
		int row = two.length;
		int col = two[0].length;

		if (one.length < row * col) {
			return;
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				two[i][j] = one[i * col + j];
			}
		}
	}
	
}
