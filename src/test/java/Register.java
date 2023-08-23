import config.env_target;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Register extends env_target {
    @Test //successful register
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
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href, 'register.htm')]"))
        );
        //Set element locate
        driver.findElement(By.xpath("//a[contains(@href, 'register.htm')]")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='title'][contains(text(), 'Signing up is easy!')]"))
        );
        //Set element locate
        //Input First Name
        driver.findElement(By.id("customer.firstName")).sendKeys("Morgans");
        //Input Last Name
        driver.findElement(By.name("customer.lastName")).sendKeys("Hawks");
        //Input Address
        driver.findElement(By.id("customer.address.street")).sendKeys("Jln. Pattimura No. 56A");
        //Input City
        driver.findElement(By.name("customer.address.city")).sendKeys("Bandung");
        //Input State
        driver.findElement(By.id("customer.address.state")).sendKeys("Indonesia");
        //Input Zip Code
        driver.findElement(By.name("customer.address.zipCode")).sendKeys("56565");
        //Input Phone #
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("080800556688");
        //Input SSN
        driver.findElement(By.name("customer.ssn")).sendKeys("12321");
        //Input Username
        driver.findElement(By.id("customer.username")).sendKeys("moHawks58");
        //Input Password
        driver.findElement(By.name("customer.password")).sendKeys("12345678");
        //Input Confirm Password
        driver.findElement(By.id("repeatedPassword")).sendKeys("12345678");
        //Click Register Submit Button
        driver.findElement(By.xpath("//input[@type='submit'][@class='button'][@value='Register']")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(), 'Your account was created successfully. You are now logged in.')]"))
        );
        //Quit chrome
        driver.quit();
    }

    @Test //register failed
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
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href, 'register.htm')]"))
        );
        //Set element locate
        driver.findElement(By.xpath("//a[contains(@href, 'register.htm')]")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='title'][contains(text(), 'Signing up is easy!')]"))
        );
        //Set element locate
        //Click Register Submit Button
        driver.findElement(By.xpath("//input[@type='submit'][@class='button'][@value='Register']")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("customer.username.errors"))
        );
        //Quit chrome
        driver.quit();
    }
}
