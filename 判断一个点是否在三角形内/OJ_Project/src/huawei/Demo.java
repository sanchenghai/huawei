package huawei;

public final class Demo {
	
	public static  boolean isInTriangle(POINT A, POINT B, POINT C, POINT P)
	{
		 /*���ò�˷������ж�,����P�����M��*/
		int a = 0, b = 0, c = 0;
		
		/*��������*/
		POINT MA = new POINT(P.x - A.x,P.y - A.y);
		POINT MB = new POINT(P.x - B.x,P.y - B.y);
		POINT MC = new POINT(P.x - C.x,P.y - C.y);
		
		/*�������*/
		a = MA.x * MB.y - MA.y * MB.x;
		b = MB.x * MC.y - MB.y * MC.x;
		c = MC.x * MA.y - MC.y * MA.x;
		
		if((a <= 0 && b <= 0 && c <= 0)||
			(a > 0 && b > 0 && c > 0))
		{
			return true;
		}
		
		return false;
	}
}

