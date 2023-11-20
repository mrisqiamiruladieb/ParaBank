package accountServices;

import config.env_target;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OpenNewAccount extends env_target {
    @Test
    public void main(){ //successful open new account
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
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href, '/parabank/openaccount.htm')]"))
        );
        //Set element locate
        //Click Open New Account Button
        driver.findElement(By.xpath("//a[contains(@href, '/parabank/openaccount.htm')]")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='title'][contains(text(), 'Open New Account')]"))
        );
        //Set element locate
        driver.findElement(By.xpath("//select[@id='type']")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[@value='0'][contains(text(), 'CHECKING')]"))
        );
        //Set element locate
        driver.findElement(By.xpath("//option[@value='0'][contains(text(), 'CHECKING')]")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.elementSelectionStateToBe(By.xpath("//option[@value='0'][contains(text(), 'CHECKING')]"), true)
        );
        //Set element locate
        driver.findElement(By.xpath("//select[@id='fromAccountId']")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='fromAccountId']/option[3]"))
        );
        //Set element locate
        driver.findElement(By.xpath("//*[@id='fromAccountId']/option[3]")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.elementSelectionStateToBe(By.xpath("//*[@id='fromAccountId']/option[3]"), true)
        );
        //Set element locate
        //Click Open New Account Submit Button
        driver.findElement(By.xpath("//input[@type='submit'][@class='button'][@value='Open New Account']")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(), 'Congratulations, your account is now open.')]"))
        );
        //Quit chrome
        driver.quit();
    }
}
