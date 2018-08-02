package proj.controller;

import lombok.Builder;
import lombok.Getter;
import lombok.Singular;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import proj.model.PurchasedTrip;
import proj.model.PurchasedTripResponse;
import proj.service.Purchasedtripservice;

import java.util.LinkedList;
import java.util.List;


@CrossOrigin(origins = "http://localhost:4200")
@Controller
public class PurchasedTripController {

    @Autowired
    private Purchasedtripservice purchasedtripservice;



    @GetMapping("/purchasedtrips")
    public ResponseEntity<PurchasedTripListResponse> countryall() {

        List<PurchasedTrip> purchasedTripList;

        purchasedTripList=purchasedtripservice.getAll();


List<PurchasedTripResponse> purchasedTripListResponse= new LinkedList<>();

        for (PurchasedTrip a: purchasedTripList
             ) {

            PurchasedTripResponse ar= new PurchasedTripResponse(a.getId(),a.getTripid(),a.getAmount(),a.getOwner());
            purchasedTripListResponse.add(ar);




        }



        PurchasedTripListResponse purchasedTripListResponseout= PurchasedTripListResponse.builder()
                .purchasedTripListResponse(purchasedTripListResponse)
                .build();

        return ResponseEntity.ok(purchasedTripListResponseout);
    }

    @Getter
    @Builder
    private static class PurchasedTripListResponse {
        @Singular("purchasedtriplist")
        private List<PurchasedTripResponse> purchasedTripListResponse;



    }




}