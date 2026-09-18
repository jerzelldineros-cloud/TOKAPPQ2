package QUARTER2;

import org.junit.Test;

public class DinerosProfile {

    @Test
    public void printMyProfile() {
        String myName = "Jerzell Lourisse R. Dineros";
        String petName = "Bella";
        String favFood = "omelette";
        int myAge = 16;

        System.out.println("--- MY DIGITAL PROFILE ---");
        System.out.println("Hi! My name is " + myName + " and I'm " + myAge + " years old.");
        System.out.println("I have a cute pet named " + petName + ".");
        System.out.println("My favorite food is " + favFood + " — I could eat it everyday!");
    }
}
