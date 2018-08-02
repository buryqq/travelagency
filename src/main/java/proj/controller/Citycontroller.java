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
import proj.model.City;
import proj.model.CityResponse;
import proj.service.Cityservice;


import java.util.LinkedList;
import java.util.List;

//@Controller
//public class Citycontroller {
//
//    @Autowired
//    private Cityservice cityservice;
//
//    @GetMapping("/cities")
//    public String cityall(City city, Model model) {
//        model.addAttribute("cityModel", city);
//        model.addAttribute("cityEntities", cityservice.getAll().size());
//        model.addAttribute("cityList", cityservice.getAll());
//        return "cityIndex";
//    }
//
//
//    @RequestMapping(value = "/cityadd", method = RequestMethod.POST)
//    public String saveCity(@ModelAttribute("cityadd")  City city,
//                                   BindingResult result, Model model ) {
//        cityservice.save(city);
//            return "redirect:/cities" ;
//    }
//
//    @RequestMapping(value = "/cityadd", method = RequestMethod.GET)
//    public String showAddCity(Model model, City city) {
//     model.addAttribute("cityModel",city);
//        return "cityAdd";
//    }
//
//}


@CrossOrigin(origins = "http://localhost:4200")
@Controller
public class Citycontroller {

    @Autowired
    private Cityservice cityservice;



    @GetMapping("/cities")
    public ResponseEntity<CityListResponse> cityall() {

        List<City> cityList;

        cityList=cityservice.getAll();


        List<CityResponse> cityListResponse= new LinkedList<>();

        for (City a: cityList
                ) {

            CityResponse ar = new CityResponse(a.getId(),a.getName(),a.getCountryid().getId());
            cityListResponse.add(ar);




        }



        CityListResponse cityListResponseout = CityListResponse.builder()
                .cityListResponse(cityListResponse)
                .build();

        return ResponseEntity.ok(cityListResponseout);
    }

    @Getter
    @Builder
    private static class CityListResponse {
        @Singular("citylist")
        private List<CityResponse> cityListResponse;



    }




}
