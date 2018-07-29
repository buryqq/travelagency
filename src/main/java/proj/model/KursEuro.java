package proj.model;

import lombok.Data;

@Data
public class KursEuro {

    private double kurs;


    public KursEuro(double kurs) {
        this.kurs = kurs;
    }
}
