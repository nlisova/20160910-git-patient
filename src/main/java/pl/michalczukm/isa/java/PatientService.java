package pl.michalczukm.isa.java;

        import java.util.ArrayList;
        import java.util.List;

public class PatientService {
    private final List<Patient> patients;

    public PatientService() {
        patients = new ArrayList<>();

        patients.add(new Patient("Andrzej", "Kowalski"));
        patients.add(new Patient("Pawel", "Nowak"));
        patients.add(new Patient("Piotr", "Szulc"));
        patients.add(new Patient("Anna", "Nowak"));
        patients.add(new Patient("Anna", "kanikowska"));
    }

    public List<Patient> getAll() {
        return patients;
    }

    public void Add(Patient patient) {
        patients.add(patient);
    }


}
