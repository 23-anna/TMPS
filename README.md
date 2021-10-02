# TMPS
TMPS Project Repo

**Project Topic:** Architectural Firm - Creational Design Patterns

**Project author:** Ana Petranis

**Objectives:**
1. Study and understand the Creational Design Patterns.
2. Choose a domain, define its main classes/models/entities and choose the appropriate instantiation mechanisms.
3. Use some creational design patterns for object instantiation in a sample project.

**Theory:**

In software engineering, a Design Pattern describes an established solution to the most commonly encountered problems in software design. Creational Design Patterns are concerned with the way in which objects are created. They reduce complexities and instability by creating objects in a controlled manner. In this project are included three Design Patterns:
- Singleton - Ensures that at most only one instance of an object exists throughout application
- Factory Method – Creates objects of several related classes without specifying the exact object to be created
- Builder – Constructs complex objects using step-by-step approach

**Implementation:**

--Singleton--
This CDP is implemented due to the classes House, BusinessCenter and School. Each of them has the same structure and used for creation of a single object. It should be highlighted that this type of classes could be called only by getInstance() method.

--Factory Method--
Factory Method Design Pattern is one of the most used design patterns in Java. It defines an interface for creating an object, but let subclasses decide which class to instantiate. In this project there is defined interface IDesign, and two classes that implement this interface (Interior Attributes and ExteriorCompositions). Abstract class Designer has method startDesign(), where is created an instance of IDesign. Also this class is extended by the Exterior and Interior classes that rule through the abstract method create Design() in Designer class. 

--Builder--
The Builder Design Pattern is another creational pattern designed to deal with the construction of comparatively complex objects. When the complexity of creating object increases, the Builder pattern can separate out the instantiation process by using another object to construct the object. It is the base pattern of the project. In this CDP are involved Classes Deal, BusinessCenter, BusinessCenterBuilder, School, SchoolBuilder, House, HouseBuilder and the interface IBuilder.

**Results:**

The result of the program execution is attached in the Lab1.png file. Here you can see the demo of the operations that executes the algorithm. 
In conclusion, it is possible to say that Design Patterns ease the process of software development and help developers to maintain the code clean and clear.
