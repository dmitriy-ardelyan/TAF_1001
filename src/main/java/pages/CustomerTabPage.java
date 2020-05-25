package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CustomerTabPage {
    private SelenideElement customerEmail = $(By.cssSelector("#ctl00_cphMain_UcClientDetailsFull1_UcPersonalDetails1_UcEmailAddress1_tbEmail"));

    public String getCustomerEmail() {
        return customerEmail.getValue();
    }
}
