package Pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class P01_Verify {
    SHAFT.GUI.WebDriver driver;

    public P01_Verify(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    By homePageLocator = By.xpath("//a[@style=\"color: orange;\"]");
    By signUpLocator = By.xpath("//a[@href='/login']");
    By loggedVerfication=By.xpath("//a[@href='/logout']");
    By CartPageLocator=By.xpath("//a[@href=\"/view_cart\"]/i[contains(.,Cart)]");
//    By SuccessMessage=By.xpath("//div[@id='success_message']");
    public void verifyHome() {
        driver.assertThat().element(homePageLocator).isVisible().perform();
        System.out.println("HomePageVerified");
    }
    public void verifySignup() {
        driver.element().click(signUpLocator);
        driver.assertThat().element(signUpLocator).isVisible().perform();
        System.out.println("SignupVerified");
    }
    public void verifyLogin() {
        driver.assertThat().element(loggedVerfication).isVisible().perform();
        System.out.println("Verified logging in");
    }
    public void verifyCartPage() {
        driver.element().click(CartPageLocator);
        driver.assertThat().element(CartPageLocator).isVisible().perform();
        System.out.println("CartPageVerified");
    }
//    public void verifySuccessMessage(){
//        driver.assertThat().element(SuccessMessage).text()
//                .isEqualTo("Your order has been placed successfully!")
//                .perform();
//    }

}
