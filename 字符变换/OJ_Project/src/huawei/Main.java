package huawei;

import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		while (sc.hasNext())
		{
			String input=sc.nextLine();
			if (input==null)
			{
				return;
			}
			StringBuffer sb=new StringBuffer();
			for (int i = 0; i < input.length(); i++)
			{
				char ch=input.charAt(i);
				if (Character.isUpperCase(ch))
				{
					ch=Character.toLowerCase(ch);
					if (ch>='v'&&ch<='z')
					{
						sb.append((char)(ch-21));
					}
					else
					{
						sb.append((char)(ch+5));
					}
				}
				else
				{
					sb.append(ch);
				}
			}
			System.out.println(sb.toString());
		}
		sc.close();
	}

}
