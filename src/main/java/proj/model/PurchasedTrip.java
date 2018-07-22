package proj.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PurchasedTrip {

    @Id
    @GeneratedValue
   private Long id;
   private Long tripid;
   private Long amount;
   private String owner;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTripid() {
        return tripid;
    }

    public void setTripid(Long tripid) {
        this.tripid = tripid;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public PurchasedTrip(Long id, Long tripid, Long amount, String owner) {
        this.id = id;
        this.tripid = tripid;
        this.amount = amount;
        this.owner = owner;
    }

    public PurchasedTrip() {
    }

}
