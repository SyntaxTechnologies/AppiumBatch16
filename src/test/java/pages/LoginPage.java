package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.cucumber.java.en.And;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;
import io.appium.java_client.MobileElement;

public class LoginPage extends CommonMethods {

    @AndroidFindBy(xpath = "//*[@text='Username']")
    public MobileElement usernameTextField;

    @AndroidFindBy(xpath="//*[@text='Password']")
    public MobileElement passwordTextField;

    @AndroidFindBy(xpath = "//*[@text='LOGIN']")
    public MobileElement loginButton;

    public LoginPage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void enterUsername(String username){
        usernameTextField.click();
        usernameTextField.clear();
        usernameTextField.sendKeys(username);
    }

    public void enterPassword(String password){
        passwordTextField.click();
        passwordTextField.clear();
        passwordTextField.sendKeys(password);
    }

    public void clickLoginButton(){
        loginButton.click();
    }

}
