public class Program62 {
    public static void main(String[] args) {
        int arr[]= {5,10,6,7,3};
        int max = arr[0];


        for(int i = 1;i<=4;i++){
           
            if(arr[i]>=max){
                max = arr[i];
            }
         }
         System.out.println(max);
         

    }
}
