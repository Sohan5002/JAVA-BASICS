package javabasics;
/*
Local Variable:

Yeh method ke andar declare hota hai aur sirf us method ke andar hi accessible hota hai.
Jab method ka execution khatam hota hai, 
toh local variable destroy ho jata hai.
Example: Ek method ke andar int age = 25; declare kiya, 
toh yeh variable sirf us method me kaam karega.


Instance Variable:

Yeh class ke andar declare hota hai, lekin kisi specific object ke liye kaam karta hai.
Har object ka apna alag instance variable hota hai, jo alag-alag values ko hold kar sakta hai.
Example: Ek class me name declare kiya, toh har object ka apna name hoga.


Static Variable:

Yeh class ke andar declare hota hai aur sab objects ke liye common hota hai.
Static variable memory me ek hi baar allocate hota hai, aur sab objects use karte hain.
Example: Ek class ka schoolName static hai, toh har student ka school name wahi hoga.

*/
public class Variables {
    // Instance variable (Each object has its own value)
    String name;  
    int rollNumber;

    // Static variable (Shared by all objects)
    static String schoolName = "ABC School";

    public void displayDetails() {
        // Local variable (Only accessible inside this method)
        int age = 18;  
        System.out.println("Name: " + name + ", Roll: " + rollNumber + ", Age: " + age);
    }
}
