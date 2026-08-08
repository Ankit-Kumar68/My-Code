import java.util.Arrays;
public class ShortArray {
    public static void main(String[] args){
        int[] arr = {4,5,1,3,-2,5};
        print(arr);
        Arrays.sort(arr);
        print(arr);
    }
    public static void print(int[] arr){
        for(int i = 0; i <arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
