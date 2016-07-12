package huawei;

/*
功能:判断守望者是否能够逃出荒岛
    
输入参数：
	 	int uiMagic：整型，守望者的初始魔法值
		int uiDistance:整型，守望者所在的初始位置与岛出口之间的距离。
		int uiSec：整型，岛沉没需要的时间，单位为秒
	 	StringBuilder pRstOut：保证传入的是空的StringBuilder对象，要求把结果加入，输出守望者能否逃出荒岛，若能逃出输出“Yes”，不能输出“No”，注意大小写。
返回值：
		若守望者能逃出荒岛，输出逃出荒岛所用的最短时间，
									不能逃出则输出守望者能逃出的最大距离。
*/

public class Demo {
	public int helpWatcherEscape(int uiMagic, int uiDistance, int uiSec,
			   StringBuilder pRstOut)
	{
		int SpaceElse = 0, TimeleftElse = uiSec; // SpaceElse为行动距离累加，TimeleftElse为开始剩余时间另存
		while (uiMagic >= 10 && uiSec > 0 && uiDistance - SpaceElse > 0) { // 开始闪烁使用模拟
			if (uiDistance - SpaceElse > 17) {
				SpaceElse += 60;
				uiMagic -= 10;
				uiSec--;
			} else {
				pRstOut.append("Yes");
				System.out.println("Yes" + (TimeleftElse - uiSec + 1));
				return TimeleftElse - uiSec + 1;
			}
		}
		while (uiSec > 0 && uiDistance - SpaceElse > 0) { // 决策判断
			if ((uiMagic == 0 || uiMagic == 1) && uiSec >= 7
					&& uiDistance - SpaceElse > 102) // 见表格
			{
				uiSec -= 7;
				SpaceElse += 120;
			} else if (uiMagic >= 2 && uiMagic <= 5 && uiSec >= 3
					&& uiDistance - SpaceElse > 34)// 见表格
			{
				uiMagic -= 2;
				uiSec -= 3;
				SpaceElse += 60;
			} else if (uiMagic >= 6 && uiSec >= 2
					&& uiDistance - SpaceElse > 17) // 见表格
			{
				uiMagic -= 6;
				uiSec -= 2;
				SpaceElse += 60;
			} else {
				SpaceElse += 17;
				uiSec--;
			}
		}
		if (uiDistance <= SpaceElse) {
			pRstOut.append("Yes");
			System.out.println("Yes " + (TimeleftElse - uiSec));
			return TimeleftElse - uiSec;
		} else {
			pRstOut.append("No");
			System.out.println("No " + SpaceElse);
			return SpaceElse;
		}
	}
}
