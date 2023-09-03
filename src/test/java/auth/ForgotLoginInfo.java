package auth;

import config.env_target;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ForgotLoginInfo extends env_target {
    @Test //successful find login info
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
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href, 'lookup.htm')]"))
        );
        //Set element locate
        //Click Forgot Login Info Button
        driver.findElement(By.xpath("//a[contains(@href, 'lookup.htm')]")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='submit'][@class='button'][@value='Find My Login Info']"))
        );
        //Set element locate
        //Input First Name
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Morgans");
        //Input Last Name
        driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Hawks");
        //Input Address
        driver.findElement(By.xpath("//input[@id='address.street']")).sendKeys("Jln. Pattimura No. 56A");
        //Input City
        driver.findElement(By.xpath("//input[@name='address.city']")).sendKeys("Bandung");
        //Input State
        driver.findElement(By.xpath("//input[@id='address.state']")).sendKeys("Indonesia");
        //Input Zip Code
        driver.findElement(By.xpath("//input[@name='address.zipCode']")).sendKeys("56565");
        //Input SSN
        driver.findElement(By.xpath("//input[@id='ssn']")).sendKeys("12321");
        //Click Find My Login Info Submit Button
        driver.findElement(By.xpath("//input[@type='submit'][@class='button'][@value='Find My Login Info']")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(), 'Your login information was located successfully. You are now logged in. ')]"))
        );
        //Quit chrome
        driver.quit();
    }

    @Test //find login info failed
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
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href, 'lookup.htm')]"))
        );
        //Set element locate
        //Click Forgot Login Info Button
        driver.findElement(By.xpath("//a[contains(@href, 'lookup.htm')]")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='submit'][@class='button'][@value='Find My Login Info']"))
        );
        //Set element locate
        //Input Last Name
        driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Hawks");
        //Input Address
        driver.findElement(By.xpath("//input[@id='address.street']")).sendKeys("Jln. Pattimura No. 56A");
        //Input City
        driver.findElement(By.xpath("//input[@name='address.city']")).sendKeys("Bandung");
        //Input State
        driver.findElement(By.xpath("//input[@id='address.state']")).sendKeys("Indonesia");
        //Input Zip Code
        driver.findElement(By.xpath("//input[@name='address.zipCode']")).sendKeys("56565");
        //Input SSN
        driver.findElement(By.xpath("//input[@id='ssn']")).sendKeys("12321");
        //Click Find My Login Info Submit Button
        driver.findElement(By.xpath("//input[@type='submit'][@class='button'][@value='Find My Login Info']")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("firstName.errors"))
        );
        //Quit chrome
        driver.quit();
    }
}
