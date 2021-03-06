package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookStorePage extends PageBase {

    public BookStorePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"login\"]")
    WebElement loginBut;

    public LoginPage goToLoginPage() {
        loginBut.click();
        return new LoginPage(driver);

    }
}
