package pm_steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ProductsPage;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ProductsPageSteps {
    ProductsPage productsPage = new ProductsPage();

    @Then("admin redirected to customer details page")
    public void adminRedirectedToCustomerDetailsPage() {
        assertThat(productsPage.getPageTitle(), equalTo("Customer Overview"));
    }

    @And("products tab displayed")
    public void productsTabDisplayed() {
        assertThat(productsPage.isProductTypeLabelDisplayed(), is(true));
    }

    @When("admin switches to customer tab")
    public void adminSwitchesToCustomerTab() {
        productsPage.goToCustomerTab();
    }
}
