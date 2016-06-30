package huawei;

import java.math.BigDecimal;

public final class Demo {
	
	public static String  calcNN(int n)
	{
		BigDecimal nB = new BigDecimal(n);
		String res = calnB(nB).toString();
		return res;
	}
	
	public static BigDecimal calnB(BigDecimal nB){
		if(nB.compareTo(BigDecimal.ONE) == 0){
			return BigDecimal.ONE;
		}
		return nB.multiply(calnB(nB.add(BigDecimal.ONE.negate())));
	}
}