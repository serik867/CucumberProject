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
       driver.get("http://automationpractice.com/index.php");
//        System.out.println("HIIII");
    }

    @And("Click the Women button")
    public void clickTheWomenButton() {
        pomClass.findElementAndClickFunction("womenBtn");
    }

    @And("Go back and click Dresses button")
    public void goBackAndClickDressesButton() {

        pomClass.findElementAndClickFunction("dressesBtn");
    }
}
