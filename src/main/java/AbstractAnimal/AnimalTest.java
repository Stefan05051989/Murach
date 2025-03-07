package AbstractAnimal;

public class AnimalTest {
    public static void playWithAnimal(Animal animal){
        animal.move();
        animal.sleep();
        animal.eat();
    }
    public static void main(String[] args){
        Animal eagle = new Eagle();
        Animal shark = new Shark();

        playWithAnimal(eagle);
        playWithAnimal(shark);
        // inline code :
        playWithAnimal(new Alligator());
    }
}
