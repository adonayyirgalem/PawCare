
import java.util.ArrayList;

public class Animal {

    private String name;
    private ArrayList<MedicalRecord> medicalRecords;

    public Animal(String name) {
        this.name = name;
        medicalRecords = new ArrayList<>();
    }

    public void addMedicalRecord(MedicalRecord record) {
        medicalRecords.add(record);
        System.out.println("Medical record added successfully!");
    }

    public void viewMedicalHistory() {

        System.out.println("Medical History of " + name);

        if (medicalRecords.isEmpty()) {
            System.out.println("No medical records available.");
        } else {
            for (MedicalRecord record : medicalRecords) {
                System.out.println("--------------------");
                System.out.println(record);
            }
        }
    }

    
    public MedicalRecord getLatestMedicalRecord() {

        if (medicalRecords.isEmpty()) {
            return null;
        }

        return medicalRecords.get(medicalRecords.size() - 1);
    }
}
