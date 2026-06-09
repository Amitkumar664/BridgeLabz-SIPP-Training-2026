import java.util.*;
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<String> str = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                // System.out.println("FizzBuzz");
                str.add("FizzBuzz");



            }
            else if(i%3==0){
                // System.out.println("Fizz");
                str.add("Fizz");
            }
            else if(i%5==0){
                // System.out.println("Buzz");
                str.add("Buzz");
            }
            else{
                // System.out.println(i);
                str.add(String.valueOf(i));
            }
        }
        System.out.println(str);
    }
    
}
