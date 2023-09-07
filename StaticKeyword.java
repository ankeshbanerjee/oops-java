// static properties are those which directly belongs to the class and can be accessed directly through the class
// use static for those properties which are supposed to be common among all the objects of that class
// the benefit of using static keyword are -
// if the static property is modified, it'll be done for all the objects, no need to do individually
// for static properties, memory is allocated only once.

class Student{
    
    static public String school;
}

public class StaticKeyword {
    public static void main(String[] args) {
        Student.school = "ADF";
        System.out.println(Student.school);
        Student s = new Student();
        System.out.println(s.school);
        s.school = "ABC";
        System.out.println(Student.school);
        Student.school = "CCC";
        System.out.println(s.school);
    }
}
