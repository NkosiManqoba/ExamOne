package BaseTests;

import Pages.BookAppointmentPage;
import Pages.HomePage;
import Pages.LoginPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends BaseTests {

    @Test(priority = 1,dataProvider = "loginDetails")
    public void loginTest(String userName , String password) {

    LoginPage loginPage = homePage.clickMakeAppointment();
    loginPage.sendUsername(userName);
    loginPage.sendPassword(password);
    loginPage.logIN();

    }

        @DataProvider
        public Object[][] loginDetails() {
            Object[][] data = new Object[1][2];

            data[0][0] = "John Doe";data[0][1]="ThisIsNotAPassword";

            return data;
        }
    }

