package proj.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class City {

    @Id
    @GeneratedValue
   private Long id;
   private String name;
   private Long countryid;

    public Long getCountryid() {
        return countryid;
    }

    public void setCountryid(Long countryid) {
        this.countryid = countryid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City(Long id, String name, Long countryid) {
        this.id = id;
        this.name = name;
        this.countryid = countryid;
    }

    public City() {
    }

}
