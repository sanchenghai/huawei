package huawei;

import java.util.Arrays;

/*
 功能:判断yuanzi 的马是否会赢？yuanzi 的马赢了，返回 YES. 否则返回 NO

 输入参数：
 int num: 赛马的数量；   (1<= num <=1000)
 int[] speedYz: yuanzi 的马的速度；
 int[] speedOp: 对手的马的速度；

 返回值：
 String型，yuanzi 的马赢了，返回 YES. 否则返回 NO；
 */

public class Demo {
	public String isYuanziWin(int num, int[] speedYz, int[] speedOp) {
		if(num < 1 || num > 1000){
			return "NO";
		}
		Arrays.sort(speedYz);
		Arrays.sort(speedOp);
		int i, j = 0, result = 0;
		for(i = 0; i < num; j += 1){
			if(speedYz[j] > speedOp[i]){
				result += 1;
				i += 1;
			}
			if(j == num - 1){
				i = num;
			}
			
		}
		double flag = (double)num / 2;
		if(result > flag){
			return "YES";
		}
		return "NO";
	}
}
