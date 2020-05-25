package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainSearchPage {
    private SelenideElement emailInput = $(By.cssSelector("#ctl00_cphMain_ucSearch_txtEmail"));
    private SelenideElement searchButton = $(By.cssSelector("#ctl00_cphMain_ucSearch_btnSearch"));

    public void setEmail(String email) {
        emailInput.val(email);
    }

    public void clickSearch(){
        searchButton.click();
    }
}
