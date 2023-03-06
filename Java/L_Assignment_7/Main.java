import java.util.*;
abstract class Doggo {
    abstract int avgBreedWeight();
}
class Dog {
    protected String name;

    // ------------------------------------------------------------
    // Constructor -- store name
    // ------------------------------------------------------------
    public Dog(String name) {
        this.name = name;
    }

    // ------------------------------------------------------------
    // Returns the dog's name
    // ------------------------------------------------------------
    public String getName() {
        return name;
    }

    // ------------------------------------------------------------
    // Returns a string with the dog's comments
    // ------------------------------------------------------------
    public String speak() {
        return "Woof";
    }
}

class Labrador extends Dog {
    private String color; // black, yellow, or chocolate?
    private int breedWeight = 75;

    public Labrador(String name, String color) {
        super(name);
        this.color = color;
    }

    // ------------------------------------------------------------
    // Big bark -- overrides speak method in Dog
    // ------------------------------------------------------------
    public String speak() {
        return "WOOF";
    }

    // ------------------------------------------------------------
    // Returns weight
    // ------------------------------------------------------------
    public int avgBreedWeight() {
        return breedWeight;
    }
}

class Yorkshire extends Dog {
    public Yorkshire(String name) {
        super(name);
    }

    // ------------------------------------------------------------
    // Small bark -- overrides speak method in Dog
    // ------------------------------------------------------------
    public String speak() {
        return "woof";
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dog dog = new Dog("Spike");
        System.out.println("Enter the colour of the fur: ");
        String colour = sc.nextLine();
        System.out.println(dog.getName() + " says " + dog.speak());
        Labrador lab = new Labrador("Goodboi", colour);
        System.out.println(lab.getName() + " says " + lab.speak());
        Yorkshire york = new Yorkshire("Goodboi2");
        System.out.println(york.getName() + " says " + york.speak());
        
    }
}