package Pages;

    import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
    import org.openqa.selenium.support.ui.WebDriverWait;

    import java.time.Duration;

public class P04_Checkout {
    SHAFT.GUI.WebDriver driver;

    public P04_Checkout(SHAFT.GUI.WebDriver driver)
    {
        this.driver=driver;
    }
    //Locators
    By checkoutButton=By.xpath("//a[@class='btn btn-default check_out']");
    By checkoutDetails =By.xpath("//ul[@class='address item box']");
    By enterDescription = By.xpath("//textarea[@class='form-control']");
    By placeOrder=By.xpath("//a[@href='/payment']");
    By nameOnCard =By.xpath("//input[@data-qa='name-on-card']");
    By cardNumber =By.xpath("//input[@data-qa='card-number']");
    By cvc =By.xpath("//input[@data-qa='cvc']");
    By expirationMonth =By.xpath("//input[@data-qa='expiry-month']");
    By expirationYear =By.xpath("//input[@data-qa='expiry-year']");
    By payAndConfirmOrder =By.xpath("//button[@data-qa='pay-button']");
    //By SuccessMessage=By.xpath("//div[@id='success_message']");


    public P04_Checkout checkout() {
        driver.element().click(checkoutButton);
        return this;

    }
    public String verifyAddressDetailsAndReviewYourOrder() {
        String orderReview = driver.element().getText(checkoutDetails);
        System.out.println("Address Details"+ orderReview);
        return orderReview;
    }
    public void fillDescriptionField(String description){
    driver.element().type(enterDescription,description);
    driver.element().click(placeOrder);
    }
    public void completePayment(String NameOnCard,String CardNumber,String CVC,String ExpirationMonth,String ExpirationYear){
    driver.element().type(nameOnCard,NameOnCard)
            .and().type(cardNumber,CardNumber)
            .and().type(cvc,CVC)
            .and().type(expirationMonth,ExpirationMonth)
            .and().type(expirationYear,ExpirationYear)
            .and().click(payAndConfirmOrder);
//        WebDriverWait wait= new WebDriverWait(driver.getDriver(), Duration.ofSeconds(15));
//        wait.until(d ->driver.element().waitUntilElementTextToBe(SuccessMessage,
//                "Your order has been placed successfully!"));

    }

//a[@href='/delete_account']
}
