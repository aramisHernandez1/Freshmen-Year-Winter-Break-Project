package LearningTutorials;

public class SwitchStatments {


    //Definition: Switch = statement that allows a variable to be tested for equality against a list of values. 
    public static void main(String[] args) {
        String day = "Friday";

        //Will check the passed value one by one for each case. if there is a match will perform code after the Colon(:)
        //If no break will perform all code as soon as match
        switch(day) {
            //What you comparing to
            case "Sunday": System.out.println("It is sunday."); //Read as if case sunday then do blank. After colon is everything you do.
            break;//Must include the break to exit this switch
            case "Monday": System.out.println("It is monday.");
            break;
            case "Tuesday": System.out.println("It is Tuesday.");
            break;
            case "Wenesday": System.out.println("It is Wenesday.");
            break;
            case "Thursday": System.out.println("It is Thursday.");
            break;
            case "Friday": System.out.println("It is Friday.");
            break;
            case "Saturday": System.out.println("It is Saturday.");
            break;
            
            default:System.out.println("That is not a day");//If no match do this.
        }

    }
}
