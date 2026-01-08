package javabasics;

public class Interfaceandclass {


/*
Scenario: School System
Class:

Ek class ko tum ek student ki tarah socho.
Har student ke paas specific details aur behaviors hote hain, jaise naam, roll number, marks aur woh padhai karte hain.
Example:

java
Copy code
public class Student {
    String name;   // Attribute
    int rollNumber;

    void study() { // Behavior
        System.out.println(name + " is studying.");
    }
}

/*Interface:

Interface ko tum ek role ya ruleset ki tarah socho, jaise "School Rules".
Har student ko yeh rules follow karne hote hain, par kaise follow karenge yeh student pe depend karta hai.
Example:

java
Copy code
public interface SchoolRules {
    void attendClasses(); // Rule: Classes attend karni hain
    void submitHomework(); // Rule: Homework submit karna hai
}
Bringing Class and Interface Together
Ab maan lo har student ko school ke rules follow karne hote hain. Tum ek class (Student) ko ek interface (SchoolRules) implement karne ke liye bolte ho.

Example:
java
*/
// Interface defining rules
public interface SchoolRules {
    void attendClasses();  // Rule
    void submitHomework(); // Rule
}

// Class representing a student
  public class Student implements SchoolRules {
    String name;  // Attribute
    int rollNumber;

    // Constructor
    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    // Implementing rules
    public void attendClasses() {
        System.out.println(name + " is attending classes.");
    }

    public void submitHomework() {
        System.out.println(name + " has submitted the homework.");
    }

    // Student-specific behavior
    public void study() {
        System.out.println(name + " is studying for exams.");
    }
  }
}
/*
How it Works
 1.Class:

Student class ka apna behavior hai (study method).
Yeh individual student ke attributes aur actions ko define karta hai.
 2. Interface:

SchoolRules ke through har student ko yeh guarantee karni padti hai ki woh classes attend karega aur homework submit karega.
Interface sirf "rule define" karta hai, implementation har student ke liye alag ho sakti hai.
Testing the Concept
java


//public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Rahul", 101);
        
        // Class methods
        student1.study();

        // Interface methods
        student1.attendClasses();
        student1.submitHomework();
    }}}

/*
Output:
Rahul is studying for exams.
Rahul is attending classes.
Rahul has submitted the homework.



Real-Life Difference: Tumhe Hamesha Yaad Rahega!

Class (Student):

Ek student ke paas apni unique identity aur actions hote hain.
Example: Rahul ka naam hai, roll number hai, aur woh padhai karta hai.
Interface (SchoolRules):

Ek ruleset hai jo har student ko follow karna padta hai.
Example: Sab students ko classes attend karni hai aur homework submit karna hai, chahe Rahul ho ya Sohan.
Key Takeaway
Class: Objects ka structure aur behavior define karta hai (e.g., Student = unique details aur behaviors).
Interface: Ek contract ya rules define karta hai jo sabko follow karna padta hai (e.g., SchoolRules = sabko implement karna hoga).*/
