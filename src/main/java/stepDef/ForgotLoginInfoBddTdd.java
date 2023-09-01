package stepDef;

import config.env_target;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ForgotLoginInfoBddTdd extends env_target {
    @Given("User is on the landing page")
    public void userIsOnTheLandingPage() {
        //Set driver location path
        System.setProperty("webdriver.chrome.driver","src\\main\\resources\\drivers\\chromedriver.exe");
        //Maximize driver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //Set url
        driver.get(baseUrl);
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href, 'lookup.htm')]"))
        );
    }

    @When("User clicks the forgot login info button")
    public void userClicksTheForgotLoginInfoButton() {
        //Set element locate
        //Click Forgot Login Info Button
        driver.findElement(By.xpath("//a[contains(@href, 'lookup.htm')]")).click();
    }

    @And("User fills the account data")
    public void userFillsTheAccountData() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='submit'][@class='button'][@value='Find My Login Info']"))
        );
        //Set element locate
        //Input First Name
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Morgans");
        //Input Last Name
        driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Hawks");
        //Input Address
        driver.findElement(By.xpath("//input[@id='address.street']")).sendKeys("Jln. Pattimura No. 56A");
        //Input City
        driver.findElement(By.xpath("//input[@name='address.city']")).sendKeys("Bandung");
        //Input State
        driver.findElement(By.xpath("//input[@id='address.state']")).sendKeys("Indonesia");
        //Input Zip Code
        driver.findElement(By.xpath("//input[@name='address.zipCode']")).sendKeys("56565");
        //Input SSN
        driver.findElement(By.xpath("//input[@id='ssn']")).sendKeys("12321");
    }

    @And("User clicks the find my login info submit button")
    public void userClicksTheFindMyLoginInfoSubmitButton() {
        //Set element locate
        //Click Find My Login Info Submit Button
        driver.findElement(By.xpath("//input[@type='submit'][@class='button'][@value='Find My Login Info']")).click();
    }

    @Then("User gets the login info results")
    public void userGetsTheLoginInfoResults() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(), 'Your login information was located successfully. You are now logged in. ')]"))
        );
        //Quit chrome
        driver.quit();
    }

    @And("User is not fulfilled the account data")
    public void userIsNotFulfilledTheAccountData() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='submit'][@class='button'][@value='Find My Login Info']"))
        );
        //Set element locate
        //Input Last Name
        driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Hawks");
        //Input Address
        driver.findElement(By.xpath("//input[@id='address.street']")).sendKeys("Jln. Pattimura No. 56A");
        //Input City
        driver.findElement(By.xpath("//input[@name='address.city']")).sendKeys("Bandung");
        //Input State
        driver.findElement(By.xpath("//input[@id='address.state']")).sendKeys("Indonesia");
        //Input Zip Code
        driver.findElement(By.xpath("//input[@name='address.zipCode']")).sendKeys("56565");
        //Input SSN
        driver.findElement(By.xpath("//input[@id='ssn']")).sendKeys("12321");
    }

    @Then("Users get the required account data error message")
    public void usersGetTheRequiredAccountDataErrorMessage() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("firstName.errors"))
        );
        //Quit chrome
        driver.quit();
    }

    @And("^User fills the account data and (.*)$")
    public void userFillsTheAccountDataAndFirstname(String firstname) {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='submit'][@class='button'][@value='Find My Login Info']"))
        );
        //Set element locate
        //Input First Name
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(firstname);
        //Input Last Name
        driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Hawks");
        //Input Address
        driver.findElement(By.xpath("//input[@id='address.street']")).sendKeys("Jln. Pattimura No. 56A");
        //Input City
        driver.findElement(By.xpath("//input[@name='address.city']")).sendKeys("Bandung");
        //Input State
        driver.findElement(By.xpath("//input[@id='address.state']")).sendKeys("Indonesia");
        //Input Zip Code
        driver.findElement(By.xpath("//input[@name='address.zipCode']")).sendKeys("56565");
        //Input SSN
        driver.findElement(By.xpath("//input[@id='ssn']")).sendKeys("12321");
    }

    @Then("^User gets the login info (.*)$")
    public void userGetsTheLoginInfoResult(String result) {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        if (result == "Passed"){
            //Set case stop tunggu
            wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(), 'Your login information was located successfully. You are now logged in. ')]"))
            );
        } else if (result == "Failed 1") {
            //Set case stop tunggu
            wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='error'][contains(text(), 'The customer information provided could not be found.')]"))
            );
        }
        else if (result == "Failed 2"){
            //Set case stop tunggu
            wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.id("firstName.errors"))
            );
        }
        //Quit chrome
        driver.quit();
    }
}
