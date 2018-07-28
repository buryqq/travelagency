package proj.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proj.model.Hotel;
import proj.repository.Hotelrepository;

import java.util.List;


@Service
public class Hotelservice {

@Autowired
private Hotelrepository hotelrepository;

    public List<Hotel> getAll() {

        return hotelrepository.findAll();

    }

    public void save(Hotel hotel) {

         hotelrepository.save(hotel);


    }



}
