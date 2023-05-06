package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.example.pageObject.LoginPage;

public class LoginSteps {

    private WebDriver webDriver;
    public LoginSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @When("User input Name Account \"(.*)\" and Password \"(.*)\"")
    public void inputAccound(String nameUser, String password){
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.setNameUser(nameUser);
        loginPage.setPassword(password);
        loginPage.setLogin();
    }
}
