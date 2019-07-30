package gbh.framework.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    private WebDriver driver;

    @BeforeSuite
    public void beforeSuit(){
        final String URL_CHROMEWB = "C:\\Webdrivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", URL_CHROMEWB);
        WebDriver driver = new ChromeDriver();

        System.setProperty("headless", "false");
        String headless = System.getProperty("headless");

        //ChromeDriverManager.chromedriver();
        if("true".equals(headless)){
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--headless");
            driver = new ChromeDriver(chromeOptions);
        }else {
            driver = new ChromeDriver();
        }
    }

    @AfterSuite
    public void afterSuit(){
        if(null != driver){
            driver.close();
            driver.quit();
        }
    }

    public WebDriver getDriver(){
        return driver;
    }
}
