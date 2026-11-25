public class Main {

    public static void main(String[] args) {

        Animal dog = new Dog(
            1, "Buddy", 3, "German Shepherd",
            "Healthy", true, true
        );

        Animal cat = new Cat(
            2, "Whiskers", 2, "Persian",
            "Healthy", true, false
        );

        // Polymorphism
        Animal[] animals = {dog, cat};

        for (Animal animal : animals) {

            System.out.println("\n----------------");

            animal.displayInfo();
            animal.makeSound();
            animal.eat();

            // Interface behavior
            if (animal instanceof Adoptable) {
                Adoptable adoptable = (Adoptable) animal;
                adoptable.displayAdoptionStatus();
            }
        }
    }
}
