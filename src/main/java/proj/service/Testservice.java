package proj.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proj.model.Testmodel;
import proj.repository.Testrepository;

import java.util.ArrayList;
import java.util.List;


@Service
public class Testservice {

@Autowired
private Testrepository testrepository;

    public List<Testmodel> getAll() {

        return testrepository.findAll();

    }

    public void save(Testmodel testmodel) {

         testrepository.save(testmodel);


    }



}
