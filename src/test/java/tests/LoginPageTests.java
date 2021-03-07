package tests;
//just for lulz
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginPageTests extends TestBase {


    @Test

    public void loginTest() {
        new HomePage(driver)
                .openBookstorePage()
                .goToLoginPage()
                .loginpositive("vitter", "Ulanbator2020!")
                .verifyUserName("vitter")
                .logout();

    }
}
