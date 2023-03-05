# java-labs-2023

Java labs
# Lab №1, Option 18
## Task:
Create class Garden with attributes:
- **area**: the area of the garden in square meters
- **hasOrchard**: a boolean indicating whether the garden has an orchard or not
- **hasVegetableGarden**: a boolean indicating whether the garden has a vegetable garden or not
- **numberOfFlowers**: the number of flowers in the garden.

Class should have the following public methods:
- **plantFlower(int count)**: Adds the specified number of flowers to the garden.
- **removeFlower(int count)**: Removes the specified number of flowers from the garden.
- **addVegetableRegion(double area)**: Increases the garden's area by the specified amount.

Using the lombok library, you should implement the _set_ and _get_ methods, _constructors with arguments_, the _constructor by default_ and the overridden method _toString()_
The written class must contain a public static method _getInstance()_, and a public static field _instance_ whose value will be returned by the method getInstance
In the class, you should also write the main method, in which you should create an array of class objects using:
- the default designer
- a constructor that receives all parameters
- 2 objects obtained when the getInstance method is called

Output the identifiers of all objects from the array to the console using a loop with a prerequisite