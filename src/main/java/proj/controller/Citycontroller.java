package proj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import proj.model.City;
import proj.service.Cityservice;

@Controller
public class Citycontroller {

    @Autowired
    private Cityservice cityservice;

    @GetMapping("/cities")
    public String cityall(City city, Model model) {
        model.addAttribute("cityModel", city);
        model.addAttribute("cityEntities", cityservice.getAll().size());
        model.addAttribute("cityList", cityservice.getAll());
        return "cityIndex";
    }


    @RequestMapping(value = "/cityadd", method = RequestMethod.POST)
    public String saveCity(@ModelAttribute("cityadd")  City city,
                                   BindingResult result, Model model ) {
        cityservice.save(city);
            return "redirect:/cities" ;
    }

    @RequestMapping(value = "/cityadd", method = RequestMethod.GET)
    public String showAddCity(Model model, City city) {
     model.addAttribute("cityModel",city);
        return "cityAdd";
    }

}