package huawei;

import java.util.Arrays;

/*
 ����:�ж�yuanzi �����Ƿ��Ӯ��yuanzi ����Ӯ�ˣ����� YES. ���򷵻� NO

 ���������
 int num: �����������   (1<= num <=1000)
 int[] speedYz: yuanzi ������ٶȣ�
 int[] speedOp: ���ֵ�����ٶȣ�

 ����ֵ��
 String�ͣ�yuanzi ����Ӯ�ˣ����� YES. ���򷵻� NO��
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
