package huawei;

/*
���������

		int Month��������Redraiment���ҵ�������
		int Day��������Redraiment���ҵ�����
���������
		��
����ֵ��
		int  ������Redraiment���Һ�����ͣ���������
*/
public class Demo
{
    public int getDayNum(int month, int day)
    {
        //todo
    	if(month < 7 || month > 8 || day < 1 || day > 31){
    		return 0;
    	}
    	int n = 1, s1 = 1;
		int m, s2;
		//7,8�����ܹ���Ҫͣ������� n
		while (s1 <= 62)
		{
			s1 += n;
			n += 1;
		}	
		//mouth,day����ʱ�Ѿ�ͣ������� m
		m = 1;
		s2 = 1;
		while (s2 <= (month - 7)*31 + day)
		{
			s2 += m;
			m += 1;
		}
		//ʣ�µ�����
		return n - m;
    }
}
