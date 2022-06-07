package VNCEdgePOM.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    @FindBy(how = How.XPATH, using = "//img[@alt='logo']")
            WebElement Logo;

    @FindBy(how = How.XPATH, using = "//h3[contains(text(),'Login')]")
            WebElement  TextLogin;

    @FindBy(how = How.XPATH, using = "//p[contains(text(),'To Your Incredible Insights')]")
    WebElement  TitleText;

    @FindBy(how = How.ID, using = "Username")
    WebElement  Username;

    @FindBy(how = How.ID, using = "txt_Password")
    WebElement  Password;

    @FindBy(how = How.ID, using = "remember-me")
    WebElement  RememberMe;

    @FindBy(how = How.XPATH, using = "//a[@href='/Account/ForgotPassword']")
    WebElement  ForgotPasswordLink;

    @FindBy(how = How.XPATH, using = "//button[@name='button']")
    WebElement  LoginButton;

    LoginPage(WebDriver d)
    {
        driver = d;
        PageFactory.initElements(d, this);
    }

    /*public void Logo()
    {
        Logo.isDisplayed();
    }

    public void TextLogin()
    {
        TextLogin.isDisplayed();
    }

    public void TitleText()
    {
        TitleText.isDisplayed();
    }*/

    public void Username(String UName)
    {
        Username.sendKeys(UName);
    }

    public void Password(String Pass)
    {
        Password.sendKeys(Pass);
    }

    public void RememberMe()
    {
        RememberMe.click();
    }

    public void ForgotPasswordLink()
    {
        ForgotPasswordLink.click();
    }

    public void LoginButton()
    {
        LoginButton.click();
    }

}
