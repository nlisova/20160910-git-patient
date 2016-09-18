package pl.michalczukm.isa.java;

/**
 * Created by nlisova on 18.09.16.
 */
public class Visit {

    private PatientModel patientModel;
    private Doctor doc;

    public Visit(PatientModel patientModel, Doctor doc) {
        this.patientModel = patientModel;
        this.doc = doc;
    }
}
