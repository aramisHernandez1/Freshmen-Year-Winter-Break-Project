package LearningTutorials.BasicJavaTutorials;

import java.util.Random;

public class RandomMethods {
    //Disclaimer not full random numbers.
    //Pseudo random
    public static void main(String[] args){
        //Random class instance.
        Random random = new Random();
        
        //Generate random integer.
        //Can be any number in the integer range, around -2bill, to 2bill.
        int x = random.nextInt();
        System.out.println(x);

        //Will generate the numbers 0-5.
        x = random.nextInt(6);
        //If you want to get numbers 1-6
        //We can just add 1 such as
        x = random.nextInt(6)+1;

        //Random with doubles
        double y = random.nextDouble();
        System.out.println(y);

        //Generate random bool(true or false.)
        boolean z = random.nextBoolean();
        System.out.println(z);


    }

}
