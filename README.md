# ParaBank
Web Automation <br>

<b> Situs uji : </b> https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC <br>

<b>Note :</b> <u>Branch Information</u>
<li><b>master : </b>inisialisasi project</li>
<li><b>SelJav : </b>Selenium Java</li>
<li><b>Bdd-Tdd : </b>Cucumber Java (BDD & TDD)</li>
<li><b>GeRaTa : </b>Generate Random Data &rarr; Automate Registration Form</li>
<li><b>POM : </b>Page Object Modelling</li>

<h3>Step</h3>
<h4>1. Change Download Directory</h4>
<li><u>Referensi 1</u> : https://www.programsbuzz.com/article/selenium-change-download-directory-chrome</li>
<li><u>Referensi 2</u> : http://makeseleniumeasy.com/2018/08/25/how-to-change-default-download-directory-for-chrome-browser-in-selenium-webdriver/</li>
<li><u>Case</u> : services_bookstore_soap_download_soatest_pfx (test method) pada src/test/java/home/FooterButton.java</li>
<li>Tambahkan import org.openqa.selenium.chrome.ChromeOptions; import java.util.Map; import java.util.HashMap; import java.io.File;</li>
<li>Sesuaikan code dengan <u>Referensi</u></li>

<h4>2. Verify File Download</h4>
<li><u>Referensi</u> : https://www.programsbuzz.com/article/how-verify-file-download-selenium-webdriver-java#verify-download-method</li>
<li><u>Resolving</u> : https://stackoverflow.com/questions/4917326/how-to-iterate-over-the-files-of-a-certain-directory-in-java</li>
<li>Buat java class berikut pada direktori : src/test/java/util/<b>FileUtil.java</b></li>
<li>Buat <b>Verify File Download method</b> dan sesuaikan code dengan <u>Referensi</u> dan <u>Resolving</u></li>
<li>Pada <u>case</u> <b>services_bookstore_soap_download_soatest_pfx (test method)</b> pada src/test/java/home/<b>FooterButton.java</b></li>
<li>Tambahkan import util.FileUtil; import org.junit.jupiter.api.Assertions; import java.io.IOException;</li>
<li>Sesuaikan code dengan <u>Referensi</u></li>

<h4>3. Switch/Tab Window</h4>
<li><u>Referensi 1</u> : https://www.programsbuzz.com/article/handle-multiple-windows-or-tabs-selenium-java</li>
<li><u>Referensi 2</u> : http://makeseleniumeasy.com/2020/11/05/does-getwindowhandles-method-return-handles-in-the-same-order-as-windows-launch/</li>
<li><u>Case</u> : <b>visit_us_at (test method)</b> pada src/test/java/home/<b>FooterButton.java</b></li>
<li>Tambahkan import java.util.Set;</li>
<li>Sesuaikan code dengan <u>Referensi</u></li>
