package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage
{
    //variables
    private WebDriver driver;
    private By email = By.cssSelector("input#email");
    private By password = By.cssSelector("input#passwd");
    private By buttonSignIn = By.id("SubmitLogin");
   // private By login = By.className("login");

    //constructor
    public LoginPage (WebDriver driver)
    {
        this.driver = driver;
    }
    public void setEmail(String user)
    {
        driver.findElement(email).sendKeys(user);
    }

    public void setPassword(String pass)
    {
        driver.findElement(password).sendKeys(pass);
    }

    //método iniciar sesión
    public SecureAreaPage iniciarSesion()
    {
        driver.findElement(buttonSignIn).click();
        return new SecureAreaPage(driver);
    }

}
