class Arithmetic {
    int add(int a, int b) {
        return a + b;
    }
}

// Subclass
class Adder extends Arithmetic {
    // Inherits the add method
}

// Main class
class Main {
    public static void main(String[] args) {
        Adder myAdder = new Adder();
        int result = myAdder.add(10, 25);
        System.out.println("Sum is: " + result);
    }
}
