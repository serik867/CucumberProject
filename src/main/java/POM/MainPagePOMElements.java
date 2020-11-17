package POM;

import Utilities.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPagePOMElements extends ParentClass {

    public MainPagePOMElements(){
        PageFactory.initElements(DriverFactory.getDriver(),this);

    }

    @FindBy(css = "a[title='Women']")
    private WebElement womenBtn;

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
    private WebElement dressesBtn;



    WebElement myElement;

    public void findElementAndClickFunction(String ElementName){

        switch (ElementName) {
            case "womenBtn":
                myElement = womenBtn;
                break;
            case "dressesBtn":
                myElement = dressesBtn;
                break;
        }
            clickFunction(myElement);
        }
}
