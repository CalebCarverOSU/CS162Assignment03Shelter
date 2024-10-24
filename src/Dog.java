import processing.core.PImage;
import processing.core.PApplet;
import static processing.core.PConstants.CENTER;
import static processing.core.PConstants.RECT;

public class Dog {
    private PApplet sketch;
    private PImage img;
    private static final int IMG_SCALE_FACTOR = 2;
    private int x,y;
    private int age;
    private String name;
    private String breed;


    /* TODO  Add additional member variables. Choose appropriate access modifiers */


    /**
     * TODO:  Your Dog constructor should initialize your member variables. Add that code in the body of the constructor
     * @param sketch
     * @param x
     * @param y
     */

    protected Dog(PApplet sketch, int x, int y, String name, String breed, int age, PImage img) {
        this.x = x;
        this.y = y;
        this.sketch = sketch;
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.img = img;
    }

    /**
     * TODO:  Your draw method should draw the a dog object. Remember each dog object contains an image of the dog, its description,
     * and an AdoptMe button. Work on displaying each element, one at a time. Test after each addition.
     */
    protected void draw() {
        this.sketch.image(img,x,y);
        sketch.rect(50,50,50,50);

    }


    /**
     * TODO:  Your toString method should return a String containing the name, breed, and age of the dog object
     */
    public String toString() {
        return ("this dogs name is " + name + " they are a " + breed + " and are " + age + "years old.");
    }
}


