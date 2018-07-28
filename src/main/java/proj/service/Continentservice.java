package proj.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proj.model.Continent;
import proj.repository.Continentrepository;

import java.util.List;


@Service
public class Continentservice {

@Autowired
private Continentrepository continentrepository;

    public List<Continent> getAll() {

        return continentrepository.findAll();

    }

    public void save(Continent continent) {

         continentrepository.save(continent);


    }



}
