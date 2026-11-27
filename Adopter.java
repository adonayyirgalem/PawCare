
public class Adopter {
    private String adopterId;
    private String name;
    private String email;
    private String phoneNumber;
    private String address;

    public Adopter(String adopterId, String name,
                   String email, String phoneNumber,
                   String address) {
        this.adopterId = adopterId;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    // Getters
    public String getAdopterId() {
        return adopterId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Display adopter information
    @Override
    public String toString() {
        return "Adopter ID: " + adopterId +
               "\nName: " + name +
               "\nEmail: " + email +
               "\nPhone: " + phoneNumber +
               "\nAddress: " + address;
    }
}
