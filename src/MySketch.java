import processing.core.PApplet;

public class MySketch extends PApplet {
    private final int BACKGROUND_COLOR = 122;
    private final String[] dogNames = {"Lou","Buddy","Fluffy","Carl"};
    private final String[] dogBreeds = {"Lab","Bulldog","WhoKnows","Dalmation"};
    private final int[] dogAges = {10,7,2,3};
    private final String[] dogImages = {"../assets/dog1.png","../assets/dog1.png","../assets/`dog1.png","../assets/dog1.png"};

    Dog dog;

    public void settings() {
        size(500, 500);
    }

    public void setup() {
        /* TODO:  create a shelter object and add all the animals described in the arrays above to it */

        Shelter shelter = new Shelter(this);
        /* Hint: use fantasy driven design. Pretend the shelter class has a method to intake a new dog and call it. */
        /* You can worry about the details later when you design the Shelter class */
        for(int i = 0; i < 4; i++){
            dog = new Dog(this,10 * i, 10 * i, dogNames[i], dogBreeds[i], dogAges[i], dogImages[i]);

            shelter.intake(dog);
        }


    }


    public void draw() {
        background(BACKGROUND_COLOR);
        /* TODO:  Display all the dogs in the shelter */
        /* Hint: use fantasy driven design. Pretend the shelter class has a method to display its dogs and call it. */
        /* You can worry about the details later when you design the Shelter class */


    }


}
