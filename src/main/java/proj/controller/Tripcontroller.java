package proj.controller;

import lombok.Builder;
import lombok.Getter;
import lombok.Singular;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import proj.model.Trip;
import proj.model.TripResponse;
import proj.service.Tripservice;


import java.util.LinkedList;
import java.util.List;


@CrossOrigin(origins = "http://localhost:4200")
@Controller
public class Tripcontroller {

    @Autowired
    private Tripservice tripservice;





    @GetMapping("/trips")
    public ResponseEntity<TripListResponse> tripall() {

        List<Trip> triplist;

        triplist=tripservice.getAll();


List<TripResponse> tripListResponse= new LinkedList<>();

        for (Trip a: triplist
             ) {

            TripResponse ar = new TripResponse(a.getId(),a.getAirportFrom(),a.getAirportTo(),a.getHotelTo(),a.getCityTo(),a.getDepartureDate(),a.getReturnDate(),a.getCountOfDays(),a.getType(),a.getPriceForAdult(),a.getPriceForChild(),a.isPromotion(),a.getCountOfPeople(),a.getDescription());
            tripListResponse.add(ar);




        }



        TripListResponse tripListResponseout = TripListResponse.builder()
                .tripListResponse(tripListResponse)
                .build();

        return ResponseEntity.ok(tripListResponseout);
    }

    @Getter
    @Builder
    private static class TripListResponse {
        @Singular("triplist")
        private List<TripResponse> tripListResponse;



    }




}