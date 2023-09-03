package accountServices;

import config.env_target;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TransferFunds extends env_target {
    @Test
    public void main(){ //successful transfer
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
        //Set element locate
        driver.findElement(By.xpath("//input[@id='amount'][@type='text']")).sendKeys("100");
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
        //Set element locate
        //Click Transfer Submit Button
        driver.findElement(By.xpath("//input[@type='submit'][@class='button'][@value='Transfer']")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='title'][contains(text(), 'Transfer Complete!')]"))
        );
        //Quit chrome
        driver.quit();
    }
}
