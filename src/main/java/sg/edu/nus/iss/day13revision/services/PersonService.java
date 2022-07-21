package sg.edu.nus.iss.day13revision.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import sg.edu.nus.iss.day13revision.models.Person;

@Service
public class PersonService {
    //we are saving the info in an Array List of Person
    private List<Person> persons = new ArrayList<>();
    
    public PersonService() {
        //adding names to the list
        persons.add(new Person("John", "Wall"));
        persons.add(new Person("Kobe", "Bryant"));
    }

    //function to get the list of persons. So we return person(the name of the list)
    public List<Person> getPersons() {
        return this.persons;
    }

    //we don't need to see anything so public void
    public void addPerson(Person p) {
        persons.add(new Person(p.getFirstName(), p.getLastName()));
    }
}
