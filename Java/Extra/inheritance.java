class Animal{
    public void bark(){
        System.out.println("Animal eats");
        }
}
class Dog extends Animal{
    public void bark(){
        System.out.println("Dog barks");
    }
}
public class inheritance {
    public static void main(String[] args) {
        // Parent class
        //Dog d = new Dog();
        //d.bark();
        //d.eat();
        Animal a = new Dog();
        a.bark();
    }
}