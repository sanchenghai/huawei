package testcase;

import huawei.Demo;
import junit.framework.TestCase;

public class DemoTest  extends TestCase
{
    
    /*
     * @see TestCase#setUp()
     */
    protected void setUp()
        throws Exception
    {
        super.setUp();
    }
    
    /*
     * @see TestCase#tearDown()
     */
    protected void tearDown()
        throws Exception
    {
        super.tearDown();
    }
    
    public void testCase1()
    {
        assertEquals(5, Demo.getMaxDivisor(15, 10));
    }
    
    public void testCase2()
    {
        assertEquals(24, Demo.getMinMultiple(3, 8));
    }
    
   
   
    
}
