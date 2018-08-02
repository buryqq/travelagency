package proj.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data

public class PurchasedTripResponse {

   private Long id;
   private Long tripid;
   private Long amount;
   private String owner;


    public PurchasedTripResponse(Long id, Long tripid, Long amount, String owner) {
        this.id = id;
        this.tripid = tripid;
        this.amount = amount;
        this.owner = owner;
    }
}
