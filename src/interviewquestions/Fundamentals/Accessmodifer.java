/*
 * Purpose of Access Modifier:

Access modifiers define the visibility and accessibility of classes, methods, variables, and constructors. 
They help control access to the components and ensure encapsulation and security.



Difference between Access Modifiers for Class and Members:

The access modifiers for a class are typically more restricted (e.g., public, default), while for members (fields, methods), 
they can be more specific (e.g., private, protected, public, default).

Scope of Private, Protected, and Public Modifiers:

private: Accessible only within the same class.
protected: Accessible within the same package and by subclasses (including subclasses in different packages).
public: Accessible from anywhere, regardless of the package.

No Access Modifier with a Class:
If no access modifier is specified for a class, it has package-private access, meaning it is accessible only within the same package.

Visibility of Protected Members in Different Package:
A subclass in a different package can access protected members of its superclass, but only through inheritance, not directly by instance.

Member Access Modifier in Derived Class:
The access modifier for a member in the derived class should be less restrictive or
 equal to the base class to allow proper usage and maintain the inheritance relationship.

Using Subclass Object with Superclass Reference:
You can use a subclass object with a superclass reference if the subclass members are not more restrictive than the superclass members 
(i.e., maintaining access compatibility).

Criteria for Choosing Access Modifier for a Class:
Choose the most restrictive access modifier that ensures encapsulation, security, and prevents unnecessary exposure of internal details.
 */