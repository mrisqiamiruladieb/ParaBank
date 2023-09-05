package stepDef;

import config.env_target;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SidebarButtonBdd extends env_target {
    @Given("User is on the homepage")
    public void userIsOnTheHomepage() {
        //Set driver location path
        System.setProperty("webdriver.chrome.driver","src\\main\\resources\\drivers\\chromedriver.exe");
        //Maximize driver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //Set url
        driver.get(baseUrl);
    }

    @When("User clicks the about us sidebar button")
    public void userClicksTheAboutUsSidebarButton() {
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
    }

    @Then("User verifies about us sidebar button result")
    public void userVerifiesAboutUsSidebarButtonResult() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='title'][contains(text(), 'ParaSoft Demo Website')]"))
        );
        //Quit chrome
        driver.quit();
    }

    @When("User clicks the services sidebar button")
    public void userClicksTheServicesSidebarButton() {
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
    }

    @Then("User verifies services sidebar button result")
    public void userVerifiesServicesSidebarButtonResult() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='heading'][contains(text(), 'Available Bookstore SOAP services:')]"))
        );
        //Quit chrome
        driver.quit();
    }

    @When("User clicks the products sidebar button")
    public void userClicksTheProductsSidebarButton() {
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
    }

    @Then("User verifies products sidebar button result")
    public void userVerifiesProductsSidebarButtonResult() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.urlToBe("https://www.parasoft.com/products/")
        );
        //Quit chrome
        driver.quit();
    }

    @When("User clicks the locations sidebar button")
    public void userClicksTheLocationsSidebarButton() {
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
    }

    @Then("User verifies locations sidebar button result")
    public void userVerifiesLocationsSidebarButtonResult() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.urlToBe("https://www.parasoft.com/solutions/")
        );
        //Quit chrome
        driver.quit();
    }

    @When("User clicks the admin page sidebar button")
    public void userClicksTheAdminPageSidebarButton() {
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
    }

    @Then("User verifies admin page sidebar button result")
    public void userVerifiesAdminPageSidebarButtonResult() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='title'][contains(text(), 'Administration')]"))
        );
        //Quit chrome
        driver.quit();
    }
}
