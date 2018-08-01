package proj.model;

import lombok.Data;

import javax.persistence.*;


@Data
public class AirportResponse {


   private Long id;
   private String name;
   private Long cityid;
   private String cityname;


    public AirportResponse(Long id, String name, Long cityid, String cityname) {
        this.id = id;
        this.name = name;
        this.cityid = cityid;
        this.cityname = cityname;
    }
}
