package proj.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

@JsonIgnore
   @OneToMany(mappedBy = "cityid")
   private List<Airport> airports;

    @ManyToOne
    private Country countryid;

    public String getName() {
        return name;
    }

}
