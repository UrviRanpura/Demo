package VNCEdgePOM.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class OpenAccountPage {

    WebDriver driver;

    @FindBy(xpath = "//h3[contains(text(),'Welcome to VNC EDGE')]")
    WebElement WelcomeText;

    @FindBy(xpath = "//input[@placeholder='Search']")
    WebElement SearchBox;

    @FindBy(xpath = "//a[contains(text(),'Open Account')]")
    WebElement OpenAccount;

    OpenAccountPage(WebDriver d)
    {
        driver = d;
        PageFactory.initElements(d, this);
    }

    public void WelcomeText()
    {
        WelcomeText.isDisplayed();
    }

    public void SearchBox(String search)
    {
        SearchBox.sendKeys(search);
    }

    public void OpenAccount()
    {
        OpenAccount.click();
    }


}
