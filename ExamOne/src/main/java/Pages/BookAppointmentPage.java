package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookAppointmentPage {

    public WebDriver driver;
    public By facility = By.id("combo_facility");


    public BookAppointmentPage(WebDriver driver){
        this.driver =driver;

    }

    public void setFacility(){
    driver.findElement(facility).sendKeys("Hongkong CURA Healthcare Center");

    }



}