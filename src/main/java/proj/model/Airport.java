package proj.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Airport {

    @Id
    @GeneratedValue
   private Long id;
   private String name;

   private Long cityid;

    public Long getCityid() {
        return cityid;
    }

    public void setCityid(Long cityid) {
        this.cityid = cityid;
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

    public Airport(Long id, String name, Long cityid) {
        this.id = id;
        this.name = name;
        this.cityid = cityid;
    }

    public Airport() {
    }

}
