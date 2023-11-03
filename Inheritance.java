class Shape {
    public void area() {
        System.out.println("Displays area");
    }
}

// single level inheritance: parent class (Base class) -> child class (Derived
// class)
class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println("Area is: " + (0.5 * l * h));
    }
}

// multi level inheritance: Base class -> Derived class -> Derived class
class EquilateralTriangle extends Triangle {
    public void area(int l, int h) {
        System.out.println("Area is: " + (0.5 * l * h));
    }
}

// hierarchial inheritance: Base class
// / \
// Derived class Derived class
class Circle extends Shape {
    public void area(int r) {
        System.out.println(3.14 * r * r);
    }
}

// hybrid inheritance -> various types of inheritance at one place (single level
// at one branch, hierarchial inheritance at another branch etc.)

public class Inheritance {
    public static void main(String[] args) {

    }
}
