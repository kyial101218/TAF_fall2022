package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo1 {


    public  int divide(int a, int b){
        if (b==0){
            throw new ArithmeticException("You can not divide to zero");
        }
        return a/b;
    }

    public  int sum(int a, int b){ return a+b;}

    @Test
    public void testSumFunction(){
        int expectedResult = 4;
        Assert.assertEquals(sum(2,2),expectedResult);
        System.out.println("Hello");
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivideFunction(){
        divide(2,0);
        Assert.assertEquals(divide(10,5),2);
        Assert.assertEquals(divide(100,2),50);

    }


}


