package proj.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proj.model.City;
import proj.repository.Cityrepository;

import java.util.List;


@Service
public class Cityservice {

@Autowired
private Cityrepository cityrepository;

    public List<City> getAll() {

        return cityrepository.findAll();

    }


    public City getcitybyid(Long id) {

        return cityrepository.findOne(id);

    }

    public void save(City city) {

         cityrepository.save(city);


    }



}
