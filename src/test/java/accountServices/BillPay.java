package accountServices;

import config.env_target;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BillPay extends env_target {
    @Test //successful send payment
    public void main(){
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
        //Set element locate
        //Click Send Payment Submit Button
        driver.findElement(By.xpath("//input[@type='submit'][@class='button'][@value='Send Payment']")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='title'][contains(text(), 'Bill Payment Complete')]"))
        );
        //Quit chrome
        driver.quit();
    }

    @Test //send payment failed
    public void failed(){
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
        //Set element locate
        //Input Payee name
        driver.findElement(By.xpath("//input[@name='payee.name']")).sendKeys("Alexander Morgans");
        //Click Send Payment Submit Button
        driver.findElement(By.xpath("//input[@type='submit'][@class='button'][@value='Send Payment']")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='error'][contains(text(), 'The amount cannot be empty. ')]"))
        );
        //Quit chrome
        driver.quit();
    }
}
