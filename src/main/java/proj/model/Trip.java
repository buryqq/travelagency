package proj.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Trip {

    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    @JoinColumn(name="airport_from")
    private Airport airportFrom;
    @ManyToOne
    @JoinColumn(name="airport_to")
    private Airport airportTo;
    @ManyToOne
    @JoinColumn(name="hotel_to")
    private Hotel hotelTo;
    @ManyToOne
    @JoinColumn(name="city_to")
    private City cityTo;
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
