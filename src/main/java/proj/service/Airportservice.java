package proj.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import proj.ExchangeRateSeries;
import proj.Rates;
import proj.model.Airport;
import proj.repository.Airportrepository;

import java.sql.SQLOutput;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


@Service
public class Airportservice {

@Autowired
private Airportrepository airportrepository;


    public List<Airport> getAll() {

        return airportrepository.findAll();

    }

    public List<Airport> listAirportsByCityName(String cityname) {





        return airportrepository.getAirportsByCityName(cityname);

    }

    public void save(Airport airport) {

        airportrepository.save(airport);


    }



}
