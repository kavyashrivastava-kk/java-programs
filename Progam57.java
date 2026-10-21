public class Progam57 {
    public static void main(String[] args) {
        int [] arr = new int[5];
        arr[0]=5;
        arr[1]=8;
        arr[2]=14;
        arr[3]=9;
        arr[4]=17;
        int count = 0;
        for(int i = 0;i<=4;i++){
            if(arr[i]%2!=0){

                count++;
                
            }
           
        }
         System.out.print(count);
    }

}
