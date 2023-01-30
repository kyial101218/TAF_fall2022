import com.digitalnomads.javaFaker.FakeDataProvider;
//import javaFaker.FakeDataProvider;
import org.testng.Assert;
import org.testng.annotations.*;


public class TestDemo {
    String expectedFakeName;

    @AfterClass
    public void tearDown() {
        System.out.println("Close Chrome browser");
    }


    @BeforeMethod
    public void beforeMethod() {
        System.out.println("This is Before method");
        expectedFakeName = FakeDataProvider.generateFakeName();
    }

    @AfterMethod
    public void afterMehtod() {
        expectedFakeName = null;
        System.out.println(expectedFakeName);
        System.out.println("Screenshot");
    }


    @Test(description = "Verify food title is displayed on Home page")
    @Ignore
    public void testFoodTitle() {
        System.out.println("Check food title");
        System.out.println();
        System.out.println(expectedFakeName);
        Assert.assertEquals(0, 1);
    }


    @Test
    public void testPharmacyTitle() {
        System.out.println("Check Pharmacy title");
        System.out.println(expectedFakeName);
    }

    @Test
    public void testShops() {
        System.out.println("Check Shop title");
        System.out.println(expectedFakeName);
    }



    @BeforeClass
    public void setUp() {
        System.out.println("Configure chrome browser");
        System.out.println("Go to Nambafood.com");
    }
}









