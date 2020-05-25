package pm_steps;

import io.cucumber.java.en.Then;
import pages.CustomerTabPage;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class CustomerTabPageSteps {

    CustomerTabPage customerTabPage = new CustomerTabPage();

    @Then("customer email is {string}")
    public void customerEmailIs(String email) {
        assertThat(customerTabPage.getCustomerEmail(), is(email));
    }
}
