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
import proj.model.Airport;
import proj.service.Airportservice;
import proj.service.Cityservice;


import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@Controller
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
        listalotnisk=airportservice.listAirportsByCityName(cityname);
        ListaLotniskResponse listaLotniskResponse = ListaLotniskResponse.builder()
                .listalotnisk(listalotnisk)
                .build();

        return ResponseEntity.ok(listaLotniskResponse);
    }

    @Getter
    @Builder
    private static class ListaLotniskResponse {
        @Singular("listalotnisk")
        private List<Airport> listalotnisk;
    }




    @RequestMapping(value = "/airportadd", method = RequestMethod.POST)
    public String saveAirport(@ModelAttribute("airportadd")  Airport airport,
                                   BindingResult result, Model model ) {
        airportservice.save(airport);
            return "redirect:/airports" ;
    }

    @RequestMapping(value = "/airportadd", method = RequestMethod.GET)
    public String showAddAirport(Model model, Airport airport) {
     model.addAttribute("airportModel",airport);
        model.addAttribute("cityList", cityservice.getAll());
        return "airportAdd";
    }

}