import processing.core.PApplet;
import java.util.ArrayList;

public class Shelter {
    private PApplet sketch;
    /* TODO: A Shelter contains (HAS) dogs inside it. Define an array list variable to store the dogs. Should it be public or private? */

    private ArrayList<Dog> shelter = new ArrayList<Dog>();

    /**
     * TODO:  Your shelter constructor should initialize your member variables. Add that code in the body of the constructor.
     * Add an appropriate access modifier
     * @param sketch
     */
    Shelter(PApplet sketch) {
        this.sketch = sketch;
         this.shelter = new ArrayList<Dog>();

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
        sketch.fill(255,255,255);
        sketch.textSize(40);
        sketch.text("Calebs Dog Shelter", 40, 50);
        int YOffsett = 100;
        for(int i = 0; i < shelter.size(); i++){
            sketch.textSize(15);
            sketch.text(shelter.get(i).toString(),100,YOffsett);
            sketch.image(shelter.get(i).getImg(),0,YOffsett - 25);
            YOffsett += 75;
            //dog.draw();
        }
        
    }
}