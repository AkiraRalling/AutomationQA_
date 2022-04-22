package tests.base;

import common_frame.GeneralClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import pages.base.BasePage;
import pages.home.HomePage;
import pages.listrooms.ListPage;

import static common_frame.Config.BROWSER_QUITE;
import static common_frame.Config.CLEAR_COOKIES_AND_STORAGE;

public class BaseTest {
    protected WebDriver driver = GeneralClass.webDriver();
    protected BasePage basePage = new BasePage(driver);
    protected HomePage page = new HomePage(driver);
    protected ListPage listPage = new ListPage(driver);

    @AfterTest
    public void clearCookiesAndLocalStorage() {
        if(CLEAR_COOKIES_AND_STORAGE) {
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear()");
        }
    }

    @AfterSuite (alwaysRun = true)
    public void close() {
        if(BROWSER_QUITE) {
            driver.quit();
        }
    }
}
