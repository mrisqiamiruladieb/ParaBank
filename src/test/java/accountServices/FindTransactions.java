package accountServices;

import config.env_target;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FindTransactions extends env_target {
    @Test
    public void by_transaction_id(){
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
        String transactionID = driver.findElement(By.xpath("//*[@id='rightPanel']/table/tbody/tr[1]/td[2]")).getText();
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
        //Set element locate
        //call the stored transaction id string
        driver.findElement(By.xpath("//input[@id='criteria.transactionId']")).sendKeys(transactionID);
        //Click Find Transactions Submit Button
        driver.findElement(By.cssSelector("#rightPanel > div > div > form > div:nth-child(5) > button")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='title'][contains(text(), 'Transaction Results')]"))
        );
        //Quit chrome
        driver.quit();
    }

    @Test
    public void by_transaction_id_failed(){
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
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href, '/parabank/findtrans.htm')]"))
        );
        //Set element locate
        //Click Find Transactions Button
        driver.findElement(By.xpath("//a[contains(@href, '/parabank/findtrans.htm')]")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='title'][contains(text(), 'Find Transactions')]"))
        );
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
        //Set element locate
        driver.findElement(By.xpath("//input[@id='criteria.transactionId']")).sendKeys("wrongID123");
        //Click Find Transactions Submit Button
        driver.findElement(By.cssSelector("#rightPanel > div > div > form > div:nth-child(5) > button")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='error'][contains(text(), ' An internal error has occurred and has been logged.')]"))
        );
        //Quit chrome
        driver.quit();
    }

    @Test
    public void by_date(){
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
        String transactionDate = driver.findElement(By.xpath("//*[@id='transactionTable']/tbody/tr[1]/td[1]")).getText();
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
        //Set element locate
        //call the stored transaction date string
        driver.findElement(By.xpath("//input[@id='criteria.onDate']")).sendKeys(transactionDate);
        //Click Find Transactions Submit Button
        driver.findElement(By.cssSelector("#rightPanel > div > div > form > div:nth-child(9) > button")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='title'][contains(text(), 'Transaction Results')]"))
        );
        //Quit chrome
        driver.quit();
    }

    @Test
    public void by_date_failed(){
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
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href, '/parabank/findtrans.htm')]"))
        );
        //Set element locate
        //Click Find Transactions Button
        driver.findElement(By.xpath("//a[contains(@href, '/parabank/findtrans.htm')]")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='title'][contains(text(), 'Find Transactions')]"))
        );
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
        //Set element locate
        driver.findElement(By.xpath("//input[@id='criteria.onDate']")).sendKeys("wrongDate-123");
        //Click Find Transactions Submit Button
        driver.findElement(By.cssSelector("#rightPanel > div > div > form > div:nth-child(9) > button")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='error'][contains(text(), ' An internal error has occurred and has been logged.')]"))
        );
        //Quit chrome
        driver.quit();
    }

    @Test
    public void by_date_range(){
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
        String transactionDateLatest = driver.findElement(By.xpath("//*[@id='transactionTable']/tbody/tr[1]/td[1]")).getText();
        String transactionDateOld = driver.findElement(By.xpath("//*[@id='transactionTable']/tbody/tr[4]/td[1]")).getText();
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
        //Set element locate
        //call the stored transaction date string
        driver.findElement(By.xpath("//input[@id='criteria.fromDate']")).sendKeys(transactionDateOld);
        driver.findElement(By.xpath("//input[@id='criteria.toDate']")).sendKeys(transactionDateLatest);
        //Click Find Transactions Submit Button
        driver.findElement(By.cssSelector("#rightPanel > div > div > form > div:nth-child(13) > button")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='title'][contains(text(), 'Transaction Results')]"))
        );
        //Quit chrome
        driver.quit();
    }

    @Test
    public void by_date_range_failed(){
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
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href, '/parabank/findtrans.htm')]"))
        );
        //Set element locate
        //Click Find Transactions Button
        driver.findElement(By.xpath("//a[contains(@href, '/parabank/findtrans.htm')]")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='title'][contains(text(), 'Find Transactions')]"))
        );
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
        //Set element locate
        //call the stored transaction date string
        driver.findElement(By.xpath("//input[@id='criteria.fromDate']")).sendKeys("wrongDate-123Old");
        driver.findElement(By.xpath("//input[@id='criteria.toDate']")).sendKeys("wrongDate-123Latest");
        //Click Find Transactions Submit Button
        driver.findElement(By.cssSelector("#rightPanel > div > div > form > div:nth-child(13) > button")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='error'][contains(text(), ' An internal error has occurred and has been logged.')]"))
        );
        //Quit chrome
        driver.quit();
    }

    @Test
    public void by_amount(){
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
        String amount = driver.findElement(By.xpath("//*[@id='rightPanel']/table/tbody/tr[5]/td[2]")).getText();
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
        //Set element locate
        //call the stored amount $ string without $ element
        driver.findElement(By.xpath("//input[@id='criteria.amount']")).sendKeys(amount.substring(1));
        //Click Find Transactions Submit Button
        driver.findElement(By.cssSelector("#rightPanel > div > div > form > div:nth-child(17) > button")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='title'][contains(text(), 'Transaction Results')]"))
        );
        //Quit chrome
        driver.quit();
    }

    @Test
    public void by_amount_failed(){
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
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href, '/parabank/findtrans.htm')]"))
        );
        //Set element locate
        //Click Find Transactions Button
        driver.findElement(By.xpath("//a[contains(@href, '/parabank/findtrans.htm')]")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='title'][contains(text(), 'Find Transactions')]"))
        );
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
        //Set element locate
        driver.findElement(By.xpath("//input[@id='criteria.amount']")).sendKeys("wrongAmount123");
        //Click Find Transactions Submit Button
        driver.findElement(By.cssSelector("#rightPanel > div > div > form > div:nth-child(17) > button")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='error'][contains(text(), ' An internal error has occurred and has been logged.')]"))
        );
        //Quit chrome
        driver.quit();
    }
}
