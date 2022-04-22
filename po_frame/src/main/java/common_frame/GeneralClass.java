package common_frame;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static common_frame.Config.PLATFORM_DRIVER;
import static common_frame.Config.TimeoutsVariables.IMPLICIT_WAIT;

public class GeneralClass {
    public static WebDriver webDriver() {
        WebDriver driver = null;

        switch (PLATFORM_DRIVER) {
            case "win_chrome":
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
                driver = new ChromeDriver();
                break;
            default:
                Assert.fail("Incorrect platform/browser: " + PLATFORM_DRIVER );
                System.err.print("\tERROR");
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
        return driver;
    }
}
