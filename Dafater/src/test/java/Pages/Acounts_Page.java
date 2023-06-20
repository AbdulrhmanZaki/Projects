package Pages;

import StepDefination.hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Acounts_Page {
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
        hooks.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement CloseTab = driver.findElement(By.xpath("/html/body/div[10]/div/div/div[1]/a"));
        return (CloseTab);

    }

    public WebElement Select_Accounts ()
    {
       hooks.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement Acc =  hooks.driver.findElement(By.id("module-anchor-Accounts"));
        return Acc;
    }
    public WebElement Select_AccountsGuide ()
    {
        hooks.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement AccG =  hooks.driver.findElement(By.id("sidebar-accounts-chart-of-accounts"));
        return AccG;
    }
    public WebElement Select_Assets ()
    {
        hooks.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement asset =  hooks.driver.findElement(By.xpath("//*[@id=\"page-Accounts Browser\"]/div/div[2]/div[1]/div/ul/li[1]/span[1]/a"));
        return asset;
    }
    public WebElement RenametheAssets () {

        WebElement Rename = hooks.driver.findElement(By.xpath("//*[@id=\"page-Accounts Browser\"]/div/div[2]/div[1]/div/ul/li[1]/span[2]/a[3]"));
        return Rename;
    }

    public WebElement EnterData_Renamefield () {

        WebElement Field = hooks.driver.findElement(By.xpath("/html/body/div[14]/div/div/div[2]/div[1]/div/div[1]/input"));
        return Field;
    }
    public WebElement Rename_btn () {

        WebElement btn = hooks.driver.findElement(By.id("Button-rename"));
        return btn;
    }

        public WebElement ClickOn_AddNew () {

        WebElement Add = hooks.driver.findElement(By.xpath("//*[@id=\"page-Accounts Browser\"]/div/div[2]/div[1]/div/ul/li[1]/span[2]/a[2]"));
        return Add;
    }

    public WebElement AddNewAcc () {

        WebElement AccField = hooks.driver.findElement(By.xpath("/html/body/div[16]/div/div/div[2]/div[1]/div/div[1]/input"));
        return AccField;
    }
    public WebElement SelectGroup () {

        WebElement group = hooks.driver.findElement(By.xpath("/html/body/div[16]/div/div/div[2]/div[2]/div/div[1]/div/div/div/ul/li[1]/a/span[1]"));
        return group;
    }

}
