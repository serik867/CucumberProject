package POM;

import Utilities.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HRElements extends ParentClass {
    public HRElements(){
        PageFactory.initElements(DriverFactory.getDriver(),this);

    }

    @FindBy(xpath = "//span[text()='Human Resources']")
    private WebElement HRBtn;

    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    private WebElement HRSetupBtn;

    @FindBy(xpath = "//span[text()='Employees']")
    private WebElement employeesBtn;



    WebElement myElement;

    public void findElementAndClickFunction(String ElementName){

        switch (ElementName) {
            case "HRBtn":
                myElement = HRBtn;
                break;

        }
        clickFunction(myElement);
    }

    public void findInputAndSendKeys(String ElementName,String value){
        switch (ElementName) {
            case "HRBtn":
                myElement = HRBtn;
                break;
            case "HRSetupBtn":
                myElement =HRSetupBtn;
                break;
            case "employeesBtn":
                myElement =employeesBtn;
                break;
        }
        sendKeysFunction(myElement,value);
    }

}
