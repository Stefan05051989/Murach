package Shapes;
    /*
    Shape is the parent class from the circle, rectangle and triangle classes (child class)
    and their objects/methodes are executed in the main class
    */

    /*
     Return type : double.
     create method, in the method, every childclass of the shapeclass needs an area method!
     */
    // Abstract CLASSES can contain Abstract and Concrete methodes (opposite of abstract)
    // Concrete methodes are Defined AND inherited within an Abstract class.
    // Area is een ABSTRACT METHOD, which means that the CHILDREN CLASSES (Circle, Rectangle and Triangle) have to define it!
    // define concrete method of Display :

public abstract class Shape {

    abstract double area(); // <- Abstract Method!

    void display(){ // CONCRETE METHODE!
        System.out.println("This is a shape");
        /*
        The concrete methode : display, is INHERITED from the shape CLASS (Shape class, is the parent class)
         */
    }
}
