public class Program60 {
    public static void main(String[] args) {
        int[]arr=new int[5];
        arr[0]=67;
         arr[1]=15;
          arr[2]=46;
           arr[3]=48;
            arr[4]=58;
            float sum = 0;
            int i = 0;
            for(i = 0;i<=4;i++){
                sum=arr[i]+sum;

            }
            float avg =( sum/i);
            System.out.println(avg);
            
            
    }
}
