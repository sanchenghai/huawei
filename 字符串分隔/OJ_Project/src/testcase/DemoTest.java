package testcase;

import huawei.Demo;

import java.util.Arrays;

import junit.framework.Assert;
import junit.framework.TestCase;

public class DemoTest extends TestCase
{
    public void testCase1() 
    {
        String[] input = {"434353f", "ABCDEFG1234", "1234567890"};
        String[] expect = {"434353f0","ABCDEFG1","23400000","12345678","90000000"};
        
        Assert.assertTrue(Arrays.equals(expect, Demo.splitString(input)));
    }
   
}
