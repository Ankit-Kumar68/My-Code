import java.util.Scanner;
public class RearrangePositiveAndNegativeNumbersArray {
    public static void rearrange(int arr[]){
        int[] result = new int[arr.length];
        int index = 0;
        // Positive Number
        for(int i = 0; i <arr.length; i++){
            if(arr[i] >= 0){
                result[index++] = arr[i];
            }
        }
        // Negative Number
        for(int i = 0; i <arr.length; i++){
            if(arr[i] < 0){
                result[index++] = arr[i];
            }
        }
        // Print Result
        System.out.print("Rearranged Array: ");
        for(int num : result){
            System.out.print(num +" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2, -3, 5, -1, -7, 4, 8, -6};
        rearrange(arr);
    }
}
