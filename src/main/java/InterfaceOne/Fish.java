package InterfaceOne;
/*
The class fish can implements 2 methodes through interface, it can acces the prey method, as well as the
hunt method by implementing both classes.
You do have to define both methods for different outcomes.
 */

public class Fish implements Prey, Predator{

    @Override
    public void flee(){
        System.out.println("The Fish is swimming away");
    }
    @Override
    public void hunt(){
        System.out.println("The fish is hunting another fish");
    }
}
