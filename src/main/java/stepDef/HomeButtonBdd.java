package stepDef;

import config.env_target;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomeButtonBdd extends env_target {

    //variabel global
    private String new_url;
    private String new_title;

    @Given("User is on landing page")
    public void userIsOnLandingPage() {
        //Set driver location path
        System.setProperty("webdriver.chrome.driver","src\\main\\resources\\drivers\\chromedriver.exe");
        //Maximize driver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //Set url
        driver.get(baseUrl);
    }

    @When("User clicks the withdraw funds button")
    public void userClicksTheWithdrawFundsButton() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rightPanel']/ul[1]/li[2]/a"))
        );
        //Set element locate
        //Click Withdraw Funds Button
        driver.findElement(By.xpath("//*[@id='rightPanel']/ul[1]/li[2]/a")).click();
    }

    @Then("User verifies new url result")
    public void userVerifiesNewUrlResult() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Store new_url
        new_url = driver.getCurrentUrl();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.urlToBe(new_url)
        );
        //Quit chrome
        driver.quit();
    }

    @When("User clicks the atm services transfer funds button")
    public void userClicksTheAtmServicesTransferFundsButton() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rightPanel']/ul[1]/li[3]/a"))
        );
        //Set element locate
        //Click Transfer Funds Button
        driver.findElement(By.xpath("//*[@id='rightPanel']/ul[1]/li[3]/a")).click();
    }

    @Then("User verifies new title result")
    public void userVerifiesNewTitleResult() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Store new_title
        new_title = driver.getTitle();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.titleIs(new_title)
        );
        //Quit chrome
        driver.quit();
    }

    @When("User clicks the check balances button")
    public void userClicksTheCheckBalancesButton() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rightPanel']/ul[1]/li[4]/a"))
        );
        //Set element locate
        //Click Check Balances Button
        driver.findElement(By.xpath("//*[@id='rightPanel']/ul[1]/li[4]/a")).click();
    }

    @When("User clicks the make deposits button")
    public void userClicksTheMakeDepositsButton() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rightPanel']/ul[1]/li[5]/a"))
        );
        //Set element locate
        //Click Make Deposits Button
        driver.findElement(By.xpath("//*[@id='rightPanel']/ul[1]/li[5]/a")).click();
    }

    @When("User clicks the bill pay button")
    public void userClicksTheBillPayButton() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rightPanel']/ul[2]/li[2]/a"))
        );
        //Set element locate
        //Click Bill Pay Button
        driver.findElement(By.xpath("//*[@id='rightPanel']/ul[2]/li[2]/a")).click();
    }

    @When("User clicks the account history button")
    public void userClicksTheAccountHistoryButton() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rightPanel']/ul[2]/li[3]/a"))
        );
        //Set element locate
        //Click Account History Button
        driver.findElement(By.xpath("//*[@id='rightPanel']/ul[2]/li[3]/a")).click();
    }

    @When("User clicks the online services transfer funds button")
    public void userClicksTheOnlineServicesTransferFundsButton() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rightPanel']/ul[2]/li[4]/a"))
        );
        //Set element locate
        //Click Transfer Funds Button
        driver.findElement(By.xpath("//*[@id='rightPanel']/ul[2]/li[4]/a")).click();
    }

    @When("User clicks the read more one button")
    public void userClicksTheReadMoreOneButton() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rightPanel']/p[1]/a"))
        );
        //Set element locate
        //Click Read More 1 Button
        driver.findElement(By.xpath("//*[@id='rightPanel']/p[1]/a")).click();
    }

    @When("User clicks the latest news one button")
    public void userClicksTheLatestNewsOneButton() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rightPanel']/ul[3]/li[2]/a"))
        );
        //Set element locate
        //Click Latest News 1 Button
        driver.findElement(By.xpath("//*[@id='rightPanel']/ul[3]/li[2]/a")).click();
    }

    @When("User clicks the latest news two button")
    public void userClicksTheLatestNewsTwoButton() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rightPanel']/ul[3]/li[3]/a"))
        );
        //Set element locate
        //Click Latest News 2 Button
        driver.findElement(By.xpath("//*[@id='rightPanel']/ul[3]/li[3]/a")).click();
    }

    @When("User clicks the latest news three button")
    public void userClicksTheLatestNewsThreeButton() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rightPanel']/ul[3]/li[4]/a"))
        );
        //Set element locate
        //Click Latest News 3 Button
        driver.findElement(By.xpath("//*[@id='rightPanel']/ul[3]/li[4]/a")).click();
    }

    @When("User clicks the read more two button")
    public void userClicksTheReadMoreTwoButton() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rightPanel']/p[2]/a"))
        );
        //Set element locate
        //Click Read More 2 Button
        driver.findElement(By.xpath("//*[@id='rightPanel']/p[2]/a")).click();
    }
}
