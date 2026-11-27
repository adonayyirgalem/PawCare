public class Dog extends Animal implements Adoptable{
    private boolean trained;
    private boolean availableForAdoption;

public Dog(int id, String name, int age,
           String breed, String healthStatus,
           boolean trained, boolean availableForAdoption) {

    super(id, name, age, breed, healthStatus);

    this.trained = trained;
    this.availableForAdoption = availableForAdoption;
}

// Getter and setter for trained
public boolean isTrained() {
    return trained;
}

public void setTrained(boolean trained) {
    this.trained = trained;
}

// Overriding displayInfo to include trained status
@Override
public void displayInfo() {
    super.displayInfo();
    System.out.println("Trained: " + (trained ? "Yes" : "No"));
}

// Overriding abstract methods
@Override
public void makeSound() {
    System.out.println("Dog barks: Woof! Woof!");
}

@Override
public void eat() {
    System.out.println(getName() + " is eating dog food.");
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