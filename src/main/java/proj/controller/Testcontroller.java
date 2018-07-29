package proj.controller;
import lombok.Builder;
import lombok.Getter;
import lombok.Singular;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import proj.ExchangeRateSeries;
import proj.Rates;
import proj.model.KursEuro;
import proj.model.Testmodel;
import org.springframework.ui.Model;
import proj.service.Testservice;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@Controller
public class Testcontroller {

    @Autowired
    private Testservice testservice;

    @GetMapping("/")
    public String root(Testmodel testmodel, Model model) {
        model.addAttribute("testModel", testmodel);
        model.addAttribute("entities", testservice.getAll().size());
        model.addAttribute("lista", testservice.getAll());
        return "index";
    }




        @GetMapping("/cenaeuro")
        @ResponseBody
        public ResponseEntity<ListaKursowResponse> cenaeuro() {

            RestTemplate restTemplate = new RestTemplate();
            ExchangeRateSeries test = restTemplate.getForObject("http://api.nbp.pl/api/exchangerates/rates/A/EUR", ExchangeRateSeries.class, 200);
            Rates[] listarates =test.getRates();
            KursEuro kursEuro = new KursEuro(Double.parseDouble(listarates[0].getMid()));



            ListaKursowResponse listaKursowResponse = ListaKursowResponse.builder()
                    .kursy(kursEuro)
                    .build();

            return ResponseEntity.ok(listaKursowResponse);
        }


        @Getter
        @Builder
        private static class ListaKursowResponse {
        @Singular("kursy")
        private List<KursEuro> kursy;
        }


    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String saveOrUpdateUser(@ModelAttribute("add")  Testmodel testmodel,
                                   BindingResult result, Model model ) {
        testservice.save(testmodel);
            return "redirect:/" ;
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String showAddUserForm(Model model, Testmodel testmodel) {
     model.addAttribute("Testmodel",testmodel);
        return "add";
    }

}