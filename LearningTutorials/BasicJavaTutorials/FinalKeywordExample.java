package LearningTutorials.BasicJavaTutorials;

public class FinalKeywordExample {
    public static void main(String[] args) {
        
        //Anything declared as final cannot be changed or updated.
        //Remains constant
        //Always Upper case constants


        final double PI = 3.14; // cannot be changed no more

        //PI = 4       //Will not work because it is final.

        System.out.println(PI);

    }
}
