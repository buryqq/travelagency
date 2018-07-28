package proj.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proj.model.Trip;
import proj.repository.Triprepository;

import java.util.List;


@Service
public class Tripservice {

@Autowired
private Triprepository triprepository;

    public List<Trip> getAll() {

        return triprepository.findAll();

    }

    public void save(Trip trip) {

         triprepository.save(trip);


    }



}
