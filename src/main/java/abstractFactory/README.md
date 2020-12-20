# Abstract Factory

Tags: Creational

# Intent

Provide an interface for creating related or dependent objects so that the singleton.client doesnt have to call the constructors of the concrete classes. [ 1 ]

# Diagram

![diagram](../docs/abstractFactory.png)
# Applicability

## When to Use

- A system should be independent of how its products are created, composed and represented.
- A system should be configured with one or multiple families of products
- A family of related products should be used together and you want to enforce this constaint.
- You want to provide set of objects with hiding the implementations of them so you just want to reveal the interfaces. [ 1 ]

## **Tips**

1. Consider creating each factory classes as Singleton. 
2. Each Concrete product can have a Factory method.
3. If there are many product families, concrete factory can be implemented using **Prototype pattern**. Prototypes can help you to avoid new concrete factories. You can store the prototypes in Factory classes.

## Pros and Cons

### Pros

- **It isolates the concete classses**.  The Abstract Factory methods helps us control the classes of objects that an application creates. Since the factory classes encapsulates the creation of objects from the singleton.client, there is a clear isolation between the singleton.client and implementation classes.
- **It makes exchanging product families easy**. Each factory creates a group of objects that belong to the same family or configuration. To be able to change the behavior or your program whose part is based on that group of objects, all you need is to use another factory method.  [First example]()  explains this usage.
- **It regulates the creation and usage of set of objects.** Since each factory creates a specific set of objects, the singleton.client can only execute with the objects which are decided by the factory methods. With this way combination of objects that the clients can use are limited.

### **Cons**

- **Supporting new object creation is difficult**.The set of objects to be produced by Factory classes are defined by Abstract Factory class. Once it is exposed to the world as a contract, it is not easy to change the set of objects to be populated by those factory classes.

## Relationship with Other Patterns

# Example

1.  You have a program which has several themes. Each theme includes different widget look-and-feels, different color sets and so on. Objects of those themes are populated from factory classes. DarkTheme has a DarkThemeFactory and LightTheme has a LightThemeFactory. When you want to change the theme on runtime, you would use the related Factory class to populate the objects and replace them with the existing ones.

# References

[ 1 ] Design Patterns-Elements of Reusable Object-Oriented Software  

# Todos

- [ ]  implement an AbstractFactory with Prototype
- [ ]  Yeni tiplerin tanimlanmasi durumunda AbstractFActoryi degistirmeden nasil bir tasarim yapabiliriz?
    - Abstract factorye bir parametre verilir hangi tip object set yaratilacagina dair. AbstractFactory de ona gore bir ConcreteFactory cagirir.