package tests.searchappartment;

import org.testng.annotations.Test;
import pages.home.HomePage;
import tests.base.BaseTest;

import static common_frame.Config.Urls.REALT_HOME_PAGE;

public class SearchAppartmentTest extends BaseTest {

    @Test
    public void checkIsRedirectToListing() {
        basePage.open(REALT_HOME_PAGE);

        page
                .clickOnThePath("Брест")
                .buttonFind();

        listPage.checkCountCards();
    }
}
