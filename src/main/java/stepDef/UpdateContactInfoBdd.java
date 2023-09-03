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

public class UpdateContactInfoBdd extends env_target {
    @Given("User is on update contact info page")
    public void userIsOnUpdateContactInfoPage() {
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
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(), 'Customer Login')]"))
        );
        //Set element locate
        //Input Username
        driver.findElement(By.xpath("//input[@type='text'][@class='input'][@name='username']")).sendKeys("moHawks56");
        //Input Password
        driver.findElement(By.xpath("//input[@type='password'][@class='input'][@name='password']")).sendKeys("12345678");
        //Click Login Submit Button
        driver.findElement(By.xpath("//input[@type='submit'][@class='button'][@value='Log In']")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href, '/parabank/updateprofile.htm')]"))
        );
        //Set element locate
        //Click Update Contact Info Button
        driver.findElement(By.xpath("//a[contains(@href, '/parabank/updateprofile.htm')]")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='submit'][@class='button'][@value='Update Profile']"))
        );
    }

    @When("User fills in the update profile data")
    public void userFillsInTheUpdateProfileData() {
        //Set element locate
        //Input First Name
        driver.findElement(By.xpath("//input[@name='customer.firstName']")).sendKeys("Morgans");
        //Input Last Name
        driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys("Blake");
        //Input Address
        driver.findElement(By.xpath("//input[@name='customer.address.street']")).sendKeys("Jln. Melati Indah No. 11B");
        //Input City
        driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys("Bandung");
        //Input State
        driver.findElement(By.xpath("//input[@name='customer.address.state']")).sendKeys("Indonesia");
        //Input Zip Code
        driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys("56565");
        //Input Phone #
        driver.findElement(By.xpath("//input[@name='customer.phoneNumber']")).sendKeys("080800556688");
    }

    @And("User clicks the update profile submit button")
    public void userClicksTheUpdateProfileSubmitButton() {
        //Set element locate
        //Click Update Profile Submit Button
        driver.findElement(By.xpath("//input[@type='submit'][@class='button'][@value='Update Profile']")).click();
    }

    @Then("Users verify updated profile results")
    public void usersVerifyUpdatedProfileResults() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='title'][contains(text(), 'Profile Updated')]"))
        );
        //Quit chrome
        driver.quit();
    }

    @When("User is not fulfilled the update profile data")
    public void userIsNotFulfilledTheUpdateProfileData() {
        //Set element locate
        //Input First Name
        driver.findElement(By.xpath("//input[@name='customer.firstName']")).sendKeys("Morgans");
        //Input Last Name
        driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys("Blake");
        //Input Address
        driver.findElement(By.xpath("//input[@name='customer.address.street']")).sendKeys("Jln. Melati Indah No. 11B");
        //Input City
        driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys("Bandung");
        //Input State
        driver.findElement(By.xpath("//input[@name='customer.address.state']")).clear();
        //Input Zip Code
        driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys("56565");
        //Input Phone #
        driver.findElement(By.xpath("//input[@name='customer.phoneNumber']")).sendKeys("080800556688");
    }

    @Then("Users get the required update profile data error message")
    public void usersGetTheRequiredUpdateProfileDataErrorMessage() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='error ng-scope'][contains(text(), 'State is required.')]"))
        );
        //Quit chrome
        driver.quit();
    }
}
