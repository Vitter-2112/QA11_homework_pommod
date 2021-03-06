package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginPageTests extends TestBase {


    @Test

    public void loginTest() {
        new HomePage(driver)
                .openBookstorePage()
                .goToLoginPage()
                .loginpositive("neuer", "Neuer1234!")
                .verifyUserName("neuer")
                .logout();

    }
}
