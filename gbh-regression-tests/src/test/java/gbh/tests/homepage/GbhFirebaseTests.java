package gbh.tests.homepage;

import gbh.framework.core.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GbhFirebaseTests extends BaseTest {
    WebDriver browser;

    @Test
    public void homepageTests(){
        GbhFirebaseTests gbhFirebaseTests = new GbhFirebaseTests();
        browser = new ChromeDriver();
        browser.get("https://gbhqatest.firebaseapp.com/");
    }
}
