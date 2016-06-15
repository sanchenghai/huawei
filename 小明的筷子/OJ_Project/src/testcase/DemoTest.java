package testcase;

import huawei.Demo;

import junit.framework.TestCase;

public class DemoTest extends TestCase
{
    
    public void testCase01()
    {
        int[] chopsticks = {1, 2, 3, 2, 1, 3, 2};
        assertEquals(2, Demo.checkChopsticks(chopsticks));
    }
    
}
