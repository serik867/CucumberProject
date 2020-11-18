package StepDefinition;

import POM.MainPagePOMElements;
import Utilities.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;

public class Login{

    WebDriver driver;
    MainPagePOMElements pomClass=new MainPagePOMElements();

    @Given("Navigate to the website")
    public void navigateToTheWebsite() {
        driver=DriverFactory.getDriver();
       driver.get("https://test.basqar.techno.study/");

    }


    @And("Enter username and password")
    public void enterUsernameAndPassword() {

    }
}
