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

public class FindTransactionsBdd extends env_target {

    //variabel global
    private String transactionID;
    private String transactionDate;
    private String transactionDateLatest;
    private String transactionDateOld;
    private String amount;

    @Given("User has transaction id")
    public void userHasTransactionId() {
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
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='accountTable']/tbody/tr[1]/td[1]/a"))
        );
        //Set element locate
        driver.findElement(By.xpath("//*[@id='accountTable']/tbody/tr[1]/td[1]/a")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='transactionTable']/tbody/tr[1]/td[2]/a"))
        );
        //Set element locate
        driver.findElement(By.xpath("//*[@id='transactionTable']/tbody/tr[1]/td[2]/a")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='title'][contains(text(), 'Transaction Details')]"))
        );
        //Storing the text of the transaction id in a string
        transactionID = driver.findElement(By.xpath("//*[@id='rightPanel']/table/tbody/tr[1]/td[2]")).getText();
    }

    @When("User is on find transactions page")
    public void userIsOnFindTransactionsPage() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href, '/parabank/findtrans.htm')]"))
        );
        //Set element locate
        //Click Find Transactions Button
        driver.findElement(By.xpath("//a[contains(@href, '/parabank/findtrans.htm')]")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='title'][contains(text(), 'Find Transactions')]"))
        );
    }

    @And("User selects an account")
    public void userSelectsAnAccount() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set element locate
        driver.findElement(By.xpath("//select[@id='accountId']")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='accountId']/option[1]"))
        );
        //Set element locate
        driver.findElement(By.xpath("//*[@id='accountId']/option[1]")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.elementSelectionStateToBe(By.xpath("//*[@id='accountId']/option[1]"), true)
        );
    }

    @And("User fills in the transaction id")
    public void userFillsInTheTransactionId() {
        //Set element locate
        //call the stored transaction id string
        driver.findElement(By.xpath("//input[@id='criteria.transactionId']")).sendKeys(transactionID);
    }

    @And("User clicks the find by transaction id submit button")
    public void userClicksTheFindByTransactionIdSubmitButton() {
        //Set element locate
        //Click Find Transactions Submit Button
        driver.findElement(By.cssSelector("#rightPanel > div > div > form > div:nth-child(5) > button")).click();
    }

    @Then("Users verify finding transaction results")
    public void usersVerifyFindingTransactionResults() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='title'][contains(text(), 'Transaction Results')]"))
        );
        //Quit chrome
        driver.quit();
    }

    @And("User entered an invalid transaction id")
    public void userEnteredAnInvalidTransactionId() {
        //Set element locate
        driver.findElement(By.xpath("//input[@id='criteria.transactionId']")).sendKeys("wrongID123");
    }

    @Then("Users gets find transactions error message")
    public void usersGetsFindTransactionsErrorMessage() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='error'][contains(text(), ' An internal error has occurred and has been logged.')]"))
        );
        //Quit chrome
        driver.quit();
    }

    @Given("User has transaction date")
    public void userHasTransactionDate() {
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
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='accountTable']/tbody/tr[1]/td[1]/a"))
        );
        //Set element locate
        driver.findElement(By.xpath("//*[@id='accountTable']/tbody/tr[1]/td[1]/a")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='transactionTable']/tbody/tr[1]/td[1]"))
        );
        //Storing the text of the transaction date in a string
        transactionDate = driver.findElement(By.xpath("//*[@id='transactionTable']/tbody/tr[1]/td[1]")).getText();
    }

    @And("User fills in the transaction date")
    public void userFillsInTheTransactionDate() {
        //Set element locate
        //call the stored transaction date string
        driver.findElement(By.xpath("//input[@id='criteria.onDate']")).sendKeys(transactionDate);
    }

    @And("User clicks the find by transaction date submit button")
    public void userClicksTheFindByTransactionDateSubmitButton() {
        //Set element locate
        //Click Find Transactions Submit Button
        driver.findElement(By.cssSelector("#rightPanel > div > div > form > div:nth-child(9) > button")).click();

    }

    @And("User entered an invalid transaction date")
    public void userEnteredAnInvalidTransactionDate() {
        //Set element locate
        driver.findElement(By.xpath("//input[@id='criteria.onDate']")).sendKeys("wrongDate-123");
    }

    @Given("User has transaction date range")
    public void userHasTransactionDateRange() {
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
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='accountTable']/tbody/tr[1]/td[1]/a"))
        );
        //Set element locate
        driver.findElement(By.xpath("//*[@id='accountTable']/tbody/tr[1]/td[1]/a")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='transactionTable']/tbody/tr[1]/td[1]"))
        );
        //Storing the text of the transaction date in a string
        transactionDateLatest = driver.findElement(By.xpath("//*[@id='transactionTable']/tbody/tr[1]/td[1]")).getText();
        transactionDateOld = driver.findElement(By.xpath("//*[@id='transactionTable']/tbody/tr[4]/td[1]")).getText();
    }

    @And("User fills in the transaction date range")
    public void userFillsInTheTransactionDateRange() {
        //Set element locate
        //call the stored transaction date string
        driver.findElement(By.xpath("//input[@id='criteria.fromDate']")).sendKeys(transactionDateOld);
        driver.findElement(By.xpath("//input[@id='criteria.toDate']")).sendKeys(transactionDateLatest);
    }

    @And("User clicks the find by transaction date range submit button")
    public void userClicksTheFindByTransactionDateRangeSubmitButton() {
        //Set element locate
        //Click Find Transactions Submit Button
        driver.findElement(By.cssSelector("#rightPanel > div > div > form > div:nth-child(13) > button")).click();
    }

    @And("User entered an invalid transaction date range")
    public void userEnteredAnInvalidTransactionDateRange() {
        //Set element locate
        //call the stored transaction date string
        driver.findElement(By.xpath("//input[@id='criteria.fromDate']")).sendKeys("wrongDate-123Old");
        driver.findElement(By.xpath("//input[@id='criteria.toDate']")).sendKeys("wrongDate-123Latest");
    }

    @Given("Users have transaction amount data")
    public void usersHaveTransactionAmountData() {
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
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='accountTable']/tbody/tr[1]/td[1]/a"))
        );
        //Set element locate
        driver.findElement(By.xpath("//*[@id='accountTable']/tbody/tr[1]/td[1]/a")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='transactionTable']/tbody/tr[1]/td[2]/a"))
        );
        //Set element locate
        driver.findElement(By.xpath("//*[@id='transactionTable']/tbody/tr[1]/td[2]/a")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rightPanel']/table/tbody/tr[5]/td[2]"))
        );
        //Storing the text of the amount $ in a string
        amount = driver.findElement(By.xpath("//*[@id='rightPanel']/table/tbody/tr[5]/td[2]")).getText();
    }

    @And("User fills in the transaction amount data")
    public void userFillsInTheTransactionAmountData() {
        //Set element locate
        //call the stored amount $ string without $ element
        driver.findElement(By.xpath("//input[@id='criteria.amount']")).sendKeys(amount.substring(1));
    }

    @And("User clicks the find by transaction amount data submit button")
    public void userClicksTheFindByTransactionAmountDataSubmitButton() {
        //Set element locate
        //Click Find Transactions Submit Button
        driver.findElement(By.cssSelector("#rightPanel > div > div > form > div:nth-child(17) > button")).click();
    }

    @And("User entered an invalid transaction amount data")
    public void userEnteredAnInvalidTransactionAmountData() {
        //Set element locate
        driver.findElement(By.xpath("//input[@id='criteria.amount']")).sendKeys("wrongAmount123");
    }
}
