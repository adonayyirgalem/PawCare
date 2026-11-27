
import java.time.LocalDate;

public class MedicalRecord {

    private String vaccination;
    private String diagnosis;
    private String treatment;
    private LocalDate appointmentDate;

    public MedicalRecord(String vaccination, String diagnosis,
                         String treatment, LocalDate appointmentDate) {

      
        if (vaccination == null || vaccination.isBlank()) {
            throw new IllegalArgumentException("Vaccination cannot be blank.");
        }

        if (diagnosis == null || diagnosis.isBlank()) {
            throw new IllegalArgumentException("Diagnosis cannot be blank.");
        }

        if (treatment == null || treatment.isBlank()) {
            throw new IllegalArgumentException("Treatment cannot be blank.");
        }

        if (appointmentDate == null) {
            throw new IllegalArgumentException("Appointment date cannot be null.");
        }

        this.vaccination = vaccination;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
        this.appointmentDate = appointmentDate;
    }

    public String getVaccination() {
        return vaccination;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public String getTreatment() {
        return treatment;
    }

    public LocalDate getAppointmentDate() {
        return appointmentDate;
    }

    @Override
    public String toString() {
        return "Vaccination: " + vaccination +
               "\nDiagnosis: " + diagnosis +
               "\nTreatment: " + treatment +
               "\nAppointment Date: " + appointmentDate;
    }
}
