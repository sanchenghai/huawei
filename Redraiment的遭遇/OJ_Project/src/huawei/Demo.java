package huawei;

/*
输入参数：

		int Month：整数，Redraiment到家的月数。
		int Day：整数，Redraiment到家的日期
输出参数：
		无
返回值：
		int  （返回Redraiment到家后遭遇停电的天数）
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
		//7,8两月总共需要停电的天数 n
		while (s1 <= 62)
		{
			s1 += n;
			n += 1;
		}	
		//mouth,day回来时已经停电的天数 m
		m = 1;
		s2 = 1;
		while (s2 <= (month - 7)*31 + day)
		{
			s2 += m;
			m += 1;
		}
		//剩下的天数
		return n - m;
    }
}
