package org.examples.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;

public class Hooks {

    public static WebDriver driver;

    @Before
    public void pretest()
    {
        ChromeOptions option = new ChromeOptions();
        driver = new ChromeDriver(option);
        driver.manage().window().maximize();
        driver.navigate().refresh();
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
    }

    @After
    public void close_browser() throws InterruptedException {
        Thread.sleep(5000);
       driver.quit();
    }

}
