package VNCEdgePOM.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage {

    WebDriver driver;

    @FindBy(how = How.ID, using = "Email")
    WebElement Email;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Reset')]")
    WebElement Reset;

    @FindBy(how = How.XPATH, using = "//img[@alt='img']")
            WebElement EmailLogo;

    @FindBy(how = How.XPATH, using = "//p[@class='mb-4 text-muted']")
            WebElement EmailText;

    ForgotPasswordPage(WebDriver d)
    {
        driver = d;
        PageFactory.initElements(d, this);
    }

    public void Email(String email)
    {
        Email.sendKeys(email);
    }

    public void Reset()
    {
        Reset.click();
    }

    public void EmailLogo()
    {
        EmailLogo.isDisplayed();
    }

    public void EmailText()
    {
        EmailText.isDisplayed();
    }
}
