package pm_steps;

import io.cucumber.java.en.When;
import pages.MainSearchPage;

public class MainSearchSteps {
    MainSearchPage mainSearchPage = new MainSearchPage();

    @When("admin performs search by {string}")
    public void adminPerformsSearchBy(String email) throws Throwable {
        mainSearchPage.setEmail(email);
        mainSearchPage.clickSearch();
    }
}
