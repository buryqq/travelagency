package proj.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Trip {

    @Id
    @GeneratedValue
   private Long id;
private String airportFrom;
private  String airportTo;
private String hotelTo;
private String cityTo;
private Date departureDate;
private Date returnDate;
private int countOfDays;
private enum type {BB,HB,FB,AI};
private double priceForAdult;
private double priceForChild;
private boolean promotion;
private int countOfPeople;
private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAirportFrom() {
        return airportFrom;
    }

    public void setAirportFrom(String airportFrom) {
        this.airportFrom = airportFrom;
    }

    public String getAirportTo() {
        return airportTo;
    }

    public void setAirportTo(String airportTo) {
        this.airportTo = airportTo;
    }

    public String getHotelTo() {
        return hotelTo;
    }

    public void setHotelTo(String hotelTo) {
        this.hotelTo = hotelTo;
    }

    public String getCityTo() {
        return cityTo;
    }

    public void setCityTo(String cityTo) {
        this.cityTo = cityTo;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public int getCountOfDays() {
        return countOfDays;
    }

    public void setCountOfDays(int countOfDays) {
        this.countOfDays = countOfDays;
    }

    public double getPriceForAdult() {
        return priceForAdult;
    }

    public void setPriceForAdult(double priceForAdult) {
        this.priceForAdult = priceForAdult;
    }

    public double getPriceForChild() {
        return priceForChild;
    }

    public void setPriceForChild(double priceForChild) {
        this.priceForChild = priceForChild;
    }

    public boolean isPromotion() {
        return promotion;
    }

    public void setPromotion(boolean promotion) {
        this.promotion = promotion;
    }

    public int getCountOfPeople() {
        return countOfPeople;
    }

    public void setCountOfPeople(int countOfPeople) {
        this.countOfPeople = countOfPeople;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Trip(Long id, String airportFrom, String airportTo, String hotelTo, String cityTo, Date departureDate, Date returnDate, int countOfDays, double priceForAdult, double priceForChild, boolean promotion, int countOfPeople, String description) {
        this.id = id;
        this.airportFrom = airportFrom;
        this.airportTo = airportTo;
        this.hotelTo = hotelTo;
        this.cityTo = cityTo;
        this.departureDate = departureDate;
        this.returnDate = returnDate;
        this.countOfDays = countOfDays;
        this.priceForAdult = priceForAdult;
        this.priceForChild = priceForChild;
        this.promotion = promotion;
        this.countOfPeople = countOfPeople;
        this.description = description;
    }

    public Trip() {
    }

}
