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
import java.util.Set;
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
        //Quit chrome
        driver.quit();
    }

    @Test
    public void services_bookstore_soap_store_wss_02(){
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
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href, 'https://parabank.parasoft.com/parabank/services/store-wss-02?wsdl')]"))
        );
        //Set element locate
        //Click Link store-wss-02
        driver.findElement(By.xpath("//a[contains(@href, 'https://parabank.parasoft.com/parabank/services/store-wss-02?wsdl')]")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.urlToBe("https://parabank.parasoft.com/parabank/services/store-wss-02?wsdl")
        );
        //Quit chrome
        driver.quit();
    }

    @Test
    public void services_bookstore_soap_store_wss_03(){
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
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href, 'https://parabank.parasoft.com/parabank/services/store-wss-03?wsdl')]"))
        );
        //Set element locate
        //Click Link store-wss-03
        driver.findElement(By.xpath("//a[contains(@href, 'https://parabank.parasoft.com/parabank/services/store-wss-03?wsdl')]")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.urlToBe("https://parabank.parasoft.com/parabank/services/store-wss-03?wsdl")
        );
        //Quit chrome
        driver.quit();
    }

    @Test
    public void services_bookstore_soap_store_wss_04(){
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
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href, 'https://parabank.parasoft.com/parabank/services/store-wss-04?wsdl')]"))
        );
        //Set element locate
        //Click Link store-wss-04
        driver.findElement(By.xpath("//a[contains(@href, 'https://parabank.parasoft.com/parabank/services/store-wss-04?wsdl')]")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.urlToBe("https://parabank.parasoft.com/parabank/services/store-wss-04?wsdl")
        );
        //Quit chrome
        driver.quit();
    }

    @Test
    public void services_parabank_soap_loan_processor(){
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
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href, 'https://parabank.parasoft.com/parabank/services/LoanProcessor?wsdl')]"))
        );
        //Set element locate
        //Click Link LoanProcessor
        driver.findElement(By.xpath("//a[contains(@href, 'https://parabank.parasoft.com/parabank/services/LoanProcessor?wsdl')]")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.urlToBe("https://parabank.parasoft.com/parabank/services/LoanProcessor?wsdl")
        );
        //Quit chrome
        driver.quit();
    }

    @Test
    public void services_parabank_soap_parabank(){
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
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rightPanel']/table[3]/tbody/tr[2]/td[2]/a"))
        );
        //Set element locate
        //Click Link ParaBank
        driver.findElement(By.xpath("//*[@id='rightPanel']/table[3]/tbody/tr[2]/td[2]/a")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.urlToBe("https://parabank.parasoft.com/parabank/services/ParaBank?wsdl")
        );
        //Quit chrome
        driver.quit();
    }

    @Test
    public void services_restful_wadl(){
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
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rightPanel']/table[5]/tbody/tr/td/a[1]"))
        );
        //Set element locate
        //Click Link wadl
        driver.findElement(By.xpath("//*[@id='rightPanel']/table[5]/tbody/tr/td/a[1]")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.urlToBe("https://parabank.parasoft.com/parabank/services/bank?_wadl&_type=xml")
        );
        //Quit chrome
        driver.quit();
    }

    @Test
    public void services_restful_swagger(){
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
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rightPanel']/table[5]/tbody/tr/td/a[1]"))
        );
        //Set element locate
        //Click Link swagger
        driver.findElement(By.xpath("//*[@id='rightPanel']/table[5]/tbody/tr/td/a[2]")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.urlToBe("https://parabank.parasoft.com/parabank/api-docs/index.html")
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
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='footerPanel']/ul[1]/li[4]/a"))
        );
        //Set element locate
        //Click Products Button
        driver.findElement(By.xpath("//*[@id='footerPanel']/ul[1]/li[4]/a")).click();
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
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='footerPanel']/ul[1]/li[5]/a"))
        );
        //Set element locate
        //Click Locations Button
        driver.findElement(By.xpath("//*[@id='footerPanel']/ul[1]/li[5]/a")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.urlToBe("https://www.parasoft.com/solutions/")
        );
        //Quit chrome
        driver.quit();
    }

    @Test
    public void forum(){
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
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='footerPanel']/ul[1]/li[6]/a"))
        );
        //Set element locate
        //Click Forum Button
        driver.findElement(By.xpath("//*[@id='footerPanel']/ul[1]/li[6]/a")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.urlToBe("https://forums.parasoft.com/")
        );
        //Quit chrome
        driver.quit();
    }

    @Test
    public void site_map_about_us(){
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
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='footerPanel']/ul[1]/li[7]/a"))
        );
        //Set element locate
        //Click Site Map Button
        driver.findElement(By.xpath("//*[@id='footerPanel']/ul[1]/li[7]/a")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rightPanel']/ul[1]/li[2]/a"))
        );
        //Set element locate
        //Click About Us Button
        driver.findElement(By.xpath("//*[@id='rightPanel']/ul[1]/li[2]/a")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='title'][contains(text(), 'ParaSoft Demo Website')]"))
        );
        //Quit chrome
        driver.quit();
    }

    @Test
    public void site_map_services(){
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
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='footerPanel']/ul[1]/li[7]/a"))
        );
        //Set element locate
        //Click Site Map Button
        driver.findElement(By.xpath("//*[@id='footerPanel']/ul[1]/li[7]/a")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rightPanel']/ul[1]/li[3]/a"))
        );
        //Set element locate
        //Click Services Button
        driver.findElement(By.xpath("//*[@id='rightPanel']/ul[1]/li[3]/a")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='heading'][contains(text(), 'Available Bookstore SOAP services:')]"))
        );
        //Quit chrome
        driver.quit();
    }

    @Test
    public void site_map_products(){
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
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='footerPanel']/ul[1]/li[7]/a"))
        );
        //Set element locate
        //Click Site Map Button
        driver.findElement(By.xpath("//*[@id='footerPanel']/ul[1]/li[7]/a")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rightPanel']/ul[1]/li[4]/a"))
        );
        //Set element locate
        //Click Products Button
        driver.findElement(By.xpath("//*[@id='rightPanel']/ul[1]/li[4]/a")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.urlToBe("https://www.parasoft.com/products/")
        );
        //Quit chrome
        driver.quit();
    }

    @Test
    public void site_map_locations(){
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
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='footerPanel']/ul[1]/li[7]/a"))
        );
        //Set element locate
        //Click Site Map Button
        driver.findElement(By.xpath("//*[@id='footerPanel']/ul[1]/li[7]/a")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rightPanel']/ul[1]/li[5]/a"))
        );
        //Set element locate
        //Click Locations Button
        driver.findElement(By.xpath("//*[@id='rightPanel']/ul[1]/li[5]/a")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.urlToBe("https://www.parasoft.com/solutions/")
        );
        //Quit chrome
        driver.quit();
    }

    @Test
    public void site_map_admin_page(){
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
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='footerPanel']/ul[1]/li[7]/a"))
        );
        //Set element locate
        //Click Site Map Button
        driver.findElement(By.xpath("//*[@id='footerPanel']/ul[1]/li[7]/a")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rightPanel']/ul[1]/li[6]/a"))
        );
        //Set element locate
        //Click Admin Page Button
        driver.findElement(By.xpath("//*[@id='rightPanel']/ul[1]/li[6]/a")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.elementSelectionStateToBe(By.id("accessMode3"), true)
        );
        //Set element locate
        //Clear & Input Initial Balance $
        driver.findElement(By.id("initialBalance")).clear();
        driver.findElement(By.id("initialBalance")).sendKeys("50000");
        //Clear & Input Minimum Balance $
        driver.findElement(By.name("minimumBalance")).clear();
        driver.findElement(By.name("minimumBalance")).sendKeys("5000");
        //Select Loan Provider
        driver.findElement(By.id("loanProvider")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='loanProvider']/option[2]"))
        );
        //Click Web Service Option
        driver.findElement(By.xpath("//*[@id='loanProvider']/option[2]")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.elementSelectionStateToBe(By.xpath("//*[@id='loanProvider']/option[2]"), true)
        );
        //Select Loan Processor
        driver.findElement(By.xpath("//*[@id='loanProcessor']")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='loanProcessor']/option[1]"))
        );
        //Click Available Funds Option
        driver.findElement(By.xpath("//*[@id='loanProcessor']/option[1]")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.elementSelectionStateToBe(By.xpath("//*[@id='loanProcessor']/option[1]"), true)
        );
        //Clear & Input Threshold
        driver.findElement(By.id("loanProcessorThreshold")).clear();
        driver.findElement(By.id("loanProcessorThreshold")).sendKeys("9");
        //Click Submit Button
        driver.findElement(By.xpath("//input[@type='submit'][@class='button'][@value='Submit']")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//b[contains(text(), 'Settings saved successfully.')]"))
        );
        //Quit chrome
        driver.quit();
    }

    @Test
    public void site_map_open_new_account(){
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
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='footerPanel']/ul[1]/li[7]/a"))
        );
        //Set element locate
        //Click Site Map Button
        driver.findElement(By.xpath("//*[@id='footerPanel']/ul[1]/li[7]/a")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rightPanel']/ul[2]/li[1]/a"))
        );
        //Set element locate
        //Click Open New Account Button
        driver.findElement(By.xpath("//*[@id='rightPanel']/ul[2]/li[1]/a")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.urlToBe("https://parabank.parasoft.com/parabank/openaccount.htm")
        );
        //Quit chrome
        driver.quit();
    }

    @Test
    public void site_map_accounts_overview(){
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
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='footerPanel']/ul[1]/li[7]/a"))
        );
        //Set element locate
        //Click Site Map Button
        driver.findElement(By.xpath("//*[@id='footerPanel']/ul[1]/li[7]/a")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rightPanel']/ul[2]/li[2]/a"))
        );
        //Set element locate
        //Click Accounts Overview Button
        driver.findElement(By.xpath("//*[@id='rightPanel']/ul[2]/li[2]/a")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.urlToBe("https://parabank.parasoft.com/parabank/overview.htm")
        );
        //Quit chrome
        driver.quit();
    }

    @Test
    public void site_map_transfer_funds(){
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
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='footerPanel']/ul[1]/li[7]/a"))
        );
        //Set element locate
        //Click Site Map Button
        driver.findElement(By.xpath("//*[@id='footerPanel']/ul[1]/li[7]/a")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rightPanel']/ul[2]/li[3]/a"))
        );
        //Set element locate
        //Click Transfer Funds Button
        driver.findElement(By.xpath("//*[@id='rightPanel']/ul[2]/li[3]/a")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.urlToBe("https://parabank.parasoft.com/parabank/transfer.htm")
        );
        //Quit chrome
        driver.quit();
    }

    @Test
    public void site_map_bill_pay(){
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
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='footerPanel']/ul[1]/li[7]/a"))
        );
        //Set element locate
        //Click Site Map Button
        driver.findElement(By.xpath("//*[@id='footerPanel']/ul[1]/li[7]/a")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rightPanel']/ul[2]/li[4]/a"))
        );
        //Set element locate
        //Click Bill Pay Button
        driver.findElement(By.xpath("//*[@id='rightPanel']/ul[2]/li[4]/a")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.urlToBe("https://parabank.parasoft.com/parabank/billpay.htm")
        );
        //Quit chrome
        driver.quit();
    }

    @Test
    public void site_map_find_transactions(){
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
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='footerPanel']/ul[1]/li[7]/a"))
        );
        //Set element locate
        //Click Site Map Button
        driver.findElement(By.xpath("//*[@id='footerPanel']/ul[1]/li[7]/a")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rightPanel']/ul[2]/li[5]/a"))
        );
        //Set element locate
        //Click Find Transactions Button
        driver.findElement(By.xpath("//*[@id='rightPanel']/ul[2]/li[5]/a")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.urlToBe("https://parabank.parasoft.com/parabank/findtrans.htm")
        );
        //Quit chrome
        driver.quit();
    }

    @Test
    public void site_map_update_contact_info(){
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
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='footerPanel']/ul[1]/li[7]/a"))
        );
        //Set element locate
        //Click Site Map Button
        driver.findElement(By.xpath("//*[@id='footerPanel']/ul[1]/li[7]/a")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rightPanel']/ul[2]/li[6]/a"))
        );
        //Set element locate
        //Click Update Contact Info Button
        driver.findElement(By.xpath("//*[@id='rightPanel']/ul[2]/li[6]/a")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.urlToBe("https://parabank.parasoft.com/parabank/updateprofile.htm")
        );
        //Quit chrome
        driver.quit();
    }

    @Test
    public void site_map_request_loan(){
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
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='footerPanel']/ul[1]/li[7]/a"))
        );
        //Set element locate
        //Click Site Map Button
        driver.findElement(By.xpath("//*[@id='footerPanel']/ul[1]/li[7]/a")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rightPanel']/ul[2]/li[7]/a"))
        );
        //Set element locate
        //Click Request Loan Button
        driver.findElement(By.xpath("//*[@id='rightPanel']/ul[2]/li[7]/a")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.urlToBe("https://parabank.parasoft.com/parabank/requestloan.htm")
        );
        //Quit chrome
        driver.quit();
    }

    @Test
    public void site_map_logout(){
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
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='footerPanel']/ul[1]/li[7]/a"))
        );
        //Set element locate
        //Click Site Map Button
        driver.findElement(By.xpath("//*[@id='footerPanel']/ul[1]/li[7]/a")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rightPanel']/ul[2]/li[8]/a"))
        );
        //Set element locate
        //Click Logout Button
        driver.findElement(By.xpath("//*[@id='rightPanel']/ul[2]/li[8]/a")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.urlToBe("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC")
        );
        //Quit chrome
        driver.quit();
    }

    @Test
    public void contact_us(){
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
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='footerPanel']/ul[1]/li[8]/a"))
        );
        //Set element locate
        //Click Contact Us Button
        driver.findElement(By.xpath("//*[@id='footerPanel']/ul[1]/li[8]/a")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='title'][contains(text(), 'Customer Care')]"))
        );
        //Quit chrome
        driver.quit();
    }

    @Test
    public void visit_us_at(){
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
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='footerPanel']/ul[1]/li[8]/a"))
        );
        //Set element locate
        //Click Visit Us At Button
        driver.findElement(By.xpath("//a[contains(@href, 'http://www.parasoft.com/')][@target='_blank']")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.numberOfWindowsToBe(2)
        );
        //Get main window handle
        String mainWindow = driver.getWindowHandle();
        //Get all window handles
        Set<String> allWindow = driver.getWindowHandles();
        //Switch window
        for (String handle : allWindow){
            if (!handle.equals(mainWindow)){
                driver.switchTo().window(handle);
            }
        }
        //Store window title
        String title = driver.getTitle();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.titleIs(title)
        );
        //Quit chrome
        driver.quit();
    }
}
