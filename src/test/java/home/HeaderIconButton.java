package home;

import config.env_target;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HeaderIconButton extends env_target {
    @Test
    public void home_icon(){
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
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='headerPanel']/ul[2]/li[1]/a"))
        );
        //Set element locate
        //Click Home Icon Button
        driver.findElement(By.xpath("//*[@id='headerPanel']/ul[2]/li[1]/a")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@class='captionone'][contains(text(), 'ATM Services')]"))
        );
        //Quit chrome
        driver.quit();
    }

    @Test
    public void people_icon(){
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
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='headerPanel']/ul[2]/li[2]/a"))
        );
        //Set element locate
        //Click People Icon Button
        driver.findElement(By.xpath("//*[@id='headerPanel']/ul[2]/li[2]/a")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='title'][contains(text(), 'ParaSoft Demo Website')]"))
        );
        //Quit chrome
        driver.quit();
    }

    @Test //successful send to customer care
    public void mail_icon(){
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
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='headerPanel']/ul[2]/li[3]/a"))
        );
        //Set element locate
        //Click Mail Icon Button
        driver.findElement(By.xpath("//*[@id='headerPanel']/ul[2]/li[3]/a")).click();
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
        //Click Send to Customer Care Submit Button
        driver.findElement(By.xpath("//input[@type='submit'][@class='button'][@value='Send to Customer Care']")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(), 'A Customer Care Representative will be contacting you.')]"))
        );
        //Quit chrome
        driver.quit();
    }

    @Test //send to customer care failed
    public void mail_icon_failed(){
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
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='headerPanel']/ul[2]/li[3]/a"))
        );
        //Set element locate
        //Click Mail Icon Button
        driver.findElement(By.xpath("//*[@id='headerPanel']/ul[2]/li[3]/a")).click();
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
        //Click Send to Customer Care Submit Button
        driver.findElement(By.xpath("//input[@type='submit'][@class='button'][@value='Send to Customer Care']")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("name.errors"))
        );
        //Quit chrome
        driver.quit();
    }
}
