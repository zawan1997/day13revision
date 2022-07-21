package sg.edu.nus.iss.day13revision.models;

//person is the object. Form is what we will use when we submit the form
//form will hold more data
//create because sometimes the form is huge so different section will go into different places 
//form object will handle all that comes in from the form
public class PersonForm {

    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
}
