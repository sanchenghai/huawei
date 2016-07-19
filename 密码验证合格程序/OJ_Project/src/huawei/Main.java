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
		if(pwd.length()>8)//����Ҫ�����8
		{
			//��һ��int������ʾ���������Ƿ���ڣ�һ����һλ
			int flag=0;
			//�����������
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
			if((flag&15)==15||(flag&15)==7||(flag&15)==11||(flag&15)==13||(flag&15)==14)//���ٴ������ֲ�ͬ�����ַ�
			{
				if(maxSame(pwd)<=2)//�����ڳ��ȴ���2����ͬ�Ӵ�
				{
					result=true;
				}
			}			
		}
		return result;
	}
	//�ö�̬�滮�ķ��������ַ����������ͬ�Ӵ�����
	public static int maxSame(String str)
	{
			int[][] max=new int[str.length()][str.length()];//�����洢�ռ䣬ֻ��һ�������ǾͿ�����,�����i��ʼ���j��ʼ���Ӵ���೤��ͬ
			int maxlen=0;
			//�����ʼֵ
			for(int i=0;i<str.length()-1;i++)
			{
				if(str.charAt(i)==str.charAt(str.length()-1))
				{
					max[i][str.length()-1]=1;
					maxlen=1;
				}
			}
			//���ƹ�ϵΪ����str.charAt(i)==str.charAt(j)��max[i][j]=max[i+1][j+1]+1,����max[i][j]=0
			for(int j=str.length()-2;j>0;j--)//�������ϴ����������������
			{
				for(int i=j-1;i>=0;i--)
				{
					if(str.charAt(i)==str.charAt(j))
					{
						max[i][j]=max[i+1][j+1]+1;
						//�������ͬ����
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
