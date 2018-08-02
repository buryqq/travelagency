package proj.model;

import lombok.Data;



@Data
public class CityResponse {


   private Long id;
   private String name;
  private Long countryid;


    public CityResponse(Long id, String name, Long countryid) {
        this.id = id;
        this.name = name;
        this.countryid = countryid;
    }
}
