package StepDefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class hooks {
    public static WebDriver driver;

    @Before
    public void pretest()
    {

        System.setProperty("webdriver.chrome.driver","J:\\Projects\\Login\\src\\main\\resources\\chromedriver.exe");
        ChromeOptions option = new ChromeOptions();
        driver = new ChromeDriver(option);
        driver.manage().window().maximize();
        driver.navigate().to("https://temp-release4-0-1.dafater.biz/index.html");
    }

    @After
    public void close_browser() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
