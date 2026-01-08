package javabasics;
/*
  Console class Java ka ek part hai jo command-line input/output ko handle karne ke liye use hota hai. 
  Yeh java.io.Console class ke under aata hai aur mostly text-based input/output operations ke liye use hota hai, 
  jaise user se input lena ya text ko console pe print karna.

Why Use Console Class?

Secure Input: Console class password jaise sensitive data ko securely handle karta hai. Agar user password input de, toh console pe text mask ho jata hai.
Improved User Interaction: Command-line interface me direct input/output ke liye convenient hota hai.
Better Handling: Console class readLine() aur readPassword() methods provide karta hai, jo console pe inputs ko handle karne me madad karte hain.
Example:
*/
import java.io.Console;

public class Consoleclass {
    public static void main(String[] args) {
        // Get the console object
        Console console = System.console();
        
        // Check if console is available
        if (console == null) {
            System.out.println("No console available");
            return;
        }
        
        // Reading input from user
        String name = console.readLine("Enter your name: ");
        System.out.println("Hello, " + name);

        // Reading password securely
        @SuppressWarnings("unused")
		char[] password = console.readPassword("Enter your password: ");
        System.out.println("Password entered successfully");
    }
}
/*
Explanation:
System.console(): Yeh method console object ko return karta hai. 
Agar console available nahi hai (for example, if you are running the code in some IDE or GUI-based system), 
toh yeh null return karega.

readLine(): Isse user se ek line input li ja sakti hai, jo string form mein hoti hai.

readPassword(): Yeh method user se password input karta hai. Isme input karte waqt jo characters enter hote hain,
 woh mask ho jaate hain (for security).
 
 */

