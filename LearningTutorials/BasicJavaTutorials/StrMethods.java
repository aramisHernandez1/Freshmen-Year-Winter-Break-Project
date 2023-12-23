package LearningTutorials.BasicJavaTutorials;

public class StrMethods {
    
    public static void main(String[] args) {
        
        //Some string methods. 
        String name = "Aj";

        boolean result = name.equals("Aj"); //Returns boolean value 
        System.out.println(result);

        result = name.equalsIgnoreCase("aJ"); //Ignores case sensitive.
        System.out.println(result);


        //Returns integer of the string length.
        int length = name.length();
        System.out.println(length);


        char location = name.charAt(0);// Returns char at the index passed.
        System.out.println(location);

        int index = name.indexOf("A");//Returns index of the string passed.
        System.out.println(index);

        boolean empty = name.isEmpty();//Returns bool for string is empty.
        System.out.println(empty);

        String upper = name.toUpperCase();//Returns upper case version of string and same for toLowerCase.
        System.out.println(upper);


        String trim = name.trim();//Removes all white space.
        System.out.println(trim);

        String replaced = name.replace('j', 'a'); //Will replace all old chars with all new chars.
        System.out.println(replaced);





    }
}
