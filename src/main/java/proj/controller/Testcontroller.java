package proj.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import proj.model.Testmodel;
import org.springframework.ui.Model;
import proj.service.Testservice;

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