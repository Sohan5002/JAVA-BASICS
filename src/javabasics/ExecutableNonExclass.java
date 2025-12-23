package javabasics;
/*
1. Executable Class:
Definition: Ek executable class wo class hoti hai jo main() method ko contain karti hai.

Java program ka execution hamesha main() method se start hota hai, isliye us class ko executable class kehte hain.

2. Non-Executable Class:
Definition: Ek non-executable class wo hoti hai jisme main() method nahi hota.

Isko directly run nahi kar sakte, ye sirf helper ya supporting class ki tarah kaam karti hai.
Purpose: Ye classes dusre objects ya classes ke liye methods aur logic define karti hain.


*/// Non-Executable Class: This class handles menu details
public class ExecutableNonExclass {
    public void showMenu() {
        System.out.println("1. Pizza - $10");
        System.out.println("2. Burger - $5");
        System.out.println("3. Pasta - $8");
    }

    public int calculatePrice(int choice) {
        if (choice == 1) return 10;
        else if (choice == 2) return 5;
        else if (choice == 3) return 8;
        else return 0;
    }
}

// Executable Class: This is the starting point of the program


