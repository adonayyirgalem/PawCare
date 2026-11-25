public class PawCareDemo {
    import java.util.*;

public class PawCareDemo {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        Map<String, List<String>> medicalRecords = new HashMap<>();
        List<String> adoptions = new ArrayList<>();

        // 1. Create sample animals
        Animal rex = new Animal("A1", "Rex", "Dog", true);
        Animal mimi = new Animal("A2", "Mimi", "Cat", true);
        animals.add(rex);
        animals.add(mimi);

        System.out.println("--- Animals ---");
        for (Animal a : animals) {
            System.out.println(a);
        }

        // 2. Add medical records
        medicalRecords.put("A1", new ArrayList<>(List.of("Rabies vaccine - Healthy")));
        medicalRecords.put("A2", new ArrayList<>(List.of("Ear checkup - Treated")));

        System.out.println("\n--- Medical Records ---");
        for (String id : medicalRecords.keySet()) {
            System.out.println(id + ": " + medicalRecords.get(id));
        }

        // 3. Process adoption application
        String applicant = "Selam";
        if (rex.available) {
            rex.available = false;
            adoptions.add("Approved: " + applicant + " adopted " + rex.name);
        } else {
            adoptions.add("Rejected: " + rex.name + " not available");
        }

        System.out.println("\n--- Adoption Results ---");
        for (String result : adoptions) {
            System.out.println(result);
        }

        System.out.println("\n--- Updated Animals ---");
        for (Animal a : animals) {
            System.out.println(a);
        }
    }

    static class Animal {
        String id, name, type;
        boolean available;

        Animal(String id, String name, String type, boolean available) {
            this.id = id;
            this.name = name;
            this.type = type;
            this.available = available;
        }

        public String toString() {
            return id + " | " + name + " (" + type + ") | Available: " + available;
        }
    }
}

