package proj.model;

import lombok.Data;

import java.util.Date;



@Data
public class TripResponse {


    private Long id;
    private String airportFrom;
    private String airportTo;
    private String hotelTo;
    private String cityTo;
    private Date departureDate;
    private Date returnDate;
    private int countOfDays;
    private Trip.Type type;
    private double priceForAdult;
    private double priceForChild;
    private boolean promotion;
    private int countOfPeople;
    private String description;


    public TripResponse(Long id, String airportFrom, String airportTo, String hotelTo, String cityTo, Date departureDate, Date returnDate, int countOfDays, Trip.Type type, double priceForAdult, double priceForChild, boolean promotion, int countOfPeople, String description) {
        this.id = id;
        this.airportFrom = airportFrom;
        this.airportTo = airportTo;
        this.hotelTo = hotelTo;
        this.cityTo = cityTo;
        this.departureDate = departureDate;
        this.returnDate = returnDate;
        this.countOfDays = countOfDays;
        this.type = type;
        this.priceForAdult = priceForAdult;
        this.priceForChild = priceForChild;
        this.promotion = promotion;
        this.countOfPeople = countOfPeople;
        this.description = description;
    }
}