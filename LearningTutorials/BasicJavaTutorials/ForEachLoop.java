package LearningTutorials;

import java.util.ArrayList;
import java.util.concurrent.Flow.Subscriber;

public class ForEachLoop {


    //for-each = traversing technique to iterate through elements in an array/collection
    //less steps, more readable
    //less flexible

    public static void main(String[] args) {
        

        String[] animals = {"Cat", "Dog", "Rat", "Bird"};
        //Colon represents "in"
        //Reads as "For each string index in animals"
        for(String i : animals){
            System.out.println(i);
        }


        ArrayList<String> food = new ArrayList<String>();
        food.add("Carrot");
        food.add("Hotdog");
        food.add("Steak");

        for(String i: food){
            System.out.println(i);
        }


    }
    
}
