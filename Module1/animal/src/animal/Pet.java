package animal;

public abstract class Pet extends Animal {

    // Domestic animals should have their names
    protected String name;

    // Name must be assigned in the constructor
    public Pet(String name) {
        this.name = name;
    }

    // Name should be retrievable from anywhere
    public String getName() {
        return name;
    }
}