package StepDefinition;

import POM.MainPagePOMElements;
import Utilities.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class Login{

    WebDriver driver;
    MainPagePOMElements pomClass=new MainPagePOMElements();

    @Given("Navigate to the website")
    public void navigateToTheWebsite() {
        driver=DriverFactory.getDriver();
        driver.manage().window().maximize();
       driver.get("https://test.basqar.techno.study/");

    }


    @And("Enter username and password")
    public void enterUsernameAndPassword() {
        pomClass.findInputAndSendKeys("userNameInput","admin");
        pomClass.findInputAndSendKeys("passwordInput","F4pj8Zsq52mX");

    }

    @Then("Click Login button")
    public void clickLoginButton() {
        pomClass.findElementAndClickFunction("loginBtn");
    }
}
