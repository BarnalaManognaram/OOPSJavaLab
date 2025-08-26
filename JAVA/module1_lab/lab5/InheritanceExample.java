class Animal {
    void walk() {
        System.out.println("Animal can walk");
    }
}

// Derived class
class Bird extends Animal {
    void fly() {
        System.out.println("Bird can fly");
    }
}

// Main class to test
public class InheritanceExample {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.walk(); // Inherited from Animal
        bird.fly();  // Defined in Bird
    }
}
