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

public class BillPayBddTdd extends env_target {
    @Given("User is on bill pay page")
    public void userIsOnBillPayPage() {
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
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href, '/parabank/billpay.htm')]"))
        );
        //Set element locate
        //Click Bill Pay Button
        driver.findElement(By.xpath("//a[contains(@href, '/parabank/billpay.htm')]")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='submit'][@class='button'][@value='Send Payment']"))
        );
    }

    @When("User fills in the payee information")
    public void userFillsInThePayeeInformation() {
        //Set element locate
        //Input Payee name
        driver.findElement(By.xpath("//input[@name='payee.name']")).sendKeys("Alexander Morgans");
        //Input Address
        driver.findElement(By.xpath("//input[@name='payee.address.street']")).sendKeys("Jln. Diponegoro No. 02C");
        //Input City
        driver.findElement(By.xpath("//input[@name='payee.address.city']")).sendKeys("Samarinda");
        //Input State
        driver.findElement(By.xpath("//input[@name='payee.address.state']")).sendKeys("Indonesia");
        //Input Zip Code
        driver.findElement(By.xpath("//input[@name='payee.address.zipCode']")).sendKeys("56432");
        //Input Phone #
        driver.findElement(By.xpath("//input[@name='payee.phoneNumber']")).sendKeys("085643210012");
        //Input Account #
        driver.findElement(By.xpath("//input[@name='payee.accountNumber']")).sendKeys("08564");
        //Input Verify Account #
        driver.findElement(By.xpath("//input[@name='verifyAccount']")).sendKeys("08564");
        //Input Amount
        driver.findElement(By.xpath("//input[@name='amount']")).sendKeys("500");
    }

    @And("User selects the account to pay")
    public void userSelectsTheAccountToPay() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Input From Account #
        driver.findElement(By.xpath("//select[@name='fromAccountId']")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rightPanel']/div/div[1]/form/table/tbody/tr[13]/td[2]/select/option[1]"))
        );
        //Set element locate
        driver.findElement(By.xpath("//*[@id='rightPanel']/div/div[1]/form/table/tbody/tr[13]/td[2]/select/option[1]")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.elementSelectionStateToBe(By.xpath("//*[@id='rightPanel']/div/div[1]/form/table/tbody/tr[13]/td[2]/select/option[1]"), true)
        );
    }

    @And("User clicks the send payment submit button")
    public void userClicksTheSendPaymentSubmitButton() {
        //Set element locate
        //Click Send Payment Submit Button
        driver.findElement(By.xpath("//input[@type='submit'][@class='button'][@value='Send Payment']")).click();
    }

    @Then("User gets verifies send payment results")
    public void userGetsVerifiesSendPaymentResults() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='title'][contains(text(), 'Bill Payment Complete')]"))
        );
        //Quit chrome
        driver.quit();
    }

    @When("User is not fulfilled the payee information")
    public void userIsNotFulfilledThePayeeInformation() {
        //Set element locate
        //Input Payee name
        driver.findElement(By.xpath("//input[@name='payee.name']")).sendKeys("Alexander Morgans");
    }

    @Then("Users get the required payee data error message")
    public void usersGetTheRequiredPayeeDataErrorMessage() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='error'][contains(text(), 'The amount cannot be empty. ')]"))
        );
        //Quit chrome
        driver.quit();
    }

    @When("^User fills in the payee information and (.*)$")
    public void userFillsInThePayeeInformationAndAmount(String amount) {
        //Set element locate
        //Input Payee name
        driver.findElement(By.xpath("//input[@name='payee.name']")).sendKeys("Alexander Morgans");
        //Input Address
        driver.findElement(By.xpath("//input[@name='payee.address.street']")).sendKeys("Jln. Diponegoro No. 02C");
        //Input City
        driver.findElement(By.xpath("//input[@name='payee.address.city']")).sendKeys("Samarinda");
        //Input State
        driver.findElement(By.xpath("//input[@name='payee.address.state']")).sendKeys("Indonesia");
        //Input Zip Code
        driver.findElement(By.xpath("//input[@name='payee.address.zipCode']")).sendKeys("56432");
        //Input Phone #
        driver.findElement(By.xpath("//input[@name='payee.phoneNumber']")).sendKeys("085643210012");
        //Input Account #
        driver.findElement(By.xpath("//input[@name='payee.accountNumber']")).sendKeys("08564");
        //Input Verify Account #
        driver.findElement(By.xpath("//input[@name='verifyAccount']")).sendKeys("08564");
        //Input Amount
        driver.findElement(By.xpath("//input[@name='amount']")).sendKeys(amount);
    }

    @Then("^User verifies send payment (.*)$")
    public void userVerifiesSendPaymentResult(String result) {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        if (result == "Passed"){
            //Set case stop tunggu
            wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='title'][contains(text(), 'Bill Payment Complete')]"))
            );
        } else if (result == "Failed") {
            //Set case stop tunggu
            wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='error'][contains(text(), 'The amount cannot be empty. ')]"))
            );
        }
        //Quit chrome
        driver.quit();
    }
}
