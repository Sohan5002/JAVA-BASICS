/*
 * What are static classes?
In Java, the term "static class" refers to a nested static class. It is a class defined inside another class 
that does not require an instance of the outer class to be created. A static class can access only static members of the outer class.

Can any class be declared as static?
No, only nested classes (classes inside another class) can be static. Top-level classes (the main classes) cannot be declared static in Java.

What are static methods?
Static methods belong to the class itself, not to any specific instance. You can call a static method without creating an object of the class.
 Static methods can only access other static members (variables or methods) of the class.

What are static variables?
Static variables are shared by all instances of the class. There is only one copy of the static variable for the entire class, 
regardless of how many objects are created.

Who owns the class members that are static? How is that different for non-static members?
Static members are owned by the class itself, meaning they are common to all objects of that class. 
On the other hand, non-static members are owned by individual objects and have different values for each instance.


How should you access class members that are static?
Static members should ideally be accessed using the class name. For example: ClassName.staticVariable or ClassName.staticMethod(). 
You can access them via an object too, but it's less clear.

Does a static method have access to an instance member? Why?
No, a static method cannot directly access instance members. This is because static methods are not tied to any specific object, 
so they do not have access to instance-specific data. They can only access static members, which belong to the class, not individual objects.
 */