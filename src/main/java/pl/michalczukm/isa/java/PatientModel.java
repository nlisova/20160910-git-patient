package pl.michalczukm.isa.java;

public class PatientModel {
    private final String firstName;
    private final String lastName;
    private int age;


    public PatientModel(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
