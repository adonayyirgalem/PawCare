
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


    }

