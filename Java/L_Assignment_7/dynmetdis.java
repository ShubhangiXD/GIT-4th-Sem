public class dynmetdis {
    public static void main(String[] args) {
        Cat obj = new Cat();
        obj.sound();
    }
}
class Animal {
    public void sound(){
        System.out.println("Animal is making a sound");
    }
}

class Dog extends Animal {
    public void sound(){
        System.out.println("Dog is barking");
    }
}

class Cat extends Dog {
    public void sound(){
        System.out.println("Cat is meowing");
    }
}