package Pages;

    import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class P05_DeleteAccount {
    SHAFT.GUI.WebDriver driver;

    public P05_DeleteAccount(SHAFT.GUI.WebDriver driver)
    {
        this.driver=driver;
    }
    //Locators

    By deleteAccountButton =By.xpath("//a[@href='/delete_account']");
    By ContinueDeleteButton=By.xpath("//a[@data-qa='continue-button']");

    public void deleteAccount(){
        driver.element().click(deleteAccountButton)
                .and().click(ContinueDeleteButton);
    }

}
