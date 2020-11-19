package StepDefinition;

import POM.MainPagePOMElements;
import POM.SetupPageElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class SetupPage {
    WebDriver driver;
    SetupPageElements setupClass=new SetupPageElements();

    @Given("Click button in SetupPage {string}")
    public void clickButtonInSetupPage(String btnName) {

        setupClass.findElementAndClickFunction(btnName);
    }


    @And("Enter to {string} the value {string}")
    public void enterToTheValue(String inputName, String value) {

        setupClass.findInputAndSendKeys(inputName,value);
    }

//
//    @Then("{string} list have a {string}")
//    public void listHaveA(String countryNames, String countryName) {
//        setupClass.arrayListContains(countryNames,countryName);
//    }

    @Then("It should show {string}")
    public void itShouldShow(String message) {
        setupClass.findElementAndVerifyElementContainText(message,"successfully");
    }
}
