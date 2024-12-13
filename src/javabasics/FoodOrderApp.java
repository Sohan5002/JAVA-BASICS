
package javabasics;
public class FoodOrderApp {
    public static void main(String[] args) {
        ExecutableNonExclass menu = new ExecutableNonExclass(); // Creating an object of the non-executable class
        menu.showMenu(); // Calling the method from the non-executable class

        @SuppressWarnings("resource")
		java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter your choice (1-3): ");
        int choice = scanner.nextInt();

        int price = menu.calculatePrice(choice); // Using method from non-executable class
        if (price > 0) {
            System.out.println("Your total is: $" + price);
        } else {
            System.out.println("Invalid choice!");
        }
    }
}
