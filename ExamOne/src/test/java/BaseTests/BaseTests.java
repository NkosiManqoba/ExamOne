package BaseTests;
import Pages.HomePage;
import Pages.LoginPage;
import org.testng.annotations.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class BaseTests {

    public WebDriver driver;
    public HomePage homePage;

    @BeforeSuite
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        homePage = new HomePage(driver);

    }

    @AfterSuite
    public void closeWindow(){
        driver.close();
    }
}
