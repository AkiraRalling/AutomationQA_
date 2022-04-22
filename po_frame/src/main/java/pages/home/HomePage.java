package pages.home;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    private final By countRooms = By.id("rooms");
    private final By selectRoom = By.xpath("//select[@id='rooms']/option[@value=3]");
    private final By chooseCity = By.id("select2-selectRegionResidential-container");
    private final By inputCity = By.xpath("//input[@type='search']");
    private final By pressButton = By.xpath("//div[@id='residentialInputs']//a[text()='Найти']");

    public HomePage clickOnThePath(String city) {
        driver.findElement(countRooms).click();
        driver.findElement(selectRoom).click();
        driver.findElement(chooseCity).click();
        driver.findElement(inputCity).sendKeys(city, Keys.ENTER);

        return this;
    }

    public HomePage buttonFind() {
        WebElement find = driver.findElement(pressButton);
        waitElementIsVisible(find).click();

        return this;
    }
}
