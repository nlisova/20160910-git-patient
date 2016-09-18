package pl.michalczukm.isa.java;

        import java.util.ArrayList;
        import java.util.List;

public class PatientService {
    private final List<PatientModel> patientModels;

    public PatientService() {
        patientModels = new ArrayList<>();

        patientModels.add(new PatientModel("Andrzej", "Kowalski",15));
        patientModels.add(new PatientModel("Pawel", "Nowak",11));
        patientModels.add(new PatientModel("Piotr", "Szulc",15));
        patientModels.add(new PatientModel("Piotr", "Szulc",15));
        patientModels.add(new PatientModel("Piotr", "Szulc",15));
        patientModels.add(new PatientModel("Piotr", "Szulc",15));
        patientModels.add(new PatientModel("Anna", "Nowak",78));
        patientModels.add(new PatientModel("Anna", "kanikowska",14));
        patientModels.add(new PatientModel("Anna", "kanikowska",14));
        patientModels.add(new PatientModel("Anna", "kanikowska",14));
        patientModels.add(new PatientModel("Anna", "kanikowska",14));
    }

    public List<PatientModel> getAll() {
        return patientModels;
    }

    public void Add(PatientModel patientModel) {
        patientModels.add(patientModel);
    }


}
