package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public static WebDriver driver;
    public  LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//input[@id='email']")
    private WebElement nameUser;

    @FindBy(xpath = "//input[@id='pass']")
    private WebElement password;

    @FindBy(xpath = "//button[@name='login']")
    private WebElement login;


    public void setNameUser(String name){
        nameUser.sendKeys(name);
    }

    public void setPassword(String sandi){
        password.sendKeys(sandi);
    }

    public void setLogin(){
        login.click();
    }



}
