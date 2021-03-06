package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "userName")
    WebElement userName;

    @FindBy(id = "password")
    WebElement pwd;

    @FindBy(id = "login")
    WebElement loginBtn;

    public ProfilePage loginpositive(String username, String password) {
        type(userName, username);
        type(pwd, password);
        loginBtn.click();
        return new ProfilePage(driver);
    }

    public LoginPage loginnegative(String username, String password) {
        type(userName, username);
        type(pwd, password);
        loginBtn.click();
        return this;

    }


}
