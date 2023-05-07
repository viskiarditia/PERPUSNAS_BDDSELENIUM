package org.example.pageObject.Profil;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilPage {

    public static WebDriver webDriver;

    public ProfilPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;

    }

    @FindBy(xpath = "/html[contains(.,'Perpustakaan Nasional Republik IndonesiaBerandaProfilKelembagaanVisi dan MisiFal')]")
    private WebElement Homepage;

    public boolean verifyHomePage() {
        Homepage.isDisplayed();
        return true;
    }

    @FindBy(xpath = "//a[.='Profil']")
    private WebElement Profil;

    public void setProfil() {
        Profil.click();
    }
    @FindBy(xpath = "//a[.='Kelembagaan']")
    private WebElement Kelembagaan;

    public void setKelembagaan() {
        Kelembagaan.click();
    }
//    VISI-MISI
    @FindBy(xpath = "//a[.='Visi dan Misi']")
    private WebElement VisiMisi;

    public void setVisiMisi() {
        VisiMisi.click();
    }

    @FindBy(xpath = "//div[@class='overflow-x-hidden']/div[@class='w-full']")
    private WebElement pageVisiMisi;

    public boolean setPageVisiMisi() {
        pageVisiMisi.isDisplayed();
        return true;

    }
//    FALSAFAH LOGO
    @FindBy(xpath = "//a[.='Falsafah Logo']")
    private WebElement FalsafahLogo;
    public void setFalsafahLogo(){
        FalsafahLogo.click();
    }
    @FindBy(xpath = "//div[@class='overflow-x-hidden']")
    private WebElement pageFalsafahLogo;

    public boolean setPageFalsafahLogo() {
        pageVisiMisi.isDisplayed();
        return true;
    }

}






