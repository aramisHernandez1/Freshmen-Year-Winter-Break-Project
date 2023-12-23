package LearningTutorials;

import java.util.ArrayList;

public class ArrayListExample {

    // ArrayList = a resizeable array.
    // Elements can be added and removed after compliation phase
    // Stores reference data types.
    public static void main(String[] args) {
        //Need to use the wrapper class
        ArrayList<Integer> sales = new ArrayList<Integer>();
        sales.add(100);
        sales.add(500);
        sales.add(20000);

        System.out.println(sales.toString());

        sales.set(2, 750);

        //OR

        for(int i = 0; i < sales.size(); i++){
            System.out.println(sales.get(i));
        }
    }
}
