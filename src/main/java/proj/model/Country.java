package proj.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@Entity
public class Country {

    @Id
    @GeneratedValue
   private Long id;
   private String name;
   private Long continentid;

    @OneToMany
    private List<City> cities;







}
