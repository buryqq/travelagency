package proj.controller;

import lombok.Builder;
import lombok.Getter;
import lombok.Singular;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import proj.model.Country;
import proj.model.CountryResponse;
import proj.service.Countryservice;


import java.util.LinkedList;
import java.util.List;


@CrossOrigin(origins = "http://localhost:4200")
@Controller
public class CountryController {

    @Autowired
    private Countryservice countryservice;



    @GetMapping("/countries")
    public ResponseEntity<CountryListResponse> countryall() {

        List<Country> countryList;

        countryList=countryservice.getAll();


List<CountryResponse> countryListResponse= new LinkedList<>();

        for (Country a: countryList
             ) {

            CountryResponse ar= new CountryResponse(a.getId(),a.getName(),a.getContinentid());
            countryListResponse.add(ar);




        }



        CountryListResponse countryListResponseout= CountryListResponse.builder()
                .countryListResponse(countryListResponse)
                .build();

        return ResponseEntity.ok(countryListResponseout);
    }

    @Getter
    @Builder
    private static class CountryListResponse {
        @Singular("countrylist")
        private List<CountryResponse> countryListResponse;



    }




}