//package leet-code-codebase;

import java.util.Scanner;

public class Maximum69Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // String str=Integer.toString(num);
        // for(int i=0;i<str.length();i++){
        //     if(str.At(i)=='6'){

        //     }

        // }
        
         int placeValue=0;
        int placevalue6=-1;
        int temp=num;
        while(temp>0){
            int rem=temp%10;
            if(rem==6){
                placevalue6=placeValue;
            }
                temp/=10;

                placeValue++;
        }
         if(placevalue6==-1)
            System.out.println("num");
            
            System.out.println(num+3*(int)Math.pow(10,placevalue6));
  
    }
}
