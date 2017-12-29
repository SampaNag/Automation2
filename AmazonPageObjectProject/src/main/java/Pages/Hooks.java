package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks  {
    public static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }



    public static void openBrowser() {
        System.out.println("starting the browser");
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();

        driver.get(AutomationConstants.URL);//open
        driver.manage().timeouts().implicitlyWait(AutomationConstants.MAX_TIMEOUTS, TimeUnit.SECONDS);
        //WebDriverUtil.setOurOwnScreenSize(AutomationConstants.SCREENSIZE);

    }


    public static void closeBrowser() {
        System.out.println("I am in closing");
        driver.quit();
    }

}
