// as all the properties are inherited in the derived classes
// so, it is not important to make the base class accessible anymore.
// so, you can make this abstract (abstract means it is a blueprint or imagination, it doesn't exist in real)
abstract class Animal {
    Animal() {
        System.out.println("Base class constructor called");
    }

    abstract public void walk(); // abstract method has no body

    public void eat() {
        System.out.println("eating");
    }
}

class Horse extends Animal {
    Horse() {
        System.out.println("Horse constructor called");
    }

    // an abstract method of the parent class must be implemented here
    public void walk() {
        System.out.println("horse walking");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Horse h = new Horse(); // the base class constructor is called first, then its own constructor
        h.walk();
        // Animal a = new Animal(); -> can't be instantiated, coz, marked as abstract
        h.eat(); // though Animal in an abstract class, its 'eat' method can be used
        // to make each property of a class abstract, create 'interface', instead of
        // class
    }
}
