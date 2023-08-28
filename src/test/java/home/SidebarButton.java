package home;

import config.env_target;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SidebarButton extends env_target {
    @Test
    public void about_us(){
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
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='headerPanel']/ul[1]/li[2]/a"))
        );
        //Set element locate
        //Click About Us Button
        driver.findElement(By.xpath("//*[@id='headerPanel']/ul[1]/li[2]/a")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='title'][contains(text(), 'ParaSoft Demo Website')]"))
        );
        //Quit chrome
        driver.quit();
    }

    @Test
    public void services(){
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
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='headerPanel']/ul[1]/li[3]/a"))
        );
        //Set element locate
        //Click Services Button
        driver.findElement(By.xpath("//*[@id='headerPanel']/ul[1]/li[3]/a")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='heading'][contains(text(), 'Available Bookstore SOAP services:')]"))
        );
        //Quit chrome
        driver.quit();
    }

    @Test
    public void products(){
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
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='headerPanel']/ul[1]/li[4]/a"))
        );
        //Set element locate
        //Click Products Button
        driver.findElement(By.xpath("//*[@id='headerPanel']/ul[1]/li[4]/a")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.urlToBe("https://www.parasoft.com/products/")
        );
        //Quit chrome
        driver.quit();
    }

    @Test
    public void locations(){
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
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='headerPanel']/ul[1]/li[5]/a"))
        );
        //Set element locate
        //Click Locations Button
        driver.findElement(By.xpath("//*[@id='headerPanel']/ul[1]/li[5]/a")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.urlToBe("https://www.parasoft.com/solutions/")
        );
        //Quit chrome
        driver.quit();
    }

    @Test
    public void admin_page(){
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
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='headerPanel']/ul[1]/li[6]/a"))
        );
        //Set element locate
        //Click Admin Page Button
        driver.findElement(By.xpath("//*[@id='headerPanel']/ul[1]/li[6]/a")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='title'][contains(text(), 'Administration')]"))
        );
        //Quit chrome
        driver.quit();
    }
}
