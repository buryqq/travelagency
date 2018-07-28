package proj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import proj.model.Airport;
import proj.service.Airportservice;
import proj.service.Cityservice;

@Controller
public class Airportcontroller {

    @Autowired
    private Airportservice airportservice;
    @Autowired
    private Cityservice cityservice;

    @GetMapping("/airports")
    public String airportall(Airport airport, Model model) {
        model.addAttribute("airportModel", airport);
        model.addAttribute("airportEntities", airportservice.getAll().size());
        model.addAttribute("airportList", airportservice.getAll());
        return "airportIndex";
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