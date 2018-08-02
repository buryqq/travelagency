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
import proj.model.Hotel;
import proj.model.HotelResponse;
import proj.service.Countryservice;
import proj.service.Hotelservice;

import java.util.LinkedList;
import java.util.List;


@CrossOrigin(origins = "http://localhost:4200")
@Controller
public class HotelController {

    @Autowired
    private Hotelservice hotelservice;



    @GetMapping("/hotels")
    public ResponseEntity<HotelListResponse> hotelall() {

        List<Hotel> hotelList;

        hotelList=hotelservice.getAll();


List<HotelResponse> hotelListResponse= new LinkedList<>();

        for (Hotel a: hotelList
             ) {

            HotelResponse ar= new HotelResponse(a.getId(),a.getName(),a.getCityid(),a.getStandard(),a.getDescription());
            hotelListResponse.add(ar);




        }



        HotelListResponse hotelListResponseout= HotelListResponse.builder()
                .hotelListResponse(hotelListResponse)
                .build();

        return ResponseEntity.ok(hotelListResponseout);
    }

    @Getter
    @Builder
    private static class HotelListResponse {
        @Singular("hotellist")
        private List<HotelResponse> hotelListResponse;



    }




}