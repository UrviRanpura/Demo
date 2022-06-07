package VNCEdgePOM.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CommonButtonsPage {

    WebDriver driver;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'OK')]")
    WebElement OK;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'No')]/parent::div")
    WebElement No;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Yes')]/parent::div")
    WebElement Yes;

    CommonButtonsPage(WebDriver d)
    {
        driver = d;
        PageFactory.initElements(d, this);
    }

    public void OK()
    {
        OK.click();
    }

    public void No()
    {
        No.click();
    }

    public void Yes()
    {
        Yes.click();
    }
}
