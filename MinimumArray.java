public class MinimumArray {
    public static void main(String[] args){
        int[] arr = {-6,0,11,-2,23,17};
        int min = arr[0];
        for(int i = 1; i <arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
            System.out.println(min);
        }
    }
}
