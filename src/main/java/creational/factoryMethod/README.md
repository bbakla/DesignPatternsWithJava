# Factory Method

Tags: Creational

# Intent

Define an interface for creating an object but let the subclasses ⁉️ decide which class to instantiate.

# Diagram

There are two versions of Factory method as far as I see:

- First version has only  one Factory class implementation and depending on the parameter it gets, Factory class decides which Product class to instantiate.

![img/Untitled.png](../../../../../designPatternsWithJava_/factoryMethod/img/general.png)

- Second one is similar to AbstractFactory pattern at first sight but each factory creates one type of Object in this version. This gives you two parallel class hierachy. Of course, you can also make  concrete Factory classes more complicated like in the pizza example [in that code](https://github.com/bethrobson/Head-First-Design-Patterns/tree/master/src/headfirst/designpatterns/factory/pizzafm). There are two pizza stores, factories in other words, in this example. Note that, Template pattern is also used in the factory classes.

![img/anotherVariation.png](../../../../../designPatternsWithJava_/factoryMethod/img/anotherVariation.png)

# Applicability

## When to Use

- A Class cant anticipate the class of objects it must create
- A class wants its subclasses to speficy the objects it creates
- Classes delegate responsibility to one of several helper classes and you want to localize the knowledge in subclasses.

## Tips

- It abstracts your application from creation of the objects that you intent to use.

## Pros and Cons

### Pros

### Cons

## Relationship with Other Patterns

- **Abstract Factory** is often implemented with factoy methods.
- **Factory methods** are often called within Template Methods.
- **Dependency Inversion** principle is also good applied with this pattern.

# Example

## Code

Code example can be found here.

# References