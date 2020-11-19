package StepDefinition;

import POM.MainPagePOMElements;
import POM.StudentElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Student {
    WebDriver driver;
    @Given("Navigate to the basqar website")
    public void navigate_to_the_basqar_website() {
        ChromeDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://test.basqar.techno.study/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Given("Enter the {string} and {string} Click on log in button")
    public void enter_the_and_click_on_log_in_button(String username, String password) {
        WebElement Inputusername = driver.findElement(By.xpath("//*[@id=\"mat-input-0\"]"));
        Inputusername.sendKeys(username);

        WebElement Inputpassword = driver.findElement(By.xpath("//*[@id=\"mat-input-1\"]"));
        Inputpassword.sendKeys(password);

        WebElement logBtn = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/form/button"));
        logBtn.click();


    }

    @Given("Click student")
    public void click_student() {
       WebElement studentClick = driver.findElement(By.xpath("//span[text()=\"Student\"]"));
       studentClick.click();
    }

    @Given("Click students")
    public void click_students() {
        WebElement studentsClick = driver.findElement(By.xpath("//span[text()=\"Students\"]"));
        studentsClick.click();


    }

    @Then("Add new student")
    public void add_new_student() {
        WebElement addBtn = driver.findElement(By.xpath("//ms-add-button/div/button"));
        addBtn.click();
    }
    @Then("FirstName is {string} LastName is {string}")
    public void frist_name_is_last_name_is_student_id_is(String FName, String LName) {
        WebElement InputFname = driver.findElement(By.cssSelector("input[id='ms-text-field-3']"));
        WebElement InputLname = driver.findElement(By.cssSelector("input[id='ms-text-field-4']"));
        InputFname.sendKeys(FName);
        InputLname.sendKeys(LName);

    }

    @And("Click Gender")
    public void clickGender() {
        driver.findElement(By.cssSelector("mat-select[formcontrolname='gender']")).click();

    }

    @And("Click Grade Level")
    public void clickGradeLevel() {
        driver.findElement(By.xpath("//mat-select[@aria-label='School Department']"));
        driver.findElement(By.xpath("//*[@id='mat-option-34']/span")).click();

    }

    @And("Click Section")
    public void clickSection() {
    }

    @And("Click Citizenship")
    public void clickCitizenship() {
    }

    @And("Click Document Type")
    public void clickDocumentType() {
    }

    @Then("Click Document Number")
    public void clickDocumentNumber() {
    }
}

