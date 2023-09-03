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

public class RegisterBddTdd extends env_target {
    @Given("User is on the registration page")
    public void userIsOnTheRegistrationPage() {
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
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href, 'register.htm')]"))
        );
        //Set element locate
        //Click Register Button
        driver.findElement(By.xpath("//a[contains(@href, 'register.htm')]")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='title'][contains(text(), 'Signing up is easy!')]"))
        );
    }

    @When("User fills in the registration data")
    public void userFillsInTheRegistrationData() {
        //Set element locate
        //Input First Name
        driver.findElement(By.id("customer.firstName")).sendKeys("Morgans");
        //Input Last Name
        driver.findElement(By.name("customer.lastName")).sendKeys("Hawks");
        //Input Address
        driver.findElement(By.id("customer.address.street")).sendKeys("Jln. Pattimura No. 56A");
        //Input City
        driver.findElement(By.name("customer.address.city")).sendKeys("Bandung");
        //Input State
        driver.findElement(By.id("customer.address.state")).sendKeys("Indonesia");
        //Input Zip Code
        driver.findElement(By.name("customer.address.zipCode")).sendKeys("56565");
        //Input Phone #
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("080800556688");
        //Input SSN
        driver.findElement(By.name("customer.ssn")).sendKeys("12321");
    }

    @And("User clicks the register button")
    public void userClicksTheRegisterButton() {
        //Set element locate
        //Click Register Submit Button
        driver.findElement(By.xpath("//input[@type='submit'][@class='button'][@value='Register']")).click();
    }

    @Then("User verifies register results")
    public void userVerifiesRegisterResults() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(), 'Your account was created successfully. You are now logged in.')]"))
        );
        //Quit chrome
        driver.quit();
    }

    @Then("User gets an error message")
    public void userGetsAnErrorMessage() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("customer.username.errors"))
        );
        //Quit chrome
        driver.quit();
    }

    @And("User fills in username and password")
    public void userFillsInUsernameAndPassword() {
        //Set element locate
        //Input Username
        driver.findElement(By.id("customer.username")).sendKeys("moHawks57");
        //Input Password
        driver.findElement(By.name("customer.password")).sendKeys("12345678");
        //Input Confirm Password
        driver.findElement(By.id("repeatedPassword")).sendKeys("12345678");
    }

    @And("^User inputs in (.*) and (.*) and (.*)$")
    public void userInputsInUsernameAndPasswordAndConfirm_password(String username, String password, String confirm_password) {
        //Set element locate
        //Input Username
        driver.findElement(By.id("customer.username")).sendKeys(username);
        //Input Password
        driver.findElement(By.name("customer.password")).sendKeys(password);
        //Input Confirm Password
        driver.findElement(By.id("repeatedPassword")).sendKeys(confirm_password);
    }

    @Then("^User gets verify register (.*)$")
    public void userGetsVerifyRegisterResult(String result) {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        if (result == "Passed"){
            //Set case stop tunggu
            wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(), 'Your account was created successfully. You are now logged in.')]"))
            );
        } else if (result == "Failed 1") {
            //Set case stop tunggu
            wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.id("customer.username.errors"))
            );
        } else if (result == "Failed 2") {
            //Set case stop tunggu
            wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.id("customer.password.errors"))
            );
        } else if (result == "Failed 3") {
            //Set case stop tunggu
            wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.id("repeatedPassword.errors"))
            );
        }
        //Quit chrome
        driver.quit();
    }
}
