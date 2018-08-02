package proj.model;

import lombok.Data;

import javax.persistence.Entity;


@Data
public class ContinentResponse {



   private Long id;
   private String name;

    public ContinentResponse(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
