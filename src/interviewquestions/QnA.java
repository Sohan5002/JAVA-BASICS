package interviewquestions;
/*
 * Definition of Class and Interface:
Class:
"A class is a blueprint for creating objects. 
It defines attributes (data) and methods (functions) that represent the behavior of an object.
 For example, a Car class can have attributes like color and speed, and methods like start() and stop()."

Interface:
An interface is a blueprint for a class that defines a set of methods without providing their implementation.
 It acts as a contract that any class implementing the interface must follow. 
For example, a Vehicle interface might define methods like drive() and brake(), 
but the actual implementation depends on the specific class, like Car or Bike."
---------------------------------------------------------------------------------------------------------------------------------------


1. Local Variable:
A local variable is declared inside a method, constructor, 
 or block and is accessible only within that method or block.
 Its life cycle is limited to the method's execution.
 For example, a variable age declared inside a method can only be used within that method."

2. Instance Variable:
An instance variable is declared inside a class but outside any method or block. 
It belongs to a specific object, meaning each object of the class has its own copy of the instance variable. 
For example, a name variable in a class Student will have a unique value for each Student object."

3. Static Variable:
A static variable is declared inside a class with the static keyword.
 It belongs to the class rather than any specific object, so all objects of the class share the same value. 
 For example, a schoolName variable in a class Student can be static if all students belong to the same school."

-----------------------------------------------------------------------------------------------------------------------------------------------------------

 1. Static Method:
A static method belongs to the class rather than any specific object of the class. 
It can be called directly using the class name without creating an object.
 Static methods are commonly used for utility or helper functions that do not depend on instance variables."

2. Non-Static Method (Instance Method):

A non-static method belongs to an object of the class and can access instance variables and 
other non-static methods of that object. 
To call a non-static method, you need to create an object of the class first."

------------------------------------------------------------------------------------------------------------------------------------------------------------
 1.Console Class
 
The Console class in Java is part of the java.io package and is used to interact with the user through the command-line interface.
 It allows us to read input from the user and display output securely on the terminal.

User Input: It provides methods like readLine() to read lines of text from the console.

Secure Input: For sensitive data like passwords, it has the readPassword() method,
 which hides the input as it's typed, ensuring privacy.
 
Output: It can also display messages using printf() or println() methods, similar to System.out.println(), 
but specifically designed for command-line programs.
 
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 
 Executable Class:
 
A class with a main() method, which serves as the entry point for the program. It is directly executed by the JVM.

Non-Executable Class:
A class without a main() method, used to define logic, methods, or reusable components. 
It cannot run directly and must be invoked by an executable class.

Key Difference:
Executable Class: Contains main(), starts the program.
Non-Executable Class: No main(), supports reusable logic.
--------------------------------------------------------------------------------
Package
A package in Java is a namespace that organizes a group of related classes, interfaces, and sub-packages.
 It provides a modular structure to the codebase and helps to avoid class name conflicts.
  Packages also offer access control to restrict the scope of classes and improve code organization and maintainability.
  
  



 */


