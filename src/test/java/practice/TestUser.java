package practice;

import static org.testng.Assert.*;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestUser {

    static String name = "John";


    @Test(description = "Verify admin can create new user")
    public void createNewUserTest(){
        System.out.println("Creating new user ");
//        Assert.fail();
    }

    @Test(dependsOnMethods = "createNewUserTest")
    public void checkCreatedUser(){
        System.out.println("Checking created user");
    }

    @Test
    public void test1(){
        String str = "Hello";
        String str1 = null;
        assertEquals(1,1);
        assertEquals("Hello","Hello");
        assertEquals(str.length(), 5);
        assertTrue(str.contains("e"));
        assertFalse(str.endsWith("A"));
        assertNotEquals(5,4);
        assertNull(str1);
        assertNotNull(str);
    }
}