package pm_steps;

import io.cucumber.java.en.Then;
import pages.CustomerDetailsPage;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class CustomerDetailsPageSteps {
    CustomerDetailsPage customerDetailsPage = new CustomerDetailsPage();

    @Then("admin redirected to Customer details page")
    public void adminRedirectedToCustomerDetailsPage() {
        assertThat(customerDetailsPage.getPageTitle(), equalTo("Customer Overview"));
    }
}
