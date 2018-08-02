package proj.controller;

import lombok.Builder;
import lombok.Getter;
import lombok.Singular;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import proj.model.Continent;
import proj.model.ContinentResponse;
import proj.service.Continentservice;


import java.util.LinkedList;
import java.util.List;


@CrossOrigin(origins = "http://localhost:4200")
@Controller
public class Continentcontroler {

    @Autowired
    private Continentservice continentservice;



    @GetMapping("/continents")
    public ResponseEntity<ContinentListResponse> continentall() {

        List<Continent> continentList;

        continentList=continentservice.getAll();


List<ContinentResponse> continentListResponse= new LinkedList<>();

        for (Continent a: continentList
             ) {

            ContinentResponse ar = new ContinentResponse(a.getId(),a.getName());
            continentListResponse.add(ar);




        }



        ContinentListResponse continentListResponseout = ContinentListResponse.builder()
                .continentListResponse(continentListResponse)
                .build();

        return ResponseEntity.ok(continentListResponseout);
    }

    @Getter
    @Builder
    private static class ContinentListResponse {
        @Singular("continentlist")
        private List<ContinentResponse> continentListResponse;



    }




}