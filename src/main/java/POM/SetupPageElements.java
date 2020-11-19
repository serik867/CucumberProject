package POM;

import Utilities.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.util.ArrayList;
import java.util.List;


public class SetupPageElements extends ParentClass{
    public SetupPageElements(){
        PageFactory.initElements(DriverFactory.getDriver(),this);

    }

    @FindBy(xpath = "//a/span[text()='Setup']")
    private WebElement setupBtn;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement paramBtn;
//
    @FindBy(xpath = "//span[text()='Countries']")
    private WebElement countryBtn;

    @FindBy(xpath = "//ms-add-button/div/button")
    private WebElement addCountryBtn;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input")
    private WebElement countryNameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']/input")
    private WebElement countryCodeInput;

    @FindBy(xpath = "//ms-save-button/button")
    private WebElement countrySaveBtn;

//    @FindBy(xpath = "//tbody//tr/td[2]")
//    private ArrayList<WebElement> CountryNames;

    @FindAll({
            @FindBy(xpath = "//table/tbody/tr/td[2]")
    })
    private List<WebElement> CountryNames;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement SuccessfullyMessage;

    WebElement myElement;

    public void findElementAndClickFunction(String ElementName){

        switch (ElementName) {
            case "setupBtn":
                myElement = setupBtn;
                break;
            case "paramBtn":
                myElement = paramBtn;
                break;
            case "countryBtn":
                myElement=countryBtn;
                break;
            case "addCountryBtn":
                myElement=addCountryBtn;
                break;
            case "countrySaveBtn":
                myElement=countrySaveBtn;
                break;

        }
        clickFunction(myElement);
    }

    public void findInputAndSendKeys(String ElementName,String value){
        switch (ElementName) {
            case "countryNameInput":
                myElement = countryNameInput;
                break;
            case "countryCodeInput":
                myElement =countryCodeInput;
                break;
        }
        sendKeysFunction(myElement,value);
    }


    public void arrayListContains(String elementName, String value){
        List<WebElement> list=null;
//        ArrayList<String> arrayListString=null;
        switch (elementName) {
            case "CountryNames":
                list = CountryNames;
                break;
        }
        listContainsText(list,value);
        for (WebElement webElement : list) {
            System.out.println(webElement.getText());
        }
//        Assert.assertTrue(arrayListString.contains(value));
    }
    public void findElementAndVerifyElementContainText(String elementName , String WhichText){

        switch (elementName){
            case "SuccessfullyMessage":
                myElement=SuccessfullyMessage;
                break;
//            case "ErrorMessage":
//                myElement=ErrorMessage;
//                break;

        }

//            Creating one method in parent class which is get the element and it is containing the WhichText(parameter)

        ElementContainsText(myElement , WhichText);

    }

}
