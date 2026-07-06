//package gcr-codebase;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class MapEx {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map<Integer,Integer>map=new  HashMap<>();
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        // for(int i=0;i<n;i++){
        //     map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
        // }

        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }

        


        // map.put(1,121);
        // map.put(2,255);
         System.out.println("Map: "+map);
         System.out.println(map.get(1));


      

    }

    
}
