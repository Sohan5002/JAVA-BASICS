
/*
What are primitive data types?
Primitive data types are the basic building blocks of data in Java. 
They represent simple values and are predefined by the language.

Types: byte, short, int, long, float, double, char, boolean.


If a variable of primitive data type is not assigned, what does it contain?
Local variables: They are not assigned any default value, 
and the code will throw a compilation error if you try to use them without initialization.
Instance variables (non-static fields): They get default values (e.g., 0 for numbers, false for boolean).

Why do we suffix L with long, F with float, and D with double?
In Java, literals like 10 or 10.5 are treated as int or double by default. 
Suffixing tells the compiler the intended type explicitly:
L (Long): Ensures the literal is treated as long instead of int.
Example: long num = 100L;
F (Float): Tells the compiler to treat the number as float instead of double.
Example: float pi = 3.14F;
D (Double): Optional, but explicitly specifies the number is double.
Example: double d = 123.456D;


What happens when you assign a variable of primitive data type to another variable of the same type?
The value is copied from one variable to the other. Both variables are independent of each other.

Example:
java
Copy code
int a = 10;
int b = a;  // Value of 'a' (10) is copied to 'b'.
a = 20;     // Changing 'a' does not affect 'b'.

What are reference data types?
Reference data types store references (addresses) to objects rather than the actual data. Examples include classes, arrays, and interfaces.
Example:
java
Copy code
String name = "John";  // 'name' stores the reference to the "John" object.

What happens when you assign a variable of reference data type to another variable of the same reference type?
The reference (memory address) is copied, not the actual object. 
Both variables point to the same object in memory.
Example:
java
Copy code
String a = "Hello";
String b = a;  // Both 'a' and 'b' refer to the same object.
Changes to the object through one variable will reflect in the other.

What are the differences between primitive data types and reference data types?
Feature	Primitive Data Types	Reference Data Types
Stores	Actual value	Reference (memory address) of object
Default Values	Numbers: 0, Boolean: false, Char: '\u0000'	null
Memory Usage	Fixed size (depending on type).	Depends on object size.
Examples	int, float, boolean	String, Array, Class

What are the purposes of variables and methods in a reference type?
Variables: Store the data/state of the object.
Methods: Define the behavior of the object (what the object can do).
Example:
java
Copy code
class Car {
    String brand;  // Variable: Stores the brand of the car.
    void drive() {  // Method: Describes the car's behavior.
        System.out.println("Car is driving");
    }
}

If a variable of reference data type is not assigned, what does it contain?
It contains null, which means the variable does not refer to any object.

Example:
java
Copy code
String s;  // Default value of 's' is null. 


Base class for all Java classes:

The base class for all Java classes is java.lang.Object.4
 Every class in Java, whether directly or indirectly, inherits from this class.



 Different methods of java.lang.Object class available for overriding:
The java.lang.Object class provides several methods that can be overridden in derived classes:
equals(Object obj) - To compare the content of two objects.
hashCode() - To return a hash code for the object, which is used in collections like HashMap, HashSet, etc.
toString() - To return a string representation of the object.
clone() - To create and return a copy of the object.
finalize() - This method is called by the garbage collector before an object is destroyed (though it is not often recommended to override it).
getClass() - To get the runtime class of the object (not typically overridden, but it can be used).
notify() and notifyAll() - For thread synchronization.


What happens if your class does not override the equals method from java.lang.Object class?

If a class does not override the equals() method, the default implementation from java.lang.
Object is used, which compares object references. This means it checks whether two references
 point to the exact same object in memory (using == comparison),
 not whether the contents of the objects are equal. For meaningful content comparison, you must override equals().


 Purpose of clone() method:

The clone() method is used to create and return a copy (clone) of the object. It is a method of the Object class, 
but it is generally intended to be overridden in classes that require a deep copy or customized clone behavior.


Why should the overriding class define the meaning of clone() method?
The clone() method should be overridden to define the specific behavior of cloning for that class, 
as the default implementation in Object performs a shallow copy. For objects that contain references to other objects, 
if the clone() method is not overridden, only the references (not the actual objects) are copied, which might not be the desired behavior.

What happens if the overriding class does not override the clone() method?
If the overriding class does not override the clone() method, it inherits the default behavior from Object, 
which performs a shallow copy. This means that if the object has fields that are references to other objects, 
the references are copied, not the actual objects, resulting in two objects that still share the same referenced objects.

Impact of object references in cloned objects:
If an object contains references to external objects and these references are not cloned (for example, 
if you don't implement a deep clone), any changes made to the referenced objects will be visible in the cloned object too.
 This is because both the original and the cloned object will be referring to the same external objects, 
 and any changes to these objects will reflect in both the original and the clone.


 */