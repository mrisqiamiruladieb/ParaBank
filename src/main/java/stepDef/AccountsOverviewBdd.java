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

public class AccountsOverviewBdd extends env_target {
    @Given("User is on accounts overview page")
    public void userIsOnAccountsOverviewPage() {
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
    }

    @When("Users click on the account number to find out the details")
    public void usersClickOnTheAccountNumberToFindOutTheDetails() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='accountTable']/tbody/tr[1]/td[1]/a"))
        );
        //Set element locate
        driver.findElement(By.xpath("//*[@id='accountTable']/tbody/tr[1]/td[1]/a")).click();
    }

    @Then("User gets account details of that number")
    public void userGetsAccountDetailsOfThatNumber() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='title'][contains(text(), 'Account Details')]"))
        );
        //Quit chrome
        driver.quit();
    }

    @And("User clicks on transaction")
    public void userClicksOnTransaction() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='transactionTable']/tbody/tr[1]/td[2]/a"))
        );
        //Set element locate
        driver.findElement(By.xpath("//*[@id='transactionTable']/tbody/tr[1]/td[2]/a")).click();
    }

    @Then("User gets transaction details")
    public void userGetsTransactionDetails() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='title'][contains(text(), 'Transaction Details')]"))
        );
        //Quit chrome
        driver.quit();
    }

    @And("User clicks on the activity period filter")
    public void userClicksOnTheActivityPeriodFilter() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='submit'][@class='button'][@value='Go']"))
        );
        //Set element locate
        driver.findElement(By.id("month")).click();
    }

    @And("User selects the invalid activity period")
    public void userSelectsTheInvalidActivityPeriod() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[@value='January']"))
        );
        //Set element locate
        driver.findElement(By.xpath("//option[@value='January']")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.elementSelectionStateToBe(By.xpath("//option[@value='January']"), true)
        );
    }

    @And("User clicks the go submit button")
    public void userClicksTheGoSubmitButton() {
        //Set element locate
        driver.findElement(By.xpath("//input[@type='submit'][@class='button'][@value='Go']")).click();
    }

    @Then("User gets not found message")
    public void userGetsNotFoundMessage() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//b[contains(text(), 'No transactions found.')]"))
        );
        //Quit chrome
        driver.quit();
    }
}
