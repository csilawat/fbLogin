package models;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IxiLogo {

    @FindBy(id = "ixiLogoImg")
    private WebElement ixiLogo;

    @FindBy(xpath = "//a[contains(text(),'FLIGHTS')]")
    private WebElement flights;

    @FindBy(id = "//a[contains(text(),'TRAINS')]")
    private WebElement trains;

    @FindBy(id = "//a[contains(text(),'BUSES')]")
    private WebElement buses;

    @FindBy(id = "//a[contains(text(),'HOTELS')]")
    private WebElement hotels;

    public WebElement getIxiLogo() {
        return ixiLogo;
    }

    public void setIxiLogo(WebElement ixiLogo) {
        this.ixiLogo = ixiLogo;
    }

    public WebElement getFlights() {
        return flights;
    }

    public void setFlights(WebElement flights) {
        this.flights = flights;
    }

    public WebElement getTrains() {
        return trains;
    }

    public void setTrains(WebElement trains) {
        this.trains = trains;
    }

    public WebElement getBuses() {
        return buses;
    }

    public void setBuses(WebElement buses) {
        this.buses = buses;
    }

    public WebElement getHotels() {
        return hotels;
    }

    public void setHotels(WebElement hotels) {
        this.hotels = hotels;
    }


}
