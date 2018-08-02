package proj.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class Trip {

    @Id
    @GeneratedValue
    private Long id;
    private String airportFrom;
    private String airportTo;
    private String hotelTo;
    private String cityTo;
    private Date departureDate;
    private Date returnDate;
    private int countOfDays;
    public enum Type {BB,HB,FB,AI};
    private Type type;
    private double priceForAdult;
    private double priceForChild;
    private boolean promotion;
    private int countOfPeople;
    private String description;




}
