package base;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.LoginPage;
import pages.SecureAreaPage;
import static org.testng.Assert.assertEquals;


public class BaseTest {

    //variables
    private WebDriver driver;
    protected HomePage homePage;


   @BeforeEach
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver","D:\\YARLEY\\testatomationu\\src\\test\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        homePage = new HomePage(driver);

    }

    @Test
    public void testLoginExitoso()
    {
        LoginPage loginPage = homePage.clickFormAuthentication();

        loginPage.setEmail("antuquirry2820@hotmail.com");
        loginPage.setPassword("yammantuco8");
        SecureAreaPage secureAreaPage = loginPage.iniciarSesion();
        WebElement msg= driver.findElement(By.xpath("//*[@id=\"center_column\"]/p"));
        assertEquals("Welcome to your account. Here you can manage all of your personal information and orders.",
                msg.getText());

    }
    @Test
    public void testSearch(){
        WebElement searchInput = driver.findElement(By.id("search_query_top"));
        searchInput.sendKeys("Printed");
        searchInput.submit();
        WebElement msg= driver.findElement(By.xpath("//*[@id=\"center_column\"]/h1/span[2]"));
        assertEquals("5 results have been found.",
                msg.getText());
    }

    @AfterEach
    public void endUp(){
        driver.quit();
    }
}
