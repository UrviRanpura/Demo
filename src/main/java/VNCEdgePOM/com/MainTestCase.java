package VNCEdgePOM.com;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class MainTestCase {

    WebDriver driver;

    JavascriptExecutor js = (JavascriptExecutor) driver;

    //Page Declaration
    LoginPage LPage = new LoginPage(driver);
    ForgotPasswordPage FPPage = new ForgotPasswordPage(driver);
    OpenAccountPage OAPage = new OpenAccountPage(driver);
    AddAccountPage AAPage = new AddAccountPage(driver);
    CommonButtonsPage CBPage = new CommonButtonsPage(driver);
    EditAccoutPage EAPage = new EditAccoutPage(driver);
    DeleteAccountPage DAPage = new DeleteAccountPage(driver);

    @BeforeMethod
    public void LaunchBrowserApplication() throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "D:/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://testlogin.vncedge.com/Account/Login?ReturnUrl=%2Fconnect%2Fauthorize%2Fcallback%3Fclient_id%3Dtestclient%26redirect_uri%3Dhttps%253A%252F%252Ftestapp.vncedge.com%252Fwsa%252Fsignin-oidc%26response_type%3Did_token%2520token%26scope%3Dopenid%2520profile%2520roles%2520tourmanagementapi%26state%3D4bdbaa8e0e5a45e2845acbbc158b58ed%26nonce%3Dd09f21ce96824dfca7efe49664c16f27");

        Thread.sleep(10000);
    }

    //Login Page
    @Test(priority = 2)
    public void LoginTestCase() throws InterruptedException
    {
        //LPage.Logo();
        //LPage.TextLogin();
        //LPage.TextLogin();
        LPage.Username("hemang_superadmin@yopmail.com");
        LPage.Password("Edge@2020");
        Thread.sleep(5000);
        LPage.RememberMe();
        Thread.sleep(5000);
    }

    //Forgot Password Page Test
    @Test(priority = 1)
    public void ForgotPasswordPageTestCase() throws InterruptedException
    {
        LPage.ForgotPasswordLink();
        FPPage.Email("Test123@yopmail.com");
        FPPage.Reset();
        Thread.sleep(5000);
        FPPage.EmailLogo();
        FPPage.EmailText();
        Thread.sleep(5000);
    }

        //Back to Login Page
    /*@Test(priority = 2)
    public void BackToLoginTestCase() throws InterruptedException
    {
        driver.navigate().back();
        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(10000);
        LPage.Password("Edge@2020");
        Thread.sleep(1000);
        LPage.LoginButton();
        Thread.sleep(30000);
    }*/

    //Add Account Form
    @Test(priority = 3)
    public void AddAccountTestCase() throws InterruptedException
    {
        OAPage.WelcomeText();
        AAPage.AddAccount();
        AAPage.CloseX();
        Thread.sleep(5000);
        AAPage.AddAccount();
        Thread.sleep(2000);
        AAPage.AccountName("Test Automation");
        AAPage.AccountType();
        Thread.sleep(1000);
        AAPage.SelectAccountType();
        Thread.sleep(5000);
        AAPage.PrimaryUser("kansara.nidhi@gmail.com");
        AAPage.Check();
        Thread.sleep(2000);
        try {
            AAPage.FirstName("Nidhi");
            AAPage.LastName("Kansara");
            Thread.sleep(5000);
            //AAPage.AddAccount();
            //Thread.sleep(5000);
            //CBPage.OK();
        } catch (Exception e) {
            AAPage.AddAccount();
            Thread.sleep(5000);
            CBPage.OK();
        }

        Thread.sleep(20000);

    }

    //Edit Account Page
    @Test(priority = 4)
    public void EditAccountTestCase() throws InterruptedException
    {
        OAPage.SearchBox("Test Automation");
        Thread.sleep(5000);
        EAPage.EditAccountButton();
        Thread.sleep(10000);
        EAPage.EditAccountName("Test Automation1");
        Thread.sleep(2000);
        EAPage.EditAccountTypeDropDown();
        Thread.sleep(2000);
        EAPage.EditAccountType();
        AAPage.Check();
        Thread.sleep(5000);
        EAPage.UpdateAccount();
        Thread.sleep(2000);
        CBPage.OK();
    }


    //Delete Account Page
    @Test(priority = 5)
    public void DeleteAccountTestCase() throws InterruptedException {
        Thread.sleep(5000);
        OAPage.SearchBox("Test Automation1");
        Thread.sleep(5000);
        DAPage.DeleteAccountButton();
        Thread.sleep(2000);
        CBPage.No();
        Thread.sleep(2000);
        CBPage.OK();
        Thread.sleep(2000);
        DAPage.DeleteAccountButton();
        Thread.sleep(2000);
        CBPage.Yes();
        Thread.sleep(50000);
        CBPage.OK();
    }

    //Open Account Page
    @Test(priority = 6)
    public void OpenAccountTestCase() throws InterruptedException
    {
        Thread.sleep(5000);
        OAPage.SearchBox.clear();
        Thread.sleep(5000);
        OAPage.SearchBox("Demo_Practice Account");
        Thread.sleep(5000);
        OAPage.OpenAccount();

        Thread.sleep(20000);
    }

    @AfterMethod
    public void TearDown()
    {
        driver.quit();
    }
}
