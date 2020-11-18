package POM;

import Utilities.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPagePOMElements extends ParentClass {

    public MainPagePOMElements(){
        PageFactory.initElements(DriverFactory.getDriver(),this);

    }

    @FindBy(xpath = "//*[@id=\"mat-input-0\"]")
    private WebElement userNameInput;

    @FindBy(xpath = "//*[@id=\"mat-input-1\"]")
    private WebElement passwordInput;

    @FindBy(xpath = "//*[@id=\"login-form\"]/div[2]/form/button")
    private WebElement loginBtn;



    WebElement myElement;

    public void findElementAndClickFunction(String ElementName){

        switch (ElementName) {
            case "loginBtn":
                myElement = loginBtn;
                break;

        }
            clickFunction(myElement);
        }

    public void findInputAndSendKeys(String ElementName,String value){
        switch (ElementName) {
            case "userNameInput":
                myElement = userNameInput;
                break;
            case "passwordInput":
                myElement =passwordInput;
                break;
                }
        sendKeysFunction(myElement,value);
    }

}
