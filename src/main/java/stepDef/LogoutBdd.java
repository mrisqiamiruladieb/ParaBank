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

public class LogoutBdd extends env_target {
    @Given("User has logged in")
    public void userHasLoggedIn() {
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
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href, '/parabank/logout.htm')]"))
        );
    }

    @When("User clicks the logout button")
    public void userClicksTheLogoutButton() {
        //Set element locate
        //Click Logout button
        driver.findElement(By.xpath("//a[contains(@href, '/parabank/logout.htm')]")).click();
    }

    @Then("User verifies logout results")
    public void userVerifiesLogoutResults() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(), 'Customer Login')]"))
        );
        //Quit chrome
        driver.quit();
    }
}
