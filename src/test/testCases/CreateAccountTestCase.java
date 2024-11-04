import org.openqa.selenium.WebDriver;

import org.testng.annotations.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;



public class CreateAccountTestCase extends BasePage {

     public CreateAccountTestCase(){
        super();
    }
    private static WebDriver driver = null;

    @BeforeTest
    public void setUpTest() {
      

        driver = initalizeBrowserAndOpenApp(prop.getProperty("browser"));



    }
    @Parameters({})
    @Test (priority = 2)
    public  void CreateAccountTest() {
        LumaCreateAccountPage createAccountObj =  new LumaCreateAccountPage(driver);

        // Navigate to Create Account Page
        createAccountObj.goToCreatingPage();
        //Fill in the first name
        createAccountObj.setFirstName("Rajat");
        //Fill in last name
        createAccountObj.setLastName("Nikose");
        //Check the NewsLetter button
        createAccountObj.checkNewsletter();
        //Set a random email address
        createAccountObj.setEmail("maadiinik" + Utilities.generateTimeStamp() +"@gmail.com");
        //Set password
        createAccountObj.setPassword("Testing123!");
        //Confirm password
        createAccountObj.setPasswordConfirm("Testing123!");
        //Click Button to create account
        createAccountObj.clickCreateButton();
        //Get the title of the page
        String title = driver.getTitle();
        assertEquals (title, "My Account");

    }
    @AfterTest
    public void tearDownTest() {
        //close browser
        driver.close();

        System.out.println("Test completed Successfully");
    }
}
