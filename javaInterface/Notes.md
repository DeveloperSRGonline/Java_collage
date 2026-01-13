# 📘 Java Interfaces - Complete Notes

## 🔹 What is an Interface?

An **interface** in Java is a reference type (similar to a class) that defines a **contract** or agreement. It specifies **what** should be done, but not **how** it should be done.

> 💡 **Think of it as:**  
> *"If you implement me, you must follow these rules."*

---

## 🔹 Core Purpose

- ✅ **Defines WHAT needs to be done** (methods that must be implemented)
- ❌ **Does NOT define HOW it should be done** (implementation details)
- 🤝 **Creates a contract** between classes and their functionality

---

## 🔹 What Can Be Inside an Interface?

### ✅ 1. Abstract Methods
```java
void method1();
```
- No method body
- **Must** be implemented by implementing classes

### ✅ 2. Default Methods (Java 8+)
```java
default void method2() {
    System.out.println("This is a default method.");
}
```
- Has implementation body
- Can be overridden by classes (optional)
- **Benefit:** Prevents breaking existing code when adding new methods

### ✅ 3. Static Methods
```java
static void staticMethod() {
    System.out.println("Static method in interface");
}
```
- Called using interface name: `MyInterface.staticMethod()`
- Cannot be overridden by classes

### ✅ 4. Constants Only
```java
int CONSTANT = 100;  // Automatically public static final
```
- All variables are `public`, `static`, and `final`
- Must be initialized at declaration
- Cannot be modified

---

## 🔹 What CANNOT Be Inside an Interface?

- ❌ Instance variables
- ❌ Constructors
- ❌ Objects cannot be created directly
- ❌ Non-static/non-final variables
- ❌ Concrete methods (except default/static)

> ⚠️ **Reason:** Interfaces are purely for defining contracts, not implementation details.

---

## 🔹 Syntax & Implementation

### Interface Definition
```java
interface MyInterface {
    int CONSTANT = 100;  // Constant
    
    void abstractMethod();  // Abstract method
    
    default void defaultMethod() {
        System.out.println("Default method");
    }
    
    static void staticMethod() {
        System.out.println("Static method");
    }
}
```

### Class Implementation
```java
class MyClass implements MyInterface {
    @Override
    public void abstractMethod() {
        System.out.println("Method implemented");
    }
}
```

> 📌 **Rule:** A class must implement all abstract methods from the interface, or be declared `abstract`.

---

## 🔹 Key Features

### 🔸 Multiple Interface Implementation
```java
interface Animal {
    void eat();
}

interface Vehicle {
    void move();
}

class Robot implements Animal, Vehicle {
    @Override
    public void eat() {
        System.out.println("Robot eating");
    }
    
    @Override
    public void move() {
        System.out.println("Robot moving");
    }
}
```

> ✅ **Java allows multiple interface implementation** (solution to multiple inheritance limitation)

### 🔸 Interface Inheritance
```java
interface A {
    void show();
}

interface B extends A {
    void display();
}
```

---

## 🔹 Benefits of Interfaces

| Benefit | Description |
|---------|-------------|
| **Multiple Inheritance** | One class can implement multiple interfaces |
| **Loose Coupling** | Code becomes more flexible and maintainable |
| **Reusability** | Same interface can be implemented by multiple classes |
| **Polymorphism** | Interface reference can point to any implementing class object |

---

## 🔹 Class vs Interface Comparison

| Feature | Class | Interface |
|--------|-------|-----------|
| **Inheritance** | Single inheritance only | Multiple inheritance supported |
| **Keyword** | `extends` | `implements` |
| **Methods** | Can have concrete methods | Focus on abstract methods |
| **Variables** | Any type | Only `public static final` constants |
| **Constructors** | Allowed | Not allowed |
| **Object Creation** | Can create objects | Cannot create objects directly |
| **Main Method** | Allowed | Not allowed |

---

## 🔹 Practical Example

```java
interface Salary {
    double Basic_Salary = 10000.0;
    void Basic_Sal();
}

class Employee {
    // Employee class code
}

class Gross_Salary extends Employee implements Salary {
    @Override
    public void Basic_Sal() {
        System.out.println("Basic Salary: " + Basic_Salary);
    }
}
```

> 💡 **Real Power:** A class can extend one class **AND** implement multiple interfaces simultaneously.

---

## 🔹 Final Summary

| Concept | Key Point |
|---------|-----------|
| **Interface** | A contract defining **WHAT** needs to be done |
| **Class** | Provides the implementation (**HOW** to do it) |
| **Multiple Inheritance** | Solved through interfaces in Java |
| **Default Methods** | Allow adding methods without breaking existing code |
| **Real-world Use** | Essential for API design, frameworks, and flexible architecture |

> 🎯 **Remember:**  
> *"Interfaces define capabilities, classes provide implementations."*  
> They are fundamental to building flexible, maintainable, and scalable Java applications.