
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

    
    public void approveApplication(AdoptionApplication app) {

        if (app == null ||
            app.getStatus() != Status.PENDING) {
            return;
        }

        if (app.getAnimal() instanceof Adoptable) {

            Adoptable adoptableAnimal =
                    (Adoptable) app.getAnimal();

            adoptableAnimal.setAvailableForAdoption(false);

            app.setStatus(Status.APPROVED);

            System.out.println("Application approved successfully.");

        } else {
            System.out.println(
                "Animal does not implement Adoptable interface."
            );
        }
    }

    
    public void rejectApplication(AdoptionApplication app) {

        if (app == null ||
            app.getStatus() != Status.PENDING) {
            return;
        }

        app.setStatus(Status.REJECTED);

        System.out.println("Application rejected successfully.");
    }

    
    @Override
    public String toString() {
        return "Application ID: " + applicationId +
               "\nAdopter: " + adopter.getName() +
               "\nAnimal: " + animal.getName() +
               "\nApplication Date: " + applicationDate +
               "\nStatus: " + status;
    }
}
