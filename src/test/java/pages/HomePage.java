package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div/div[6]")
    WebElement bookstoreApp;

    public BookStorePage openBookstorePage(){
        bookstoreApp.click();
        return new BookStorePage(driver);
    }


}
