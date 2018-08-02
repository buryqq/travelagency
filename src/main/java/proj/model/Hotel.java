package proj.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Data
@Entity
public class Hotel {

    @Id
    @GeneratedValue
   private Long id;
   private String name;
   private Long cityid;
    private String standard;
    private String description;


}
