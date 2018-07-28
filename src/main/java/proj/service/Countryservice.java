package proj.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proj.model.Country;
import proj.repository.Countryrepository;

import java.util.List;


@Service
public class Countryservice {

@Autowired
private Countryrepository countryrepository;

    public List<Country> getAll() {

        return countryrepository.findAll();

    }

    public void save(Country country) {

         countryrepository.save(country);


    }



}
