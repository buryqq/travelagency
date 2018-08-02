package proj.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Data
public class CountryResponse {



   private Long id;
   private String name;
   private Long continentid;


    public CountryResponse(Long id, String name, Long continentid) {
        this.id = id;
        this.name = name;
        this.continentid = continentid;
    }
}
