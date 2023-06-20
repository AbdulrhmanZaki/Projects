package StepDefination;

import Pages.P01_login;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

public class loginStepDef {

P01_login login = new P01_login();

    @And("Step 1 user login to Website with valid data")
    public void valid_login_Data() {
        login.Email(hooks.driver).sendKeys("abdulrhmanzakii@gmail.com");
        login.Password(hooks.driver).sendKeys("Zekw@2911");
    }
    @When("Step 2 user press on login button")
    public void login_BTN()
    {
        login.login_BTN(hooks.driver).click();
    }

    @Then ("Step 3 user login to the system successfully")
    public void valid_Message()
    {
        SoftAssert soft_assert = new SoftAssert();
        soft_assert.assertEquals("https://temp-release4-0-1.dafater.biz/index.html", hooks.driver.getCurrentUrl());

        soft_assert.assertAll();
    }

}
