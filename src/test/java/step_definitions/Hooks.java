package step_definitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Hooks {
    public static WebDriver webDriver;
    @Before
    public void openBrowser(){
        ChromeOptions a = new ChromeOptions();
        a.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        webDriver= new ChromeDriver(a);
        String URL = "https://www.facebook.com/?stype=lo&jlou=AfcN47Xlz6u06dl1rAu3f5CalF-EcXlXB0t1-V6ITiqkD1869ns82sJqH0JYkzChPQbdk2ef6zrHIkwdCh-hlNl7JbpXxIJp9xwf1rqeR2fWjA&smuh=53382&lh=Ac89zypcN83ZyiTM7D4";
        webDriver.get(URL);
        webDriver.manage().window().maximize();
    }
    @After
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(2000);
        webDriver.quit();

    }

}