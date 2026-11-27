import java.util.ArrayList;

public abstract class Animal {
    private int id;
    private String name;
    private int age;
    private String breed;
    private String healthStatus;
    private ArrayList<MedicalRecord> medicalRecords;

    public Animal(int id, String name, int age, String breed, String healthStatus) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.healthStatus = healthStatus;
        this.medicalRecords = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public String getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    public void addMedicalRecord(MedicalRecord record) {
        medicalRecords.add(record);
        System.out.println("Medical record added successfully!");
    }

    public ArrayList<MedicalRecord> getMedicalRecords() {
        return medicalRecords;
    }

    public void viewMedicalHistory() {
        System.out.println("Medical History of " + name + " (ID: " + id + ")");
        if (medicalRecords.isEmpty()) {
            System.out.println("No medical records available.");
        } else {
            for (MedicalRecord record : medicalRecords) {
                System.out.println("--------------------");
                System.out.println(record);
            }
        }
    }

    public void displayInfo() {
        System.out.println("ID: " + id + " | Name: " + name + " | Age: " + age +
                           " | Breed: " + breed + " | Health: " + healthStatus);
    }

    public abstract void makeSound();

    public abstract void eat();
}
