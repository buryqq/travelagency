package proj.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Testmodel {

    @Id
    @GeneratedValue
    Long id;
    int testint;
    String teststring;




}
