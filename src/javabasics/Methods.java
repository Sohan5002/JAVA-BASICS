package javabasics;
/*
 * Static Method:

Yeh method static keyword ke saath define hota hai.
Static method class ka hota hai, kisi specific object ka nahi.
Static method ko bina object banaye directly class ke naam se call kiya ja sakta hai.
Example: Math.pow() ek static method hai jo bina object banaye kaam karta hai.

*/

public class Methods {
    // Static inner class
    public static class A {
        void display() {
            System.out.println("Inside A");
        }
    }

    public static void main(String[] args) {
        // Directly create an instance of inner class A
        Methods.A obj = new Methods.A(); 
        
        // Display the output
        obj.display();  // Expected Output: Inside A
    }


/*

Non-Static Method (Instance Method):

Non-static method static keyword ke bina define hota hai.
Yeh method ek specific object ka hota hai, aur object banane ke baad hi isse call kiya ja sakta hai.
Example: Agar Student class me ek displayDetails() method hai, toh usse object banane ke baad hi call karoge.
 */



    // Non-static inner class
    public class A1 {
        void display() {
            System.out.println("Inside A");
        }
    

    public static void main(String[] args) {
        // Create an instance of outer class Methods
        Methods outer = new Methods(); 
        
        // Now create an instance of inner class A using outer class object
        Methods.A1 obj = outer.new A1(); 
        
        // Display the output
        obj.display();  // Expected Output: Inside A
    }
}}
/*
 * public class Methods {
    // Non-static inner class
    public class A {
        void display() {
            System.out.println("Inside A");
        }
    }

    public static void main(String[] args) {
        // Create an instance of outer class Methods
        Methods outer = new Methods(); 
        
        // Now create an instance of inner class A using outer class object
        Methods.A obj = outer.new A(); 
        
        // Display the output
        obj.display();  // Expected Output: Inside A
    }
}

 * 
 */


