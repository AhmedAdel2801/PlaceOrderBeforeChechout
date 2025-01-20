package Pages;

    import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

    public class P03_AddProduct {
        SHAFT.GUI.WebDriver driver;
        public P03_AddProduct(SHAFT.GUI.WebDriver driver)
        {
            this.driver=driver;
        }
        //Locators
        By addProduct1=By.xpath("(//p[contains(.,'Blue Top')]//following::a)[1]");
        By addProduct2= By.xpath("(//p[contains(.,'Men Tshirt')]//following::a)[1]");
        By addProduct3= By.xpath("(//p[contains(.,'Sleeveless Dress')]//following::a)[1]");
        By continueShoppingButton =By.xpath("(//button[@class=\"btn btn-success close-modal btn-block\"])");


        public void addProduct() {
            driver.element().click(addProduct1).click(continueShoppingButton)
                    .and().click(addProduct2).click(continueShoppingButton)
                    .and().click(addProduct3).click(continueShoppingButton);
        }
    }
