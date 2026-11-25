public class AnimalRegistry {
    private String id;
    private String name;
    private String species;
    private String breed;
    private int age;
    private String gender;
    private String rescueLocation;
    private String healthStatus;

    public AnimalRegistry(String id, String name, String species,
                            String breed, int age, String gender,
                            String rescueLocation, String healthStatus) {
        this.id = id;
        this.name = name;
        this.species = species;
        this.breed = breed;
        this.age = age;
        this.gender = gender;
        this.rescueLocation = rescueLocation;
        this.healthStatus = healthStatus;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getRescueLocation() {
        return rescueLocation;
    }

    public String getHealthStatus() {
        return healthStatus;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setRescueLocation(String rescueLocation) {
        this.rescueLocation = rescueLocation;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }
}
