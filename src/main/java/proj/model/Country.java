package proj.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Country {

    @Id
    @GeneratedValue
   private Long id;
   private String name;
   private Long continentid;

    public Long getContinentid() {
        return continentid;
    }

    public void setContinentid(Long continentid) {
        this.continentid = continentid;
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

    public Country(Long id, String name, Long continentid) {
        this.id = id;
        this.name = name;
        this.continentid = continentid;
    }

    public Country() {
    }

}
