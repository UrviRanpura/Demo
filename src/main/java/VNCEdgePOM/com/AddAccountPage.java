package VNCEdgePOM.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddAccountPage {

    WebDriver driver;

    @FindBy(how = How.XPATH, using = "//button[@class='btn-close']")
    WebElement CloseX;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Enter account name']")
    WebElement AccountName;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'No Account Type selected')]")
    WebElement AccountType;

    @FindBy(how = How.XPATH, using = "//ul[@role='menu']/child::li[2]")
    WebElement SelectAccountType;

    @FindBy(how = How.ID, using = "#")
    WebElement PrimaryUser;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Check')]")
    WebElement Check;

    @FindBy(how = How.XPATH, using = "//input[@formcontrolname='fName']")
            WebElement FirstName;

    @FindBy(how = How.XPATH, using = "//input[@formcontrolname='lName']")
            WebElement LastName;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Add Account')]")
            WebElement AddAccountButton;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Add Account')]")
    WebElement AddAccount;

    AddAccountPage(WebDriver d)
    {
        driver = d;
        PageFactory.initElements(d, this);
    }

    public void CloseX()
    {
        CloseX.click();
    }

    public void AddAccount()
    {
        AddAccount.click();
    }

    public void AccountName(String AName)
    {
        AccountName.sendKeys(AName);
    }

    public void AccountType()
    {
        AccountType.click();
    }

    public void SelectAccountType()
    {
        SelectAccountType.click();
    }

    public void PrimaryUser(String PUser)
    {
        PrimaryUser.sendKeys(PUser);
    }

    public void Check()
    {
        Check.click();
    }

    public void FirstName(String FName)
    {
        FirstName.sendKeys(FName);
    }

    public void LastName(String LName)
    {
        LastName.sendKeys(LName);
    }

    public void AddAccountButton()
    {
        AddAccountButton.click();
    }
}
