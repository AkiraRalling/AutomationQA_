package pages.listrooms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.base.BasePage;

import static common_frame.Config.REAL_COUNT_CARDS_IN_LIST;

public class ListPage extends BasePage {

    public ListPage(WebDriver driver) {
        super(driver);
    }

    private final By card = By.xpath("//div[contains(@class, 'listing-item')][@data-region=1]");

    public ListPage checkCountCards() {
        int countCard = driver.findElements(card).size();
        Assert.assertEquals(REAL_COUNT_CARDS_IN_LIST, countCard);
        return this;
    }
}
