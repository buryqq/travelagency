package proj.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Testmodel {

    @Id
    @GeneratedValue
    Long id;
    int testint;
    String teststring;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getTestint() {
        return testint;
    }

    public void setTestint(int testint) {
        this.testint = testint;
    }

    public String getTeststring() {
        return teststring;
    }

    public void setTeststring(String teststring) {
        this.teststring = teststring;
    }

    public Testmodel(Long id, int testint, String teststring) {
        this.id = id;
        this.testint = testint;
        this.teststring = teststring;
    }


    public Testmodel() {

    }


}
