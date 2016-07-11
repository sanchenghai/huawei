package huawei;

public final class Demo {
	
    // 功能：获取两个整数的最大公约数
    // 输入：两个整数
    // 返回：最大公约数
    public static long getMaxDivisor(long lFirstInput, long lSecondInput)
    {
    	if (lFirstInput % lSecondInput == 0) {
    		return lSecondInput;
    	} else {
    		return getMaxDivisor(lSecondInput,lFirstInput % lSecondInput);
    	}
    }
    
    // 功能：获取两个整数的最小公倍数
    // 输入：两个整数
    // 返回：最小公倍数
    public static long getMinMultiple(long lFirstInput, long lSecondInput)
    {
    	return lFirstInput / getMaxDivisor(lFirstInput, lSecondInput) * lSecondInput;
    }

}