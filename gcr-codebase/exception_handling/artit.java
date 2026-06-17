
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;



public class artit {
    static void method1(){

    }
    public static void main(String[] args) {
        // System.out.println(2/0);
        // String s=null;
        // System.out.println(s.length());\
        // //try catch
        try {
            System.out.println(2/0);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        }
        // String s=null;
        // System.out.println(s.length());

        try {
            String s=null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }
       
        // public class newMethod(){

        // FileReader file = new File("test.txt");
        // InputStringReader reader = new InputStringReader(file);

        // }
        static void calculateRext(){
            File file = new File("test.txt");
           
            // InputStreamReader reader = new InputStreamReader(file);
            FileReader reader = new FileReader(file);
        }
    }
}
