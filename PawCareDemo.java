import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PawCareDemo {
    public static void main(String[] args) {
        AnimalRegistry registry = new AnimalRegistry();
        List<AdoptionApplication> applications = new ArrayList<>();

        // 1. Register animals
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
            System.out.println();
        }

        // 2. Test Registry search & availability count
        System.out.println("--- Search by Name ('rex') ---");
        for (Animal found : registry.findByName("rex")) {
            found.displayInfo();
        }
        System.out.println("Available animals before adoption: " + registry.countByAvailability(true));

        // 3. Add medical records & check latest record
        System.out.println("\n--- Medical Records ---");
        rex.addMedicalRecord(new MedicalRecord(
                "Rabies", "Routine checkup", "Vaccinated", LocalDate.now().minusDays(10)
        ));
        rex.addMedicalRecord(new MedicalRecord(
                "Deworming", "Follow-up", "Oral tablet", LocalDate.now()
        ));
        mimi.addMedicalRecord(new MedicalRecord(
                "FVRCP", "Mild ear irritation", "Ear drops", LocalDate.now()
        ));

        System.out.println("\nLatest Medical Record for Rex:");
        System.out.println(rex.getLatestMedicalRecord());

        // 4. Test Adopter & AdoptionApplication approval/rejection
        Adopter selam = new Adopter("AD-1", "Selam Kebede", "selam@example.com", "0911000000", "Addis Ababa");
        Adopter dawit = new Adopter("AD-2", "Dawit Bekele", "dawit@example.com", "0922000000", "Adama");

        System.out.println("\n--- Adopter Details ---");
        System.out.println(selam);

        AdoptionApplication app1 = new AdoptionApplication("APP-1", selam, rex);
        AdoptionApplication app2 = new AdoptionApplication("APP-2", dawit, rex);
        applications.add(app1);
        applications.add(app2);

        System.out.println("\n--- Processing Adoption Applications ---");
        app1.approveApplication(); // Succeeds and marks Rex unavailable
        app2.approveApplication(); // Automatically rejected since Rex is already adopted

        System.out.println("\n--- Application Summary ---");
        for (AdoptionApplication app : applications) {
            System.out.println(app);
            System.out.println("--------------------");
        }

        // 5. Final availability count
        System.out.println("Available animals after adoption: " + registry.countByAvailability(true));
        System.out.println("Adopted/unavailable animals: " + registry.countByAvailability(false));
    }
}