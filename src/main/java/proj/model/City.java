package proj.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class City {

    @Id
    @GeneratedValue
   private Long id;
   private String name;


   @OneToMany(mappedBy = "cityid")
   private List<Airport> airports;

    @ManyToOne
    private Country countryid;

    public String getName() {
        return name;
    }

}
