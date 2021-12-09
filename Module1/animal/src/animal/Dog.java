package animal;

public class Dog extends Pet {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Gouu!");
    }
}