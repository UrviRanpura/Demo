package VNCEdgePOM.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class EditAccoutPage {

    WebDriver driver;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Edit Account')]")
    WebElement EditAccountButton;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Practice account']")
    WebElement EditAccountName;

    @FindBy(how = How.XPATH, using = "//ngx-select[@placeholder='No Account Type selected']/child::div")
    WebElement EditAccountTypeDropDown;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Practice')]")
    WebElement EditAccountType;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Update Account')]")
            WebElement UpdateAccount;

    EditAccoutPage(WebDriver d)
    {
        driver = d;
        PageFactory.initElements(d, this);
    }

    public void EditAccountButton()
    {
        EditAccountButton.click();
    }

    public void EditAccountName(String EAName) throws InterruptedException {
        EditAccountName.clear();
        Thread.sleep(5000);
        EditAccountName.sendKeys(EAName);
    }

    public void EditAccountTypeDropDown()
    {
        EditAccountTypeDropDown.click();
    }

    public void EditAccountType()
    {
        EditAccountType.click();
    }

    public void UpdateAccount()
    {
        UpdateAccount.click();
    }

}
