package huawei;

import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext())
		{
			String pwd=sc.nextLine();
			if(isok(pwd))
			{
				System.out.println("OK");
			}
			else {
				System.out.println("NG");
			}
		}
		sc.close();
	}
	public static boolean isok(String pwd)
	{
		boolean result=false;
		if(pwd.length()>8)//长度要求大于8
		{
			//用一个int型来表示四种类型是否存在，一个用一位
			int flag=0;
			//遍历标记类型
			for(int i=0;i<pwd.length();i++)
			{
				char tmp=pwd.charAt(i);
				if(tmp>='a'&&tmp<='z')
				{
					flag=flag|8;
				}
				else if(tmp>='A'&&tmp<='Z')
				{
					flag=flag|4;
				}
				else if(tmp>='0'&&tmp<='9')
				{
					flag=flag|2;
				}
				else
				{
					flag=flag|1;
				}
			}
			if((flag&15)==15||(flag&15)==7||(flag&15)==11||(flag&15)==13||(flag&15)==14)//至少存在三种不同类型字符
			{
				if(maxSame(pwd)<=2)//不存在长度大于2的相同子串
				{
					result=true;
				}
			}			
		}
		return result;
	}
	//用动态规划的方法来求字符串中最长的相同子串长度
	public static int maxSame(String str)
	{
			int[][] max=new int[str.length()][str.length()];//声明存储空间，只用一个下三角就可以了,代表从i开始与从j开始的子串与多长相同
			int maxlen=0;
			//处理初始值
			for(int i=0;i<str.length()-1;i++)
			{
				if(str.charAt(i)==str.charAt(str.length()-1))
				{
					max[i][str.length()-1]=1;
					maxlen=1;
				}
			}
			//递推关系为，若str.charAt(i)==str.charAt(j)则max[i][j]=max[i+1][j+1]+1,否则max[i][j]=0
			for(int j=str.length()-2;j>0;j--)//从下向上从右向左遍历下三角
			{
				for(int i=j-1;i>=0;i--)
				{
					if(str.charAt(i)==str.charAt(j))
					{
						max[i][j]=max[i+1][j+1]+1;
						//更新最长相同长度
						if(max[i][j]>maxlen)
						{
							maxlen=max[i][j];
						}
					}
					else {
						max[i][j]=0;
					}
				}
			}
			return maxlen;
	}

}
