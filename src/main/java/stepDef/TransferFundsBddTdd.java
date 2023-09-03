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

public class TransferFundsBddTdd extends env_target {
    @Given("User is on transfer funds page")
    public void userIsOnTransferFundsPage() {
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
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href, '/parabank/transfer.htm')]"))
        );
        //Set element locate
        //Click Transfer Funds Button
        driver.findElement(By.xpath("//a[contains(@href, '/parabank/transfer.htm')]")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='toAccountId']/option[2]"))
        );
    }

    @When("User enters the amount")
    public void userEntersTheAmount() {
        //Set element locate
        driver.findElement(By.xpath("//input[@id='amount'][@type='text']")).sendKeys("100");
    }

    @And("Users choose from accounts")
    public void usersChooseFromAccounts() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set element locate
        driver.findElement(By.xpath("//select[@id='fromAccountId']")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='fromAccountId']/option[1]"))
        );
        //Set element locate
        driver.findElement(By.xpath("//*[@id='fromAccountId']/option[1]")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.elementSelectionStateToBe(By.xpath("//*[@id='fromAccountId']/option[1]"), true)
        );
    }

    @And("User selects the account to")
    public void userSelectsTheAccountTo() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set element locate
        driver.findElement(By.xpath("//select[@id='toAccountId']")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='toAccountId']/option[2]"))
        );
        //Set element locate
        driver.findElement(By.xpath("//*[@id='toAccountId']/option[2]")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.elementSelectionStateToBe(By.xpath("//*[@id='toAccountId']/option[2]"), true)
        );
    }

    @And("User clicks the transfer submit button")
    public void userClicksTheTransferSubmitButton() {
        //Set element locate
        //Click Transfer Submit Button
        driver.findElement(By.xpath("//input[@type='submit'][@class='button'][@value='Transfer']")).click();
    }

    @Then("User verifies the result of the transfer")
    public void userVerifiesTheResultOfTheTransfer() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='title'][contains(text(), 'Transfer Complete!')]"))
        );
        //Quit chrome
        driver.quit();
    }

    @When("^User inputs the (.*)$")
    public void userInputsTheAmount(String amount) {
        //Set element locate
        driver.findElement(By.xpath("//input[@id='amount'][@type='text']")).sendKeys(amount);

    }

    @Then("^User gets verifies the (.*) of the transfer$")
    public void userGetsVerifiesTheResultOfTheTransfer(String result) {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        if (result == "Passed"){
            //Set case stop tunggu
            wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='title'][contains(text(), 'Transfer Complete!')]"))
            );
        } else if (result == "Failed") {
            //Set case stop tunggu
            wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='amount.errors'][contains(text(), 'The amount cannot be empty. ')]"))
            );
        }
        //Quit chrome
        driver.quit();
    }
}
