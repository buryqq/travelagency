package proj.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Hotel {

    @Id
    @GeneratedValue
   private Long id;
   private String name;
   private Long cityid;
    private String standard;
    private String description;

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

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Hotel(Long id, String name, Long cityid, String standard, String description) {
        this.id = id;
        this.name = name;
        this.cityid = cityid;
        this.standard = standard;
        this.description = description;
    }

    public Hotel() {
    }

}
