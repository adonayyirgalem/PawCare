import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PawCareDemo {
    public static void main(String[] args) {
        AnimalRegistry registry = new AnimalRegistry();
        List<AdoptionApplication> applications = new ArrayList<>();

        Dog rex = new Dog(101, "Rex", 3, "German Shepherd", "Healthy", true, true);
        Cat mimi = new Cat(102, "Mimi", 2, "Persian", "Healthy", true, true);

        registry.registerAnimal(rex);
        registry.registerAnimal(mimi);

        System.out.println("--- Registered Animals ---");
        for (Animal animal : registry.getAllAnimals()) {
            animal.displayInfo();
            animal.makeSound();
            animal.eat();
            if (animal instanceof Adoptable) {
                ((Adoptable) animal).displayAdoptionStatus();
            }
        }

        rex.addMedicalRecord(new MedicalRecord(
                "Rabies", "Routine checkup", "Vaccinated", LocalDate.now()
        ));
        mimi.addMedicalRecord(new MedicalRecord(
                "FVRCP", "Mild ear irritation", "Ear drops", LocalDate.now()
        ));

        System.out.println("\n--- Medical Histories ---");
        rex.viewMedicalHistory();
        mimi.viewMedicalHistory();

        Adopter selam = new Adopter("AD-1", "Selam Kebede", "selam@example.com", "0911000000", "Addis Ababa");
        AdoptionApplication app = new AdoptionApplication("APP-1", selam, rex);
        applications.add(app);

        if (rex.isAvailableForAdoption()) {
            app.setStatus(AdoptionApplication.Status.APPROVED);
            rex.setAvailableForAdoption(false);
        } else {
            app.setStatus(AdoptionApplication.Status.REJECTED);
        }

        System.out.println("\n--- Adoption Status ---");
        System.out.println("Application " + app.getApplicationId() + " for " +
                           app.getAnimal().getName() + " -> " + app.getStatus());
        rex.displayAdoptionStatus();
    }
}