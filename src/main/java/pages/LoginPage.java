package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private SelenideElement loginInput = $(By.cssSelector("#theUcUserLoginControl_userName"));
    private SelenideElement passwordInput = $(By.cssSelector("#theUcUserLoginControl_password"));
    private SelenideElement loginButton = $(By.cssSelector("#theUcUserLoginControl_logOn"));

    public void setLogin(String login) {
        loginInput.val(login);
    }

    public void setPassword(String password) {
        passwordInput.val(password);
    }

    public void clickLogin(){
        loginButton.click();
    }
}
