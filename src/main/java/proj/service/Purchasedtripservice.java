package proj.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proj.model.PurchasedTrip;
import proj.repository.Purchasedtriprepository;

import java.util.List;


@Service
public class Purchasedtripservice {

@Autowired
private Purchasedtriprepository purchasedtriprepository;

    public List<PurchasedTrip> getAll() {

        return purchasedtriprepository.findAll();

    }

    public void save(PurchasedTrip purchasedTrip) {

         purchasedtriprepository.save(purchasedTrip);


    }



}
