package StepDefination;

import Pages.Acounts_Page;
import Pages.P01_login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountsStep {
    Acounts_Page acc = new Acounts_Page();

    @Given("Login to homepage of website")
    public void valid_login_Data() throws InterruptedException {
        acc.Email(hooks.driver).sendKeys("abdulrhmanzakii@gmail.com");
        acc.Password(hooks.driver).sendKeys("Zekw@2911");
        acc.login_BTN(hooks.driver).click();
        acc.Close_Tab(hooks.driver).click();
    }
  @When
("Select Accounts from the side bar and Accounts Giude")
  public void Select_Accounts() {

        acc.Select_Accounts().click();
        acc.Select_AccountsGuide().click();
        acc.Select_Assets().click();

  }

@Then("Change the name of assets")

public void ChangeName () {
    acc.RenametheAssets().click();
    acc.EnterData_Renamefield().sendKeys("اصول");
    acc.Rename_btn().click();
    }
@Then("Add new Account")

public void AddNewAcc(){
        acc.ClickOn_AddNew().click();
        acc.AddNewAcc().sendKeys("Add Data");
        acc.SelectGroup().click();

}

}
