interface Animal {
    // interface doesn't have constructor
    // no method can have body
    // all the fields of an interface are public, static and final by default
    // all the methods are public and abstract
    public String habitat = "Jungle";   
    public void walk(); // being abstract, it shouldn't have a body
}

interface Herbivore{
    public void eat();
}

// while inheritance of interface, use 'implements' instead of 'extends'
class Horse implements Animal {
    // the methods of interface must be implemented here
    public void walk(){
        System.out.println("Horse walking");
    }
}

// multiple inheritance -> it can be done only using interfaces, not class
class Cow implements Animal, Herbivore{
    public void walk(){
        System.out.println("Cow's walking");
    }
    public void eat(){
        System.out.println("cow's eating");
    }
}

public class Interface {
    public static void main(String[] args) {
        System.out.println(Animal.habitat); // accessing directly through class, coz its a static property
        Cow c = new Cow();
        c.eat();
        c.walk();
    }
}
