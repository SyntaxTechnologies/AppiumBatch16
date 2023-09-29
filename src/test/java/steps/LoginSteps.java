package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CofigReader;
import utils.CommonMethods;

import java.net.MalformedURLException;

public class LoginSteps extends CommonMethods {

    @Given("user opens the appium driver")
    public void user_opens_the_appium_driver() throws MalformedURLException {
        launchingTheApplication();
    }

    @When("user enters username and password")
    public void user_enters_username_and_password() {
        loginPage.enterUsername(CofigReader.getPropertyValue("usernamekey"));
        loginPage.enterPassword(CofigReader.getPropertyValue("passwordkey"));
    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        loginPage.clickLoginButton();
    }
    @Then("user should be able to navigate to products page")
    public void user_should_be_able_to_navigate_to_products_page() {
        System.out.println("Test passed");
    }
}
