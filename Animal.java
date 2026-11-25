
public abstract class Animal {

    // Private fields for encapsulation
    private int id;
    private String name;
    private int age;
    private String breed;
    private String healthStatus;

    // Constructor
    public Animal(int id, String name, int age,
                  String breed, String healthStatus) {

        this.id = id;
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.healthStatus = healthStatus;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    // Shared method
    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Breed: " + breed);
        System.out.println("Health Status: " + healthStatus);
    }

    // Abstract methods
    public abstract void makeSound();

    public abstract void eat();
}
