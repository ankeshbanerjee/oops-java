class Pen {
    // data / properties
    String color;
    String type;

    // members / methods / functions
    void write(){
        System.out.println("writing something!");
    }

    void printColor (){
        System.out.println(this.color); // 'this' keyword indicates the current object
    }
}

class Student {
    String name;
    int age;

    // constructor has 3 properties ->
    // a. It has the same name as the class
    // b. It doesn't have return type
    // c. Unlike other methods of a class, constructor is called once only

    // there are 3 types of constructor

    // non-parameterised constructor
    Student(){
        System.out.println("Constructor called");
    }

    // parameterised constructor
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    // copy constructor
    Student(Student s){
        this.name = s.name;
        this.age = s.age;
    }

    // function overloading (creating functions with same name inside same class) -> compile time polymorphism (poly->many, morphism->forms)
    // there should be atleast one differentiating factor, be it, arguments, return type etc.
    public void printInfo (String name){
        System.out.println("name is: " + name);
    }

    public void printInfo(int age){
        System.out.println("Age is " + age);
    }

    public void printInfo(String name, int age){
        System.out.println(name + " " + age);
    }

    // destructor
    // java's garbage collector automatically does the stuff for this
    // no need to write destructor manually
}

// there should be one public class inside each file
public class OOPS {

    public static void main(String[] args) {
        /*
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "ballpen";
        System.out.println(pen1.color + " " + pen1.type);

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "gel";


        pen1.printColor();
        pen2.printColor();
        */

        // 'new' keyword allocates memory in the heap (dynamic allocation)
        // Student() -> calls the special type of function which is called during object creation, known as constructor
        // Student s1 = new Student("abcd", 20);
        // s1.printInfo(s1.name, s1.age);

        // Student s2 = new Student(s1);
        // s2.printInfo(s2.name);


        // example of encapsulation -> using Bank package
        bank.Bank b = new bank.Bank();
        b.name = "sbi";
        System.out.println(b.name);
    }
        
}