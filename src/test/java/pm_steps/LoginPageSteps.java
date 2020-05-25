package pm_steps;

import config.UserConfig;
import io.cucumber.java.en.Given;
import pages.LoginPage;

import static com.codeborne.selenide.Selenide.open;

public class LoginPageSteps {
    LoginPage loginPage = new LoginPage();

    @Given("admin is logged into supplier pages")
    public void adminIsLoggedIntoSupplierPages() throws Throwable {
        open("https://phonixx.test.parkmobile.nl/Epms/ePMS/default.aspx");
        loginPage.setLogin(UserConfig.USER_LOGIN);
        loginPage.setPassword(UserConfig.USER_PASSWORD);
        loginPage.clickLogin();
    }
}
