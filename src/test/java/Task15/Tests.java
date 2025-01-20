package Task15;
import Pages.*;
import com.shaft.driver.SHAFT;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Tests {
    SHAFT.GUI.WebDriver driver;
    SHAFT.TestData.JSON testData;
    //Test Methods
    @Test
    public void verifyHomePageIsVisible() throws InterruptedException {
        new P01_Verify(driver).verifyHome();
        new P01_Verify(driver).verifySignup();
        new P02_SignUp(driver).fillSignupFields(
                (testData.getTestData("name")),
                (testData.getTestData("email"))
        );
        new P02_SignUp(driver).enterAccountInformation
                (
                        (testData.getTestData("password")),
                        (testData.getTestData("fristName")),
                        (testData.getTestData("lastName")),
                        (testData.getTestData("company")),
                        (testData.getTestData("address")),
                        (testData.getTestData("address2")),
                        (testData.getTestData("state")),
                        (testData.getTestData("city")),
                        (testData.getTestData("zipCode")),
                        (testData.getTestData("mobilenumber"))
                );
        new P01_Verify(driver).verifyLogin();
        new P03_AddProduct(driver).addProduct();
        new P01_Verify(driver).verifyCartPage();
        new P04_Checkout(driver).checkout().verifyAddressDetailsAndReviewYourOrder();
        new P04_Checkout(driver).fillDescriptionField((testData.getTestData("description")));
        new P04_Checkout(driver).completePayment(
                (testData.getTestData("nameOnCard")),
                (testData.getTestData("cardNumber")),
                (testData.getTestData("cvc")),
                (testData.getTestData("expirationMonth")),
                (testData.getTestData("expirationYear")));
        new P05_DeleteAccount(driver).deleteAccount();

    }
    //Before Method
    @BeforeClass
    public void setUp(){
        driver = new SHAFT.GUI.WebDriver();
        driver.browser()
                .navigateToURL("https://automationexercise.com/");
        testData=new SHAFT.TestData.JSON(SHAFT.Properties.paths.testData() + "testData.json");

    }

    //After Method
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}