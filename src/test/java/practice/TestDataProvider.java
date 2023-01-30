package practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataProvider {

    @DataProvider(name = "login data")
    public Object[][] dpMethod(){
        return new Object[][] {
                {"john@gmail.com", "VeryHard@$$123"},
                {"john@gmail", "VeryHard@$$123"},
                {"john@gmail", "VeryHard@$$"}
        };
    }

    @Test(dataProvider = "login data")
    public void testLogin (String email, String password){
        System.out.println("Test login page: Testing email field with " + email + "---" +"Testing password field with " + password);
    }
}
