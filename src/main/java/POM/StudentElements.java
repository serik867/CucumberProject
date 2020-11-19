package POM;

import Utilities.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StudentElements extends ParentClass {
    public StudentElements(){
        PageFactory.initElements(DriverFactory.getDriver(),this);

    }
    @FindBy(xpath = "//span[text()=\"Student\"]")
            private WebElement studentBtn;

    @FindBy(xpath = "//span[text()=\"Students\"]")
            private WebElement studentsBtn;



    WebElement myElement;

    public void findElementAndClickFunction(String ElementName){

        switch (ElementName) {
            case "studentBtn":
                myElement = studentBtn;
                break;
            case "studentsBtn":
                myElement = studentsBtn;
                break;

        }
        clickFunction(myElement);
    }

    public void findInputAndSendKeys(String ElementName,String value){
        switch (ElementName) {
//            case "userNameInput":
//                myElement = userNameInput;
//                break;
//            case "passwordInput":
//                myElement =passwordInput;
//                break;
 }
//        sendKeysFunction(myElement,value);
  }

}


