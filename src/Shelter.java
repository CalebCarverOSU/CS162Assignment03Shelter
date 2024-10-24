import processing.core.PApplet;
import java.util.ArrayList;

public class Shelter {
    private PApplet sketch;
    /* TODO: A Shelter contains (HAS) dogs inside it. Define an array list variable to store the dogs. Should it be public or private? */

    public ArrayList<Dog> shelter = new ArrayList<>();

    /**
     * TODO:  Your shelter constructor should initialize your member variables. Add that code in the body of the constructor.
     * Add an appropriate access modifier
     * @param sketch
     */
    Shelter(PApplet sketch) {

    }


    /**
     * TODO:  Your intake method should add a new dog to your array list
     * Add an appropriate access modifier
     * @param dog
     */
    void intake(Dog dog){
        shelter.add(dog);
        
    }


    /**
     * TODO:  Your displayAnimals method should display all the dogs in the shelter, Don't forget to display your shelter title too!
     * Add an appropriate access modifier
     */
    void displayAnimals(){

    }

}