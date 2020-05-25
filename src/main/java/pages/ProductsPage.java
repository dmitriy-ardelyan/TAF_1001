package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ProductsPage {
    private SelenideElement customerDetailsTitle = $(By.cssSelector("#ctl00_cphMain_lblTitle"));
    private SelenideElement productTypeLabel = $(By.cssSelector("#ctl00_cphMain_UcClientPermitOverview1_lblPermitType"));
    private SelenideElement customerTab = $(By.cssSelector("#ctl00_cphMain_Tabs1_tabList_ctl00_TabButton"));

    public String getPageTitle() {
        return customerDetailsTitle.getText();
    }

    public boolean isProductTypeLabelDisplayed() {
        return productTypeLabel.isDisplayed();
    }

    public void goToCustomerTab() {
        customerTab.click();
    }
}
