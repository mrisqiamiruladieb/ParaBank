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

public class RequestLoanBddTdd extends env_target {
    @Given("User is on request loan page")
    public void userIsOnRequestLoanPage() {
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
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href, '/parabank/requestloan.htm')]"))
        );
        //Set element locate
        //Click Request Loan Button
        driver.findElement(By.xpath("//a[contains(@href, '/parabank/requestloan.htm')]")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='submit'][@class='button'][@value='Apply Now']"))
        );
    }

    @When("User fills in the loan amount and down payment")
    public void userFillsInTheLoanAmountAndDownPayment() {
        //Set element locate
        //Input Loan Amount
        driver.findElement(By.xpath("//input[@id='amount']")).sendKeys("2000");
        //Input Down Payment
        driver.findElement(By.xpath("//input[@id='downPayment']")).sendKeys("250");
    }

    @And("User selects the from account")
    public void userSelectsTheFromAccount() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Input From Account #
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='fromAccountId']"))
        );
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

    @And("User clicks the apply now submit button")
    public void userClicksTheApplyNowSubmitButton() {
        //Click Apply Now Submit Button
        driver.findElement(By.xpath("//input[@type='submit'][@class='button'][@value='Apply Now']")).click();
    }

    @Then("User verifies the results of the request loan")
    public void userVerifiesTheResultsOfTheRequestLoan() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(), 'Congratulations, your loan has been approved.')]"))
        );
        //Quit chrome
        driver.quit();
    }

    @Then("User gets a loan request error message")
    public void userGetsALoanRequestErrorMessage() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='error'][contains(text(), 'An internal error has occurred and has been logged.')]"))
        );
        //Quit chrome
        driver.quit();
    }

    @When("^User inputs in the (.*) and (.*)$")
    public void userInputsInTheLoan_amountAndDown_payment(String loan_amount, String down_payment) {
        //Set element locate
        //Input Loan Amount
        driver.findElement(By.xpath("//input[@id='amount']")).sendKeys(loan_amount);
        //Input Down Payment
        driver.findElement(By.xpath("//input[@id='downPayment']")).sendKeys(down_payment);
    }

    @Then("^User gets verifies the (.*) of the request loan$")
    public void userGetsVerifiesTheResultOfTheRequestLoan(String result) {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        if (result == "Passed"){
            //Set case stop tunggu
            wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(), 'Congratulations, your loan has been approved.')]"))
            );
        } else if (result == "Failed") {
            //Set case stop tunggu
            wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='error'][contains(text(), 'An internal error has occurred and has been logged.')]"))
            );
        }
        //Quit chrome
        driver.quit();
    }
}
