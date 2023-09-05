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

public class HeaderIconButtonBddTdd extends env_target {
    @Given("User is on the home page")
    public void userIsOnTheHomePage() {
        //Set driver location path
        System.setProperty("webdriver.chrome.driver","src\\main\\resources\\drivers\\chromedriver.exe");
        //Maximize driver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //Set url
        driver.get(baseUrl);
    }

    @When("User clicks the home icon button")
    public void userClicksTheHomeIconButton() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='headerPanel']/ul[2]/li[1]/a"))
        );
        //Set element locate
        //Click Home Icon Button
        driver.findElement(By.xpath("//*[@id='headerPanel']/ul[2]/li[1]/a")).click();
    }

    @Then("User verifies home icon button result")
    public void userVerifiesHomeIconButtonResult() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@class='captionone'][contains(text(), 'ATM Services')]"))
        );
        //Quit chrome
        driver.quit();
    }

    @When("User clicks the people icon button")
    public void userClicksThePeopleIconButton() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='headerPanel']/ul[2]/li[2]/a"))
        );
        //Set element locate
        //Click People Icon Button
        driver.findElement(By.xpath("//*[@id='headerPanel']/ul[2]/li[2]/a")).click();
    }

    @Then("User verifies people icon button result")
    public void userVerifiesPeopleIconButtonResult() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='title'][contains(text(), 'ParaSoft Demo Website')]"))
        );
        //Quit chrome
        driver.quit();
    }

    @When("User clicks the mail icon button")
    public void userClicksTheMailIconButton() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='headerPanel']/ul[2]/li[3]/a"))
        );
        //Set element locate
        //Click Mail Icon Button
        driver.findElement(By.xpath("//*[@id='headerPanel']/ul[2]/li[3]/a")).click();
    }

    @And("User fills in email data")
    public void userFillsInEmailData() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='submit'][@class='button'][@value='Send to Customer Care']"))
        );
        //Set element locate
        //Input Name
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Morgans");
        //Input Email
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("morgans123@mailsac.com");
        //Input Phone
        driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("089944445555");
        //Input Message
        driver.findElement(By.xpath("//textarea[@name='message']")).sendKeys("Good.");
    }

    @And("User clicks the send to customer care submit button")
    public void userClicksTheSendToCustomerCareSubmitButton() {
        //Click Send to Customer Care Submit Button
        driver.findElement(By.xpath("//input[@type='submit'][@class='button'][@value='Send to Customer Care']")).click();
    }

    @Then("User verifies mail icon result")
    public void userVerifiesMailIconResult() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(), 'A Customer Care Representative will be contacting you.')]"))
        );
        //Quit chrome
        driver.quit();
    }

    @And("User is not fulfilled the email data")
    public void userIsNotFulfilledTheEmailData() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='submit'][@class='button'][@value='Send to Customer Care']"))
        );
        //Set element locate
        //Input Email
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("morgans123@mailsac.com");
        //Input Phone
        driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("089944445555");
        //Input Message
        driver.findElement(By.xpath("//textarea[@name='message']")).sendKeys("Good.");
    }

    @Then("Users get the required email data error message")
    public void usersGetTheRequiredEmailDataErrorMessage() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("name.errors"))
        );
        //Quit chrome
        driver.quit();
    }

    @And("^User enters email data and (.*)$")
    public void userEntersEmailDataAndName(String name) {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='submit'][@class='button'][@value='Send to Customer Care']"))
        );
        //Set element locate
        //Input Name
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys(name);
        //Input Email
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("morgans123@mailsac.com");
        //Input Phone
        driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("089944445555");
        //Input Message
        driver.findElement(By.xpath("//textarea[@name='message']")).sendKeys("Good.");
    }

    @Then("^User gets verifies mail icon (.*)$")
    public void userGetsVerifiesMailIconResult(String result) {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        if (result == "Passed"){
            //Set case stop tunggu
            wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(), 'A Customer Care Representative will be contacting you.')]"))
            );
        } else if (result == "Failed") {
            //Set case stop tunggu
            wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.id("name.errors"))
            );
        }
        //Quit chrome
        driver.quit();
    }
}
