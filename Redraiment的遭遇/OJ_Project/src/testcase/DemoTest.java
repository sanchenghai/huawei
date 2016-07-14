package testcase;

import huawei.Demo;
import junit.framework.TestCase;

public class DemoTest extends TestCase
{
    public void testValue1()
    {
        Demo demo = new Demo();
        int month = 7;
        int day = 2;

        assertEquals(demo.getDayNum(month, day), 9);
    }

    public void testValue2()
    {
        Demo demo = new Demo();
        int month = 8;
        int day = 31;

        assertEquals(demo.getDayNum(month, day), 0);
    }
}