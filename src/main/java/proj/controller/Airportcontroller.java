package proj.controller;

import lombok.Builder;
import lombok.Getter;
import lombok.Singular;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import proj.model.Airport;
import proj.model.AirportResponse;
import proj.model.City;
import proj.service.Airportservice;
import proj.service.Cityservice;


import java.util.LinkedList;
import java.util.List;

@Slf4j
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class Airportcontroller {

    @Autowired
    private Airportservice airportservice;
    @Autowired
    private Cityservice cityservice;


//
//    @GetMapping("/airports")
//    public String airportall(@RequestParam(value = "cityname", required = false) String cityname,Airport airport, Model model) {
//        model.addAttribute("airportModel", airport);
//        model.addAttribute("airportEntities", airportservice.getAll().size());
//        model.addAttribute("airportList", airportservice.getAll());
//        model.addAttribute("search", airportservice.listAirportsByCityName(cityname));
//        return "airportIndex";
//    }


    @GetMapping("/airports")
    public ResponseEntity<ListaLotniskResponse> airportall(@RequestParam(value = "cityname", required = false) String cityname) {

        List<Airport> listalotnisk;
        List<Airport> listalotniskall;

        listalotnisk=airportservice.listAirportsByCityName(cityname);
        listalotniskall=airportservice.getAll();

List<AirportResponse> airportListResponse= new LinkedList<>();

        for (Airport a: listalotnisk
             ) {

            AirportResponse ar = new AirportResponse(a.getId(),a.getName(),a.getCityid().getId(),a.getCityid().getName());
            airportListResponse.add(ar);




        }

        List<AirportResponse> airportListResponse2= new LinkedList<>();

        for (Airport a: listalotniskall
                ) {

            AirportResponse ar = new AirportResponse(a.getId(),a.getName(),a.getCityid().getId(),a.getCityid().getName());
            airportListResponse2.add(ar);




        }


        ListaLotniskResponse listaLotniskResponse = ListaLotniskResponse.builder()
                .airportListResponse(airportListResponse).airportListResponse2(airportListResponse2)
                .build();

        return ResponseEntity.ok(listaLotniskResponse);
    }

    @Getter
    @Builder
    private static class ListaLotniskResponse {
        @Singular("listalotnisk")
        private List<AirportResponse> airportListResponse;
        @Singular("listalotnisk2")
        private List<AirportResponse> airportListResponse2;


    }






//    @RequestMapping(value = "/airportadd", method = RequestMethod.POST)
//    public String saveAirport(@ModelAttribute("airportadd")  Airport airport,
//                                   BindingResult result, Model model ) {
//        airportservice.save(airport);
//            return "redirect:/airports" ;
//    }

    @RequestMapping(value = "/airportadd", method = RequestMethod.POST)
    public void saveAirport( @RequestBody AirportResponse airport ) {


        log.info(airport.toString());

Airport a = new Airport();



City city = cityservice.getcitybyid(airport.getCityid());


a.setCityid(city);
a.setName(airport.getName());

        airportservice.save(a);

    }




//    @RequestMapping(value = "/airportadd", method = RequestMethod.GET)
//    public String showAddAirport(Model model, Airport airport) {
//     model.addAttribute("airportModel",airport);
//        model.addAttribute("cityList", cityservice.getAll());
//        return "airportAdd";
//    }

}