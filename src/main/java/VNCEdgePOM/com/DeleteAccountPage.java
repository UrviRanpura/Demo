package VNCEdgePOM.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DeleteAccountPage {

    WebDriver driver;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Delete Account')]")
    WebElement DeleteAccountButton;

    DeleteAccountPage(WebDriver d)
    {
        driver = d;
        PageFactory.initElements(d, this);
    }

    public void DeleteAccountButton()
    {
        DeleteAccountButton.click();
    }
}
