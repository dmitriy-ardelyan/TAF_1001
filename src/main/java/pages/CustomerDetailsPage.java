package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CustomerDetailsPage {
    private SelenideElement customerDetailsTitle = $(By.cssSelector("#ctl00_cphMain_lblTitle"));

    public String getPageTitle() {
        return customerDetailsTitle.getText();
    }
}
