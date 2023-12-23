package LearningTutorials.BasicJavaTutorials;

public class Arrays {

    // array = used to store multiple values in a singl variable. 

    public static void main(String[] args) {
        //How to make an array

        //Add [] after data type
        //EX: String[] variable

        //Assign the values with {}.
        //EX: String[] people = {"Josh", "Joe", "Amy"};
        String[] cars = {"Camaro", "Corvette", "Tesla"};

        //How to access elements 
        //Use index in []
        //EX: Varaiable[index]
        
        System.out.println(cars[0]);
        cars[0] = "Mustang";    //Note: Java starts at index 0
        System.out.println(cars[0]);


        //NOTE: When assigning values they all have to be the same value.
        //Data types need to be consistent.

        //Another way to write an array.

        //                  List how long you want array to be.
        String[] people = new String[3];
        people[0] = "Josh";
        people[1] = "Dave";
        people[2] = "Bob";

        //Display each element.

        for(int i = 0; i < 3; i++){
            System.out.println(people[i]);
        }
    }
}
