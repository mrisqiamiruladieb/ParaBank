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

public class HeaderButtonBdd extends env_target {
    @Given("User is on home page")
    public void userIsOnHomePage() {
        //Set driver location path
        System.setProperty("webdriver.chrome.driver","src\\main\\resources\\drivers\\chromedriver.exe");
        //Maximize driver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //Set url
        driver.get(baseUrl);
    }

    @When("User clicks the parabank logo button")
    public void userClicksTheParabankLogoButton() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@class='logo'][@title='ParaBank']"))
        );
        //Set element locate
        //Click ParaBank Logo Button
        driver.findElement(By.xpath("//img[@class='logo'][@title='ParaBank']")).click();
    }

    @Then("User verifies parabank logo button result")
    public void userVerifiesParabankLogoButtonResult() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@class='captionone'][contains(text(), 'ATM Services')]"))
        );
        //Quit chrome
        driver.quit();
    }

    @When("User clicks the admin page logo button")
    public void userClicksTheAdminPageLogoButton() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@class='admin'][@width='56']"))
        );
        //Set element locate
        //Click Admin Page Logo Button
        driver.findElement(By.xpath("//img[@class='admin'][@width='56']")).click();
    }

    @Then("User verifies admin page logo button result")
    public void userVerifiesAdminPageLogoButtonResult() {
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
