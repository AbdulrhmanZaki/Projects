package Pages;

import StepDefination.hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P01_login {

    public WebElement Email (WebDriver driver)
    {
        WebElement Email = hooks.driver.findElement(By.id("login_id"));
        return (Email);
    }

    public WebElement Password (WebDriver driver)
    {
        WebElement Password = driver.findElement(By.id("pass"));
        return (Password);
    }

    public WebElement login_BTN (WebDriver driver)
    {
        WebElement login = driver.findElement(By.id("login_btn"));

        return (login);
    }

    public WebElement Close_Tab (WebDriver driver) throws InterruptedException {
    Thread.sleep(2000);
        WebElement CloseTab = driver.findElement(By.xpath("/html/body/div[10]/div/div/div[1]/a"));
        return (CloseTab);

    }

}

