
import java.time.LocalDate;

public class AdoptionApplication {

    public enum Status {
        PENDING, APPROVED, REJECTED
    }

    private String applicationId;
    private Adopter adopter;
    private Animal animal;
    private LocalDate applicationDate;
    private Status status;

    public AdoptionApplication(String applicationId,
                               Adopter adopter,
                               Animal animal) {
        this.applicationId = applicationId;
        this.adopter = adopter;
        this.animal = animal;
        this.applicationDate = LocalDate.now();
        this.status = Status.PENDING;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public Adopter getAdopter() {
        return adopter;
    }

    public Animal getAnimal() {
        return animal;
    }

    public LocalDate getApplicationDate() {
        return applicationDate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
