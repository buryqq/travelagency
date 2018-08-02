package proj.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data

public class HotelResponse {


   private Long id;
   private String name;
   private Long cityid;
    private String standard;
    private String description;


    public HotelResponse(Long id, String name, Long cityid, String standard, String description) {
        this.id = id;
        this.name = name;
        this.cityid = cityid;
        this.standard = standard;
        this.description = description;
    }
}
