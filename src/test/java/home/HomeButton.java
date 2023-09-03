package home;

import config.env_target;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomeButton extends env_target {
    @Test
    public void atm_services_withdraw_funds(){
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
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rightPanel']/ul[1]/li[2]/a"))
        );
        //Set element locate
        //Click Withdraw Funds Button
        driver.findElement(By.xpath("//*[@id='rightPanel']/ul[1]/li[2]/a")).click();
        //Store new_url
        String new_url = driver.getCurrentUrl();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.urlToBe(new_url)
        );
        //Quit chrome
        driver.quit();
    }

    @Test
    public void atm_services_transfer_funds(){
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
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rightPanel']/ul[1]/li[3]/a"))
        );
        //Set element locate
        //Click Transfer Funds Button
        driver.findElement(By.xpath("//*[@id='rightPanel']/ul[1]/li[3]/a")).click();
        //Store new_title
        String new_title = driver.getTitle();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.titleIs(new_title)
        );
        //Quit chrome
        driver.quit();
    }

    @Test
    public void atm_services_check_balances(){
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
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rightPanel']/ul[1]/li[4]/a"))
        );
        //Set element locate
        //Click Check Balances Button
        driver.findElement(By.xpath("//*[@id='rightPanel']/ul[1]/li[4]/a")).click();
        //Store new_url
        String new_url = driver.getCurrentUrl();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.urlToBe(new_url)
        );
        //Quit chrome
        driver.quit();
    }

    @Test
    public void atm_services_make_deposits(){
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
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rightPanel']/ul[1]/li[5]/a"))
        );
        //Set element locate
        //Click Make Deposits Button
        driver.findElement(By.xpath("//*[@id='rightPanel']/ul[1]/li[5]/a")).click();
        //Store new_title
        String new_title = driver.getTitle();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.titleIs(new_title)
        );
        //Quit chrome
        driver.quit();
    }

    @Test
    public void online_services_bill_pay(){
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
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rightPanel']/ul[2]/li[2]/a"))
        );
        //Set element locate
        //Click Bill Pay Button
        driver.findElement(By.xpath("//*[@id='rightPanel']/ul[2]/li[2]/a")).click();
        //Store new_url
        String new_url = driver.getCurrentUrl();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.urlToBe(new_url)
        );
        //Quit chrome
        driver.quit();
    }

    @Test
    public void online_services_account_history(){
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
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rightPanel']/ul[2]/li[3]/a"))
        );
        //Set element locate
        //Click Account History Button
        driver.findElement(By.xpath("//*[@id='rightPanel']/ul[2]/li[3]/a")).click();
        //Store new_url
        String new_url = driver.getCurrentUrl();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.urlToBe(new_url)
        );
        //Quit chrome
        driver.quit();
    }

    @Test
    public void online_services_transfer_funds(){
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
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rightPanel']/ul[2]/li[4]/a"))
        );
        //Set element locate
        //Click Transfer Funds Button
        driver.findElement(By.xpath("//*[@id='rightPanel']/ul[2]/li[4]/a")).click();
        //Store new_url
        String new_url = driver.getCurrentUrl();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.urlToBe(new_url)
        );
        //Quit chrome
        driver.quit();
    }

    @Test
    public void read_more_1(){
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
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rightPanel']/p[1]/a"))
        );
        //Set element locate
        //Click Read More 1 Button
        driver.findElement(By.xpath("//*[@id='rightPanel']/p[1]/a")).click();
        //Store new_title
        String new_title = driver.getTitle();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.titleIs(new_title)
        );
        //Quit chrome
        driver.quit();
    }

    @Test
    public void latest_news_1(){
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
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rightPanel']/ul[3]/li[2]/a"))
        );
        //Set element locate
        //Click Latest News 1 Button
        driver.findElement(By.xpath("//*[@id='rightPanel']/ul[3]/li[2]/a")).click();
        //Store new_title
        String new_title = driver.getTitle();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.titleIs(new_title)
        );
        //Quit chrome
        driver.quit();
    }

    @Test
    public void latest_news_2(){
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
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rightPanel']/ul[3]/li[3]/a"))
        );
        //Set element locate
        //Click Latest News 2 Button
        driver.findElement(By.xpath("//*[@id='rightPanel']/ul[3]/li[3]/a")).click();
        //Store new_title
        String new_title = driver.getTitle();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.titleIs(new_title)
        );
        //Quit chrome
        driver.quit();
    }

    @Test
    public void latest_news_3(){
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
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rightPanel']/ul[3]/li[4]/a"))
        );
        //Set element locate
        //Click Latest News 3 Button
        driver.findElement(By.xpath("//*[@id='rightPanel']/ul[3]/li[4]/a")).click();
        //Store new_title
        String new_title = driver.getTitle();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.titleIs(new_title)
        );
        //Quit chrome
        driver.quit();
    }

    @Test
    public void read_more_2(){
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
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rightPanel']/p[2]/a"))
        );
        //Set element locate
        //Click Read More 2 Button
        driver.findElement(By.xpath("//*[@id='rightPanel']/p[2]/a")).click();
        //Store new_title
        String new_title = driver.getTitle();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.titleIs(new_title)
        );
        //Quit chrome
        driver.quit();
    }
}
