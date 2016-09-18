package pl.michalczukm.isa.java;

import java.util.List;


public class App 
{
    public static void main( String[] args ) {

        PatientService patientService = new PatientService();
        List<PatientModel> patientModels = patientService.getAll();

        for (PatientModel patientModel : patientModels) {
            System.out.println("PatientModel");
            System.out.println(String.format("%1$s %2$s", patientModel.getFirstName(), patientModel.getLastName()) + " is sick");
        }
    }
}
