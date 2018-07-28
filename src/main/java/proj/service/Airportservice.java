package proj.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proj.model.Airport;
import proj.repository.Airportrepository;

import java.util.List;


@Service
public class Airportservice {

@Autowired
private Airportrepository airportrepository;

    public List<Airport> getAll() {

        return airportrepository.findAll();

    }

    public void save(Airport airport) {

        airportrepository.save(airport);


    }



}
