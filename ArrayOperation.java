public class ArrayOperation {
    public static void main(String[] args){
        int[] arr = {4,5,1,3,-2,5};
        for(int i = 0; i <arr.length; i++){
            if(i % 2 == 0){
                //even index
                arr[i] = arr[i] + 10;
            } else {
                //odd index
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println("Updating Array:");
        for(int i = 0; i <arr.length; i++){
            System.out.print(arr[i] +" ");
        }
    }
}
