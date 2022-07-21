package sg.edu.nus.iss.day13revision.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import sg.edu.nus.iss.day13revision.models.Person;
import sg.edu.nus.iss.day13revision.services.PersonService;

@Controller
//@RequestMapping(path="/person")
public class PersonController {
    //pull functions from services and store data here
    private List<Person> personList = new ArrayList<>();

    @Autowired //when the application starts it will start the Service automatically
    PersonService perSvc = new PersonService();

    //retrieving welcome message in property
    @Value ("${welcome.message}")
    private String message;

    @Value ("${error.message}")
    private String errorMessage;

    //request mapping is an umbrella for all methods. when you write RequestMethod.GET it knows it is a GET method
    
    @GetMapping (path ={"/", "/home", "index"})
    //@RequestMapping(value={"/", "/home", "/index"}, method=RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("message" ,message);
        return "index";
    }

    // @GetMapping (value ="bus")
    // public String bus(Model model){
    //     model.addAttribute("errorMessage", errorMessage);
    //     return "bus";
    // }
    
    //Response is located in the body 
    //testing method only
    @RequestMapping(value="/testRetrieve", method =RequestMethod.GET, produces= "application/json")
    public @ResponseBody List<Person> getAllPersons() {
        personList = perSvc.getPersons();
        return personList;
        
    }

    @RequestMapping(value="/personList", method =RequestMethod.GET)
    public String personList(Model model) {
        personList = perSvc.getPersons();
        model.addAttribute("persons", personList);
        return "personList";
    }
}
