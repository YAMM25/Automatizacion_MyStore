package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {

    //variable
    private WebDriver driver;
    private By formAuthenticationLink = By.className("login");

    //constructor
    public HomePage (WebDriver driver)
    {
        this.driver = driver;
    }

    public LoginPage clickFormAuthentication(){
        driver.findElement(formAuthenticationLink).click();
        return new LoginPage(driver);
    }

    /*public void setHomePage(){
        System.setProperty("webdriver.chrome.driver","D:/YARLEY/Calidad/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        System.out.println(driver.getTitle());

    }*/
}
