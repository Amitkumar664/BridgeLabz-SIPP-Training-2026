public class Frequency{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 2, 4};
        //int max=Math.(arr);
        boolean[] visited = new boolean[arr.length];
        for(int i=0;i<arr.length;i++){
            int count=1;
            if (visited[i]) {
                continue;
            ]    
               
            
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    System.out.println(arr[i]+":"+arr[j]);
                }
                visited[j]=true;
            }
        
        }
    }
}