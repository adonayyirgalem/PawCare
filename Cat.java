
public class Cat extends Animal implements Adoptable {

    private boolean indoor;
    private boolean availableForAdoption;

    public Cat(int id, String name, int age,
               String breed, String healthStatus,
               boolean indoor, boolean availableForAdoption) {

        super(id, name, age, breed, healthStatus);

        this.indoor = indoor;
        this.availableForAdoption = availableForAdoption;
    }

    // Getter and setter for indoor
    public boolean isIndoor() {
        return indoor;
    }

    public void setIndoor(boolean indoor) {
        this.indoor = indoor;
    }

    // Overriding abstract methods
    @Override
    public void makeSound() {
        System.out.println("Cat meows: Meow! Meow!");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating cat food.");
    }

    // Implementing Adoptable interface
    @Override
    public boolean isAvailableForAdoption() {
        return availableForAdoption;
    }

    @Override
    public void setAvailableForAdoption(boolean available) {
        availableForAdoption = available;
    }

    @Override
    public void displayAdoptionStatus() {
        System.out.println(
            isAvailableForAdoption()
            ? "Available for adoption"
            : "Not available for adoption"
        );
    }
}
