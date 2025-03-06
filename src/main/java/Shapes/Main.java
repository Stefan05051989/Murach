package Shapes;

/*
Abstract = Used to define abstract classes and methods.
- Abstaraction is the proces of hiding implementation details and showing only the essential features.
Abstract classes CAN'T be instantiated directly!
Can contain 'abstaract' methods ( these must be implemented)
Can contain 'concrete' methods (which are inherited)
(car : learn to use the gas / clutch and brake, not how the engine works to move the car.)
// Shape shape  = new Shape();
        /* wanneer je deze aanmaakt, melding : shape is abstract, it cannot be instantiated.
        Since shape is an abstract class, we CAN'T create objects, from this class!
        Not meant to make shapes, but to make circles as objects from the shapes.
        */

public class Main {
    public static void main(String[] args){
        // Shape shape  = new Shape();

        // create new objects that can call it's methods! :
        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(4,5);
        Triangle triangle = new Triangle(6,7);

        System.out.println(circle.area());
        System.out.println(rectangle.area());
        System.out.println(triangle.area());
        //System.out.println(display);

        // take circle (rectangle, triangle) object, call the display method and run :
        /*
        after addapting the methodes within the childclasses, the main gives an error because we havent
        defined the ARGUMENTS to pas them in

        circle.display(3);
        rectangle.display(4, 5);
        triangle.display(6, 7);
        outcome "This is a shape (Void display method gets called from shape to run in main with circle object.

         */
    }
}
