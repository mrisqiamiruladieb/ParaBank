package stepDef;

import config.env_target;
import util.FileUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FooterButtonBdd extends env_target {

    @Given("User is on homepage")
    public void userIsOnHomepage() {
        //Set driver location path
        System.setProperty("webdriver.chrome.driver","src\\main\\resources\\drivers\\chromedriver.exe");
        //Maximize driver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //Set url
        driver.get(baseUrl);
    }

    @When("User clicks the home button")
    public void userClicksTheHomeButton() {
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
    }

    @Then("User verifies home button result")
    public void userVerifiesHomeButtonResult() {
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

    @When("User clicks the about us button")
    public void userClicksTheAboutUsButton() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='footerPanel']/ul[1]/li[2]/a"))
        );
        //Set element locate
        //Click About Us Button
        driver.findElement(By.xpath("//*[@id='footerPanel']/ul[1]/li[2]/a")).click();
    }

    @Then("User verifies about us button result")
    public void userVerifiesAboutUsButtonResult() {
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

    @When("User clicks the services button")
    public void userClicksTheServicesButton() {
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
    }

    @Then("User verifies services button result")
    public void userVerifiesServicesButtonResult() {
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

    @And("User clicks the link store one")
    public void userClicksTheLinkStoreOne() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href, 'https://parabank.parasoft.com/parabank/services/store-01?wsdl')]"))
        );
        //Set element locate
        //Click Link store-01
        driver.findElement(By.xpath("//a[contains(@href, 'https://parabank.parasoft.com/parabank/services/store-01?wsdl')]")).click();
    }

    @Then("User verifies link store one result")
    public void userVerifiesLinkStoreOneResult() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.urlToBe("https://parabank.parasoft.com/parabank/services/store-01?wsdl")
        );
        //Quit chrome
        driver.quit();
    }

    @And("User clicks the link store one v two")
    public void userClicksTheLinkStoreOneVTwo() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href, 'https://parabank.parasoft.com/parabank/services/store-01V2?wsdl')]"))
        );
        //Set element locate
        //Click Link store-01V2
        driver.findElement(By.xpath("//a[contains(@href, 'https://parabank.parasoft.com/parabank/services/store-01V2?wsdl')]")).click();
    }

    @Then("User verifies link store one v two result")
    public void userVerifiesLinkStoreOneVTwoResult() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.urlToBe("https://parabank.parasoft.com/parabank/services/store-01V2?wsdl")
        );
        //Quit chrome
        driver.quit();
    }

    @And("User clicks the link store wss one")
    public void userClicksTheLinkStoreWssOne() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href, 'https://parabank.parasoft.com/parabank/services/store-wss-01?wsdl')]"))
        );
        //Set element locate
        //Click Link store-wss-01
        driver.findElement(By.xpath("//a[contains(@href, 'https://parabank.parasoft.com/parabank/services/store-wss-01?wsdl')]")).click();
    }

    @Then("User verifies link store wss one result")
    public void userVerifiesLinkStoreWssOneResult() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.urlToBe("https://parabank.parasoft.com/parabank/services/store-wss-01?wsdl")
        );
        //Quit chrome
        driver.quit();
    }

    @Given("User has set the download directory and is on the home page")
    public void userHasSetTheDownloadDirectoryAndIsOnTheHomePage() {
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
    }

    @And("User clicks the download file link button")
    public void userClicksTheDownloadFileLinkButton() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href, 'soatest.pfx')]"))
        );
        //Set element locate
        //Click download file link button
        driver.findElement(By.xpath("//a[contains(@href, 'soatest.pfx')]")).click();
    }

    @Then("User verifies the result of the downloaded file")
    public void userVerifiesTheResultOfTheDownloadedFile() throws IOException {
        //Verify Download Method
        Assertions.assertTrue(FileUtil.isFileDownloaded("soatest", "pfx", 5000));
        //Quit chrome
        driver.quit();
    }

    @And("User clicks the link store wss two")
    public void userClicksTheLinkStoreWssTwo() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href, 'https://parabank.parasoft.com/parabank/services/store-wss-02?wsdl')]"))
        );
        //Set element locate
        //Click Link store-wss-02
        driver.findElement(By.xpath("//a[contains(@href, 'https://parabank.parasoft.com/parabank/services/store-wss-02?wsdl')]")).click();
    }

    @Then("User verifies link store wss two result")
    public void userVerifiesLinkStoreWssTwoResult() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.urlToBe("https://parabank.parasoft.com/parabank/services/store-wss-02?wsdl")
        );
        //Quit chrome
        driver.quit();
    }

    @And("User clicks the link store wss three")
    public void userClicksTheLinkStoreWssThree() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href, 'https://parabank.parasoft.com/parabank/services/store-wss-03?wsdl')]"))
        );
        //Set element locate
        //Click Link store-wss-03
        driver.findElement(By.xpath("//a[contains(@href, 'https://parabank.parasoft.com/parabank/services/store-wss-03?wsdl')]")).click();
    }

    @Then("User verifies link store wss three result")
    public void userVerifiesLinkStoreWssThreeResult() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.urlToBe("https://parabank.parasoft.com/parabank/services/store-wss-03?wsdl")
        );
        //Quit chrome
        driver.quit();
    }

    @And("User clicks the link store wss four")
    public void userClicksTheLinkStoreWssFour() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href, 'https://parabank.parasoft.com/parabank/services/store-wss-04?wsdl')]"))
        );
        //Set element locate
        //Click Link store-wss-04
        driver.findElement(By.xpath("//a[contains(@href, 'https://parabank.parasoft.com/parabank/services/store-wss-04?wsdl')]")).click();
    }

    @Then("User verifies link store wss four result")
    public void userVerifiesLinkStoreWssFourResult() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.urlToBe("https://parabank.parasoft.com/parabank/services/store-wss-04?wsdl")
        );
        //Quit chrome
        driver.quit();
    }

    @And("User clicks the link loan processor")
    public void userClicksTheLinkLoanProcessor() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href, 'https://parabank.parasoft.com/parabank/services/LoanProcessor?wsdl')]"))
        );
        //Set element locate
        //Click Link LoanProcessor
        driver.findElement(By.xpath("//a[contains(@href, 'https://parabank.parasoft.com/parabank/services/LoanProcessor?wsdl')]")).click();
    }

    @Then("User verifies link loan processor result")
    public void userVerifiesLinkLoanProcessorResult() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.urlToBe("https://parabank.parasoft.com/parabank/services/LoanProcessor?wsdl")
        );
        //Quit chrome
        driver.quit();
    }

    @And("User clicks the link parabank")
    public void userClicksTheLinkParabank() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rightPanel']/table[3]/tbody/tr[2]/td[2]/a"))
        );
        //Set element locate
        //Click Link ParaBank
        driver.findElement(By.xpath("//*[@id='rightPanel']/table[3]/tbody/tr[2]/td[2]/a")).click();
    }

    @Then("User verifies link parabank result")
    public void userVerifiesLinkParabankResult() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.urlToBe("https://parabank.parasoft.com/parabank/services/ParaBank?wsdl")
        );
        //Quit chrome
        driver.quit();
    }

    @And("User clicks the link wadl")
    public void userClicksTheLinkWadl() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rightPanel']/table[5]/tbody/tr/td/a[1]"))
        );
        //Set element locate
        //Click Link wadl
        driver.findElement(By.xpath("//*[@id='rightPanel']/table[5]/tbody/tr/td/a[1]")).click();
    }

    @Then("User verifies link wadl result")
    public void userVerifiesLinkWadlResult() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.urlToBe("https://parabank.parasoft.com/parabank/services/bank?_wadl&_type=xml")
        );
        //Quit chrome
        driver.quit();
    }

    @And("User clicks the link swagger")
    public void userClicksTheLinkSwagger() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rightPanel']/table[5]/tbody/tr/td/a[2]"))
        );
        //Set element locate
        //Click Link swagger
        driver.findElement(By.xpath("//*[@id='rightPanel']/table[5]/tbody/tr/td/a[2]")).click();
    }

    @Then("User verifies link swagger result")
    public void userVerifiesLinkSwaggerResult() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.urlToBe("https://parabank.parasoft.com/parabank/api-docs/index.html")
        );
        //Quit chrome
        driver.quit();
    }

    @When("User clicks the products button")
    public void userClicksTheProductsButton() {
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
    }

    @Then("User verifies products button result")
    public void userVerifiesProductsButtonResult() {
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

    @When("User clicks the locations button")
    public void userClicksTheLocationsButton() {
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
    }

    @Then("User verifies locations button result")
    public void userVerifiesLocationsButtonResult() {
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

    @When("User clicks the forum button")
    public void userClicksTheForumButton() {
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
    }

    @Then("User verifies forum button result")
    public void userVerifiesForumButtonResult() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.urlToBe("https://forums.parasoft.com/")
        );
        //Quit chrome
        driver.quit();
    }

    @When("User clicks the site map button")
    public void userClicksTheSiteMapButton() {
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
    }

    @And("User clicks the site map about us button")
    public void userClicksTheSiteMapAboutUsButton() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rightPanel']/ul[1]/li[2]/a"))
        );
        //Set element locate
        //Click About Us Button
        driver.findElement(By.xpath("//*[@id='rightPanel']/ul[1]/li[2]/a")).click();
    }

    @And("User clicks the site map services button")
    public void userClicksTheSiteMapServicesButton() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rightPanel']/ul[1]/li[3]/a"))
        );
        //Set element locate
        //Click Services Button
        driver.findElement(By.xpath("//*[@id='rightPanel']/ul[1]/li[3]/a")).click();
    }

    @And("User clicks the site map products button")
    public void userClicksTheSiteMapProductsButton() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rightPanel']/ul[1]/li[4]/a"))
        );
        //Set element locate
        //Click Products Button
        driver.findElement(By.xpath("//*[@id='rightPanel']/ul[1]/li[4]/a")).click();
    }

    @And("User clicks the site map locations button")
    public void userClicksTheSiteMapLocationsButton() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rightPanel']/ul[1]/li[5]/a"))
        );
        //Set element locate
        //Click Locations Button
        driver.findElement(By.xpath("//*[@id='rightPanel']/ul[1]/li[5]/a")).click();
    }

    @And("User clicks the site map admin page button")
    public void userClicksTheSiteMapAdminPageButton() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rightPanel']/ul[1]/li[6]/a"))
        );
        //Set element locate
        //Click Admin Page Button
        driver.findElement(By.xpath("//*[@id='rightPanel']/ul[1]/li[6]/a")).click();
    }

    @And("User makes settings")
    public void userMakesSettings() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("accessMode3"))
        );
        //Select data access mode
        driver.findElement(By.id("accessMode3")).click();
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
    }

    @Then("User verification creates setup results")
    public void userVerificationCreatesSetupResults() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//b[contains(text(), 'Settings saved successfully.')]"))
        );
        //Quit chrome
        driver.quit();
    }

    @And("User clicks the admin page submit button")
    public void userClicksTheAdminPageSubmitButton() {
        //Click Submit Button
        driver.findElement(By.xpath("//input[@type='submit'][@class='button'][@value='Submit']")).click();
    }

    @And("User clicks the site map open new account button")
    public void userClicksTheSiteMapOpenNewAccountButton() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rightPanel']/ul[2]/li[1]/a"))
        );
        //Set element locate
        //Click Open New Account Button
        driver.findElement(By.xpath("//*[@id='rightPanel']/ul[2]/li[1]/a")).click();
    }

    @Then("User verifies site map open new account button result")
    public void userVerifiesSiteMapOpenNewAccountButtonResult() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.urlToBe("https://parabank.parasoft.com/parabank/openaccount.htm")
        );
        //Quit chrome
        driver.quit();
    }

    @And("User clicks the site map accounts overview button")
    public void userClicksTheSiteMapAccountsOverviewButton() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rightPanel']/ul[2]/li[2]/a"))
        );
        //Set element locate
        //Click Accounts Overview Button
        driver.findElement(By.xpath("//*[@id='rightPanel']/ul[2]/li[2]/a")).click();
    }

    @Then("User verifies site map accounts overview button result")
    public void userVerifiesSiteMapAccountsOverviewButtonResult() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.urlToBe("https://parabank.parasoft.com/parabank/overview.htm")
        );
        //Quit chrome
        driver.quit();
    }

    @And("User clicks the site map transfer funds button")
    public void userClicksTheSiteMapTransferFundsButton() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rightPanel']/ul[2]/li[3]/a"))
        );
        //Set element locate
        //Click Transfer Funds Button
        driver.findElement(By.xpath("//*[@id='rightPanel']/ul[2]/li[3]/a")).click();
    }

    @Then("User verifies site map transfer funds button result")
    public void userVerifiesSiteMapTransferFundsButtonResult() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.urlToBe("https://parabank.parasoft.com/parabank/transfer.htm")
        );
        //Quit chrome
        driver.quit();
    }

    @And("User clicks the site map bill pay button")
    public void userClicksTheSiteMapBillPayButton() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rightPanel']/ul[2]/li[4]/a"))
        );
        //Set element locate
        //Click Bill Pay Button
        driver.findElement(By.xpath("//*[@id='rightPanel']/ul[2]/li[4]/a")).click();
    }

    @Then("User verifies site map bill pay button result")
    public void userVerifiesSiteMapBillPayButtonResult() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.urlToBe("https://parabank.parasoft.com/parabank/billpay.htm")
        );
        //Quit chrome
        driver.quit();
    }

    @And("User clicks the site map find transactions button")
    public void userClicksTheSiteMapFindTransactionsButton() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rightPanel']/ul[2]/li[5]/a"))
        );
        //Set element locate
        //Click Find Transactions Button
        driver.findElement(By.xpath("//*[@id='rightPanel']/ul[2]/li[5]/a")).click();
    }

    @Then("User verifies site map find transactions button result")
    public void userVerifiesSiteMapFindTransactionsButtonResult() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.urlToBe("https://parabank.parasoft.com/parabank/findtrans.htm")
        );
        //Quit chrome
        driver.quit();
    }

    @And("User clicks the site map update contact info button")
    public void userClicksTheSiteMapUpdateContactInfoButton() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rightPanel']/ul[2]/li[6]/a"))
        );
        //Set element locate
        //Click Update Contact Info Button
        driver.findElement(By.xpath("//*[@id='rightPanel']/ul[2]/li[6]/a")).click();
    }

    @Then("User verifies site map update contact info button result")
    public void userVerifiesSiteMapUpdateContactInfoButtonResult() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.urlToBe("https://parabank.parasoft.com/parabank/updateprofile.htm")
        );
        //Quit chrome
        driver.quit();
    }

    @And("User clicks the site map request loan button")
    public void userClicksTheSiteMapRequestLoanButton() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rightPanel']/ul[2]/li[7]/a"))
        );
        //Set element locate
        //Click Request Loan Button
        driver.findElement(By.xpath("//*[@id='rightPanel']/ul[2]/li[7]/a")).click();
    }

    @Then("User verifies site map request loan button result")
    public void userVerifiesSiteMapRequestLoanButtonResult() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.urlToBe("https://parabank.parasoft.com/parabank/requestloan.htm")
        );
        //Quit chrome
        driver.quit();
    }

    @And("User clicks the site map logout button")
    public void userClicksTheSiteMapLogoutButton() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rightPanel']/ul[2]/li[8]/a"))
        );
        //Set element locate
        //Click Logout Button
        driver.findElement(By.xpath("//*[@id='rightPanel']/ul[2]/li[8]/a")).click();
    }

    @Then("User verifies site map logout button result")
    public void userVerifiesSiteMapLogoutButtonResult() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.urlToBe("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC")
        );
        //Quit chrome
        driver.quit();
    }

    @When("User clicks the contact us button")
    public void userClicksTheContactUsButton() {
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
    }

    @Then("User verifies contact us button result")
    public void userVerifiesContactUsButtonResult() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='title'][contains(text(), 'Customer Care')]"))
        );
        //Quit chrome
        driver.quit();
    }

    @When("User clicks the visit us at button")
    public void userClicksTheVisitUsAtButton() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='footerPanel']/ul[2]/li[2]/a"))
        );
        //Set element locate
        //Click Visit Us At Button
        driver.findElement(By.xpath("//a[contains(@href, 'http://www.parasoft.com/')][@target='_blank']")).click();
    }

    @Then("User verifies visit us at button result")
    public void userVerifiesVisitUsAtButtonResult() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
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
