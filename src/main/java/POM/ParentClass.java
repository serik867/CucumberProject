package POM;

import Utilities.DriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class ParentClass {
    WebDriver driver;
    WebDriverWait wait;

    public ParentClass(){
        driver = DriverFactory.getDriver();
        wait= new WebDriverWait(driver,10);

    }

    public void clickFunction(WebElement element){
        waitUntilClick(element);
        scrollToElement(element);
        element.click();
    }
    public void sendKeysFunction(WebElement element, String value){
        waitUntilVisible(element);
        scrollToElement(element);
        element.clear();
        element.sendKeys(value);
    }

    public void waitUntilVisible(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitUntilClick(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public  void scrollToElement(WebElement element){
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void ElementContainsText(WebElement element , String myText){

        waitUntilVisible(element);
        Assert.assertTrue(element.getText().contains(myText));
    }

    public void listContainsText(List<WebElement> elements , String myText){

        for (WebElement element : elements) {
//            waitUntilVisible(element);
            System.out.println(element);
        }

        Assert.assertTrue(elements.contains(myText));
    }
}
