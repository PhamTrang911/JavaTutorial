package animal;

public class Main {

    public static void main(String[] args) {

        // Generally all animals
        Animal[] animals = {
            new Cat("TunTun"),
            new Dog("Leon"),
            new Lion(),
            new Wolf(),
            new Cat("MiMi"),};

        for (Animal animal : animals) {
            animal.makeSound();
        }

        // Pet ones
        Pet[] pets = {
            (Pet) animals[0],
            (Pet) animals[1],
            (Pet) animals[4],};

        for (Pet pet : pets) {
            System.out.print(
                    String.format("\nPet with name: %s and sound...", pet.getName())
            );
            pet.makeSound();
        }
    }
}
