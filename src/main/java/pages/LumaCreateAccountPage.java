package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LumaCreateAccountPage {

        WebDriver driver;
    
        @FindBy(xpath = "//div[@class='panel header']//a[normalize-space()='Create an Account']")
        WebElement navigateToCreateButton;

        @FindBy(id="firstname")
        WebElement firstNameBox;

        @FindBy(id="lastname")
        WebElement lastNameBox;


      
        @FindBy(id="email_address")
         WebElement emailBox;
        @FindBy(id="password")
        WebElement passwordField;
        @FindBy(id="password-confirmation")
        WebElement confirmPassword;
        @FindBy(xpath = "//button[@title='Create an Account']//span[contains(text(),'Create an Account')]")
        WebElement createButton;

		private WebElement password_box;

		private WebElement create_button;




        public LumaCreateAccountPage(WebDriver driver){
                this.driver = driver;
               PageFactory.initElements(driver, this);
        }

    
        public void goToCreatingPage() {

                        navigateToCreateButton.click();

        }

        public void setFirstName(String text) {

                try {

                        firstNameBox.sendKeys(text);
                } catch (Exception e) {
                        System.out.println("Exception caught" + e.getMessage());

                }
        }
        public void setLastName(String text) {
                try {
                      lastNameBox.sendKeys(text);
                     
                } catch (Exception e) {
                        System.out.println("Exception caught" + e.getMessage());

                }
        }

        public void setEmail(String text) {
                try {

                        emailBox.sendKeys(text);
                } catch (Exception e) {
                        System.out.println("Exception caught" + e.getMessage());

                }
        }

        public void setPassword(String text) {
                try {
                       
                     
						password_box.sendKeys(text);
                } catch (Exception e) {
                        System.out.println("Exception caught" + e.getMessage());

                }
        }

        public void setPasswordConfirm(String text) {
                try {
                confirmPassword.sendKeys(text);
                } catch (Exception e) {
                        System.out.println("Exception caught" + e.getMessage());

                }

        }
        public void clickCreateButton() {
                try {
                	 
                        create_button.click();
                } catch (Exception e) {
                        System.out.println("Exception caught" + e.getMessage());

                }
        }
}
