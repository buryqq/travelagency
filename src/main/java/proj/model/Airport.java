package proj.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Airport {

    @Id
    @GeneratedValue
   private Long id;
   private String name;

   @ManyToOne
   @JoinColumn(name="cityid")
   private City cityid;




}
