/**
 * Creates a sketch object, displays a window 
 * and runs your sketch inside that window. 
 * CS162 Assignment03 Shelter
 * October, 2022
 * @author Caleb Carver
 * @version 1.0
 * @since 1.0
 */
import processing.core.PApplet;
public class App {
    public static void main(String[] args) throws Exception {
        MySketch mySketch = new MySketch();
	    String[] processingArgs = {"TODO: Your Name's Sketch"};
	    PApplet.runSketch(processingArgs, mySketch);
    }               
}

