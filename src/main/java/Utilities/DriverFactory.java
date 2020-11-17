package Utilities;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DriverFactory {

    private static WebDriver  driver;

    public static WebDriver getDriver(){
//        ChromeOptions options=new ChromeOptions();
//        options.addArguments("headless");
        if(driver==null){
            WebDriverManager.chromedriver().setup(); // this line is for System.setproperty
            driver = new ChromeDriver();

        }
        return driver;
    }


}
