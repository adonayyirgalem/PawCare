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

    public void approveApplication() {
        if (this.status != Status.PENDING) {
            System.out.println("Application " + applicationId + " is already " + status + ".");
            return;
        }

        if (animal instanceof Adoptable) {
            Adoptable adoptableAnimal = (Adoptable) animal;
            if (!adoptableAnimal.isAvailableForAdoption()) {
                this.status = Status.REJECTED;
                System.out.println("Application " + applicationId + " rejected: " +
                                   animal.getName() + " is not available for adoption.");
                return;
            }
            adoptableAnimal.setAvailableForAdoption(false);
            this.status = Status.APPROVED;
            System.out.println("Application " + applicationId + " approved successfully.");
        } else {
            System.out.println("Animal does not implement Adoptable interface.");
        }
    }

    public void rejectApplication() {
        if (this.status != Status.PENDING) {
            System.out.println("Application " + applicationId + " is already " + status + ".");
            return;
        }
        this.status = Status.REJECTED;
        System.out.println("Application " + applicationId + " rejected successfully.");
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