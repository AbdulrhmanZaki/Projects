package org.examples.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.examples.pages.P03_homePage;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class D03_currenciesStepDef {
    P03_homePage homePage = new P03_homePage();
    String product;

    @When("Step 1 user select Euro currency from the dropdown list on the top left of home page")
    public void set_Euro(){
        Select Euro = new Select(homePage.currency_Euro(Hooks.driver));
        Euro.selectByValue("https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F");
    }


}
