package LearningTutorials.BasicJavaTutorials;

public class OverLoadedMethods {

    // overloaded methods = methods that share the same name but have different parameters.
    //                      method name + paramters = method signature.


    public static void main(String[] args) {
        
        int num = add(0, 0); //Method 1
        num  = add(1, 2, 0); //Method 2
        System.out.println(num);
    }

    //Need to be static due to main 

    private static int add(int a, int b){
        return a + b;
    }

    private static int add(int a, int b, int c){
        return a + b + c;
    }
}
