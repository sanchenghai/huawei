package huawei;

/*
����:�ж��������Ƿ��ܹ��ӳ��ĵ�
    
���������
	 	int uiMagic�����ͣ������ߵĳ�ʼħ��ֵ
		int uiDistance:���ͣ����������ڵĳ�ʼλ���뵺����֮��ľ��롣
		int uiSec�����ͣ�����û��Ҫ��ʱ�䣬��λΪ��
	 	StringBuilder pRstOut����֤������ǿյ�StringBuilder����Ҫ��ѽ�����룬����������ܷ��ӳ��ĵ��������ӳ������Yes�������������No����ע���Сд��
����ֵ��
		�����������ӳ��ĵ�������ӳ��ĵ����õ����ʱ�䣬
									�����ӳ���������������ӳ��������롣
*/

public class Demo {
	public int helpWatcherEscape(int uiMagic, int uiDistance, int uiSec,
			   StringBuilder pRstOut)
	{
		int SpaceElse = 0, TimeleftElse = uiSec; // SpaceElseΪ�ж������ۼӣ�TimeleftElseΪ��ʼʣ��ʱ�����
		while (uiMagic >= 10 && uiSec > 0 && uiDistance - SpaceElse > 0) { // ��ʼ��˸ʹ��ģ��
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
		while (uiSec > 0 && uiDistance - SpaceElse > 0) { // �����ж�
			if ((uiMagic == 0 || uiMagic == 1) && uiSec >= 7
					&& uiDistance - SpaceElse > 102) // �����
			{
				uiSec -= 7;
				SpaceElse += 120;
			} else if (uiMagic >= 2 && uiMagic <= 5 && uiSec >= 3
					&& uiDistance - SpaceElse > 34)// �����
			{
				uiMagic -= 2;
				uiSec -= 3;
				SpaceElse += 60;
			} else if (uiMagic >= 6 && uiSec >= 2
					&& uiDistance - SpaceElse > 17) // �����
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
