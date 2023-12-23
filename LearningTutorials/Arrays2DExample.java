package LearningTutorials;

import java.util.Arrays;

public class Arrays2DExample {

    //2D array = array in a array.

    public static void main(String[] args){
        

        //3 x 3
        //3 rows and 3 colums.
        String[][] cars = new String[3][3];


        //Row 0 colum 0
        cars[0][0] = "Red car"; /*
        Visual: 
        @##
        ###
        ###
        */

        cars[0][1] = "Blue car";
        /*
         *  #@#
         *  ###
         *  ###
         */

        cars[0][2] = "Green car";
        cars[1][0] = "Yellow car"; 
        cars[1][1] = "Purple car";
        cars[1][2] = "Lime car";
        cars[2][0] = "Orange car";
        cars[2][1] = "Teal car";
        cars[2][2] = "DarkGreen car";
        
        //deepToString used for nested arrays.
        System.out.println(Arrays.deepToString(cars));//Arrays method that will print whole array


        //Another way to declare array and print

        String[][] people = {
                            {"Josh", "Aj", "Dan"}, 
                            {"Joe", "Aramis", "Dave"}, 
                            {"Jean", "Amy", "Darren"}
                            };


        //Print in rows and colums
        for(int i = 0; i < people.length; i++){
            System.out.println();
            for(int j = 0; j < people.length; j++){
                System.out.print(' ' + people[i][j]);
            }
        }
    }
    
}
