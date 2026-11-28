
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnimalRegistry {
    // HashMap gives O(1) lookup by animal ID; ArrayList preserves registration order for display
    private final Map<Integer, Animal> animalById = new HashMap<>();
    private final List<Animal> animalList = new ArrayList<>();

    public boolean registerAnimal(Animal animal) {
        if (animal == null || animalById.containsKey(animal.getId())) {
            return false;
        }
        animalById.put(animal.getId(), animal);
        animalList.add(animal);
        return true;
    }

    public Animal findById(int id) {
        return animalById.get(id);
    }

    public List<Animal> getAllAnimals() {
        return new ArrayList<>(animalList);
    }

    public boolean removeById(int id) {
        Animal removed = animalById.remove(id);
        if (removed == null) {
            return false;
        }
        return animalList.remove(removed);
    }

    public List<Animal> findByName(String name) {
        List<Animal> matchingAnimals = new ArrayList<>();

        for (Animal animal : animalList) {
            if (animal.getName().equalsIgnoreCase(name)) {
                matchingAnimals.add(animal);
            }
        }

        return matchingAnimals;
    }

    public int countByAvailability(boolean available) {
        int count = 0;

        for (Animal animal : animalList) {
            if (animal instanceof Adoptable) {
                Adoptable adoptableAnimal = (Adoptable) animal;

                if (adoptableAnimal.isAvailableForAdoption() == available) {
                    count++;
                }
            }
        }

        return count;
    }
    
}
