package Shapes;
import java.lang.Math;
/*
after creating abstract method area, Circle get's error message :
"Class 'Circle' must either be declared abstract or implement abstract method 'area()' in 'Shape'" (continue in method)
Circle method Inherits from the Shape Class, that has an abstract method of Area();, we need to implement that method
 */
public class Circle extends Shape{
    /*
    This is an overridin method, so we need to write is as @Override
     */

    // to calculate the radius of the circle, define an attribute.
    double radius;

    // + constructor (When constructing a (circle) object, we have to pas a double ( for the radius)
    // Circle ( PARAMETERS! ){ ETC
    Circle(double radius){
        this.radius = radius;
    }

    // formula to calculate the circle will be passed through this methode :
    // Math.PI
    @Override
    double area(){
        return Math.PI * radius * radius;
    }
}
