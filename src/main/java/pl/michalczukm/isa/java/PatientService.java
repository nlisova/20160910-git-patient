package pl.michalczukm.isa.java;

        import java.util.ArrayList;
        import java.util.List;

public class PatientService {
    private final List<PatientModel> patientModels;

    public PatientService() {
        patientModels = new ArrayList<>();

        patientModels.add(new PatientModel("Andrzej", "Kowalski"));
        patientModels.add(new PatientModel("Pawel", "Nowak"));
        patientModels.add(new PatientModel("Piotr", "Szulc"));
        patientModels.add(new PatientModel("Anna", "Nowak"));
        patientModels.add(new PatientModel("Anna", "kanikowska"));
    }

    public List<PatientModel> getAll() {
        return patientModels;
    }

    public void Add(PatientModel patientModel) {
        patientModels.add(patientModel);
    }


}
