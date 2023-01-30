package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Calculator {

    @Test
    public void testSum() {
        Assert.assertEquals(sum(3,4),7);
    }

    public int sum(int a, int b) {
        return a+b;
    }
}
