package testcase;

import java.util.Arrays;

import huawei.Demo;
import junit.framework.TestCase;

public class DemoTest  extends TestCase
{
	   //��֪��Ϊʲô����ͨ������Ȼ�󡣡���
       //��assertEquals(resultArray, pIntArray);
	   //����assertTrue(Arrays.equals(resultArray, pIntArray));
	   //��ͨ����
	
	   public void testCase1()
	    {
	        Integer[] pIntArray = {5, 4, 7, 1, 3};
	        
	        Demo.sortArray(pIntArray, 0);
	        
	        Integer[] resultArray = {1, 3, 4, 5, 7};
	        
	        assertTrue(Arrays.equals(resultArray, pIntArray));
	    }
	    
	    public void testCase2()
	    {
	        Integer[] pIntArray = {1, 3, 7, 4, 5};
	        
	        Demo.sortArray(pIntArray, 1);
	        
	        Integer[] resultArray = {7, 5, 4, 3, 1};
	        
	        assertTrue(Arrays.equals(resultArray, pIntArray));
	    }
	    
	    public void testCase3()
	    {
	        Integer[] pIntArray = {5, 4, 7, 1, 3, 1, 7, 0};
	        
	        Demo.sortArray(pIntArray, 0);
	        
	        Integer[] resultArray = {0, 1, 1, 3, 4, 5, 7, 7};
	        
	        assertTrue(Arrays.equals(resultArray, pIntArray));
	    }
	    
	    public void testCase4()
	    {
	        Integer[] pIntArray = {5, 4, 7, 1, 3, 1, 7, 0};
	        
	        Demo.sortArray(pIntArray, 1);
	        
	        Integer[] resultArray = {7, 7, 5, 4, 3, 1, 1, 0};
	        
	        assertTrue(Arrays.equals(resultArray, pIntArray));
	    }
	    
	    
	    public void testCase5()
	    {
	        Integer[] pIntArray = {0, 9, 7, 7, 6, 1, 7, 0};
	        
	        Demo.sortArray(pIntArray, 0);
	        
	        Integer[] resultArray = {0, 0, 1, 6, 7, 7, 7, 9};
	        
	        assertTrue(Arrays.equals(resultArray, pIntArray));
	    }
	    
	    public void testCase6()
	    {
	        Integer[] pIntArray = {0, 9, 7, 7, 6, 1, 7, 0};
	        
	        Demo.sortArray(pIntArray, 1);
	        
	        Integer[] resultArray = {9, 7, 7, 7, 6, 1, 0, 0};
	        
	        assertTrue(Arrays.equals(resultArray, pIntArray));
	    }
    
}
