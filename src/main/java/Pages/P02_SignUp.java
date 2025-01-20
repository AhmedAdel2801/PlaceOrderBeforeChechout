package Pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class P02_SignUp {
    SHAFT.GUI.WebDriver driver;

    public P02_SignUp(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    By inputName = By.xpath("//input[@name='name']");
    By inputEmail = By.xpath("//input[@data-qa='signup-email']");
    By Button = By.xpath("//button[@data-qa='signup-button']");
    By genderSelection =By.xpath("//label[@for='id_gender1']//input[contains(.,Mr. )]");
    By password =By.xpath("//input[@data-qa='password']");
    By dayOfBirth =By.xpath("//select[@data-qa='days']/option[contains(@value,'30')]");
    By monthOfBirth =By.xpath("//select[@data-qa='months']/option[contains(@value,'10')]");
    By yearOfBirth =By.xpath("//select[@data-qa='years']/option[contains(@value,'2000')]");
    By button1 =By.xpath("//input[@name='newsletter']");
    By button2 =By.xpath("//input[@name='optin']");
    By firstName =By.xpath("//input[@data-qa='first_name']");
    By lastName =By.xpath("//input[@data-qa='last_name']");
    By company =By.xpath("//input[@data-qa='company']");
    By address1 =By.xpath("//input[@data-qa='address']");
    By address2 =By.xpath("//input[@data-qa='address2']");
    By countrySelection =By.xpath("//select[@data-qa='country']/option[contains(@value,'India')]");
    By state =By.xpath("//input[@data-qa='state']");
    By city =By.xpath("//input[@data-qa='city']");
    By zipCode =By.xpath("//input[@data-qa='zipcode']");
    By mobileNumber =By.xpath("//input[@data-qa='mobile_number']");
    By createButton =By.xpath("//button[@data-qa='create-account']");
    By continueButton =By.xpath("//a[@data-qa='continue-button']");

    public void fillSignupFields(String name, String email) {
        driver.element().type(inputName,name)
                .and().type(inputEmail,email).click(Button);
    }
    public void enterAccountInformation(String Password , String FristName,String LastName, String Company,String Address1,
                                        String Address2,String State, String City,String ZipCode, String MobileNumber){
        driver.element()
                .and().click(genderSelection)
                .and().type(password,Password)
                .and().click(dayOfBirth)
                .and().click(monthOfBirth)
                .and().click(yearOfBirth)
                .and().click(button1)
                .and().click(button2)
                .and().type(firstName,FristName)
                .and().type(lastName,LastName)
                .and().type(company,Company)
                .and().type(address1,Address1)
                .and().type(address2,Address2)
                .and().click(countrySelection)
                .and().type(state,State)
                .and().type(city,City)
                .and().type(zipCode,ZipCode)
                .and().type(mobileNumber,MobileNumber)
                .and().click(createButton)
                .and().click(continueButton);

    }


}
