package LearningTutorials.BasicJavaTutorials;

public class ForLoop {
    public static void main(String[] args) {
        
        //Count from 0-10

        //     index   condition count
        for(int i = 0; i<=10;    i++){ 
            System.out.println(i);
        }

        //Count down 10-0
        //Then say happy new year.
        for(int i = 10; i>= 0; i--){
            System.out.println(i + "...");
        }
        System.out.println("Happy New Year!");


        for(int i = 10; i>= 0;){//Can move counter to inside the for loop like this.
            System.out.println(i + "...");//Is the samething just a different way to do it.
            i--;
        }
        System.out.println("Happy New Year!");

    }
}
