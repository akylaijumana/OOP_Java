#   Student Class in Java
In object-oriented programming, classes serve as blueprints for creating objects, encapsulating data and behavior into a single unit. The Student class exemplifies this concept by representing a student in a university setting. This essay will provide a comprehensive analysis of the Student class, detailing its attributes, methods, and overall functionality.

## Class Definition
The Student class is defined with the public keyword, allowing it to be accessible from other classes and packages. This visibility is crucial for creating and manipulating Student objects from different parts of a program. The class itself encapsulates data specific to students and provides methods to interact with this data.
 
```public class Student {```
## Attributes
Attributes, also known as fields or properties, define the characteristics of the Student class. They are:

```public String name;```: This attribute holds the name of the student. As a String, it can store a sequence of characters, which is suitable for names. The public access modifier ensures that this attribute can be accessed directly from other classes.

```public String major;```: This attribute stores the student's major field of study. Similar to the name attribute, it uses the String data type to represent text.

```public int ID;```: The ID attribute represents the student's identification number. It uses the int data type, which is ideal for integer values and allows for a wide range of possible student IDs.

```public Double GPA;```: The GPA (Grade Point Average) attribute captures the student's academic performance. It is represented using the Double class, which is a wrapper for the primitive double type, accommodating fractional numbers with greater precision.

## Constructor
The constructor in the Student class initializes new instances of the class. It takes four parameters corresponding to the attributes of the class: name, major, ID, and GPA. Within the constructor, the this keyword is used to refer to the current object's attributes, distinguishing them from the constructor parameters.


##Method: ```displayInfo```
The displayInfo method provides a way to output the student's details to the console. It uses System.out.println to print each attribute of the student, formatted with explanatory text. This method demonstrates encapsulation by accessing and presenting the class's internal data in a controlled manner.

##Object Creation:

Three Student objects (student1, student2, student3) are created with distinct names, majors, IDs, and GPAs.
Displaying Information: The displayInfo method is called on each object to print its details to the console, separated by blank lines for clarity.
