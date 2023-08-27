package home;

import config.env_target;
import util.FileUtil;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class FooterButton extends env_target {
    @Test
    public void home(){
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
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='footerPanel']/ul[1]/li[1]/a"))
        );
        //Set element locate
        //Click Home Button
        driver.findElement(By.xpath("//*[@id='footerPanel']/ul[1]/li[1]/a")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@class='captionone'][contains(text(), 'ATM Services')]"))
        );
        //Quit chrome
        driver.quit();
    }

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
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='footerPanel']/ul[1]/li[2]/a"))
        );
        //Set element locate
        //Click Home Button
        driver.findElement(By.xpath("//*[@id='footerPanel']/ul[1]/li[2]/a")).click();
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
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='footerPanel']/ul[1]/li[3]/a"))
        );
        //Set element locate
        //Click Services Button
        driver.findElement(By.xpath("//*[@id='footerPanel']/ul[1]/li[3]/a")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='heading'][contains(text(), 'Available Bookstore SOAP services:')]"))
        );
        //Quit chrome
        driver.quit();
    }

    @Test
    public void services_bookstore_soap_store_01(){
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
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='footerPanel']/ul[1]/li[3]/a"))
        );
        //Set element locate
        //Click Services Button
        driver.findElement(By.xpath("//*[@id='footerPanel']/ul[1]/li[3]/a")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href, 'https://parabank.parasoft.com/parabank/services/store-01?wsdl')]"))
        );
        //Set element locate
        //Click Link store-01
        driver.findElement(By.xpath("//a[contains(@href, 'https://parabank.parasoft.com/parabank/services/store-01?wsdl')]")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.urlToBe("https://parabank.parasoft.com/parabank/services/store-01?wsdl")
        );
        //Quit chrome
        driver.quit();
    }

    @Test
    public void services_bookstore_soap_store_01v2(){
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
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='footerPanel']/ul[1]/li[3]/a"))
        );
        //Set element locate
        //Click Services Button
        driver.findElement(By.xpath("//*[@id='footerPanel']/ul[1]/li[3]/a")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href, 'https://parabank.parasoft.com/parabank/services/store-01V2?wsdl')]"))
        );
        //Set element locate
        //Click Link store-01V2
        driver.findElement(By.xpath("//a[contains(@href, 'https://parabank.parasoft.com/parabank/services/store-01V2?wsdl')]")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.urlToBe("https://parabank.parasoft.com/parabank/services/store-01V2?wsdl")
        );
        //Quit chrome
        driver.quit();
    }

    @Test
    public void services_bookstore_soap_store_wss_01(){
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
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='footerPanel']/ul[1]/li[3]/a"))
        );
        //Set element locate
        //Click Services Button
        driver.findElement(By.xpath("//*[@id='footerPanel']/ul[1]/li[3]/a")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href, 'https://parabank.parasoft.com/parabank/services/store-wss-01?wsdl')]"))
        );
        //Set element locate
        //Click Link store-wss-01
        driver.findElement(By.xpath("//a[contains(@href, 'https://parabank.parasoft.com/parabank/services/store-wss-01?wsdl')]")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.urlToBe("https://parabank.parasoft.com/parabank/services/store-wss-01?wsdl")
        );
        //Quit chrome
        driver.quit();
    }

    @Test
    public void services_bookstore_soap_download_soatest_pfx() throws InterruptedException, IOException
    {
        //Set driver location path
        System.setProperty("webdriver.chrome.driver","src\\main\\resources\\drivers\\chromedriver.exe");
        //Change Download Directory
        //Setting new download directory path
        Map<String, Object> prefs = new HashMap<String, Object>();
        //Use File.separator as it will work on any OS
        prefs.put("download.default_directory", System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "drivers" + File.separator + "BrowserDownloadedFiles");
        //Adding cpabilities to ChromeOptions
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);
        // Launching browser with desired capabilities
        driver = new ChromeDriver(options);
        //Maximize driver
        driver.manage().window().maximize();
        //url loading
        driver.get(baseUrl);
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='footerPanel']/ul[1]/li[3]/a"))
        );
        //Set element locate
        //Click Services Button
        driver.findElement(By.xpath("//*[@id='footerPanel']/ul[1]/li[3]/a")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href, 'soatest.pfx')]"))
        );
        //Set element locate
        //Click download file link button
        driver.findElement(By.xpath("//a[contains(@href, 'soatest.pfx')]")).click();
        //Verify Download Method
        Assertions.assertTrue(FileUtil.isFileDownloaded("soatest", "pfx", 5000));
    }
}
