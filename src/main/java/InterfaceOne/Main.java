package InterfaceOne;

public class Main {
    public static void main(String[] args){
        /*
        Interface = A blueprint for a class that specifies a set of ABSTRACT METHODS.
        that the implementing classes MUST define.
        Supports multiple inheritance-like behaviour
        Inheritance : class can only have a single parent.
        Interface : class can have multiple parent classes.
         */

        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();

        rabbit.flee();
        hawk.hunt();
        fish.hunt();
        fish.flee();
    }
}
