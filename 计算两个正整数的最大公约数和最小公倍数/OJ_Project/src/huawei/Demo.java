package huawei;

public final class Demo {
	
    // ���ܣ���ȡ�������������Լ��
    // ���룺��������
    // ���أ����Լ��
    public static long getMaxDivisor(long lFirstInput, long lSecondInput)
    {
    	if (lFirstInput % lSecondInput == 0) {
    		return lSecondInput;
    	} else {
    		return getMaxDivisor(lSecondInput,lFirstInput % lSecondInput);
    	}
    }
    
    // ���ܣ���ȡ������������С������
    // ���룺��������
    // ���أ���С������
    public static long getMinMultiple(long lFirstInput, long lSecondInput)
    {
    	return lFirstInput / getMaxDivisor(lFirstInput, lSecondInput) * lSecondInput;
    }

}