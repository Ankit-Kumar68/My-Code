import java.util.Scanner;
public class ProductOfArrayExceptSelfArray {
    public static int[] productExceptSelf(int arr[]){
        int n = arr.length;
        int[] result = new int[n];
        // Left Product
        result[0] = 1;
        for(int i = 1; i < n; i++){
            result[i] = result[i - 1] * arr[i - 1];
        }
        // Right Product
        int rightproduct = 1;
        for(int i = n - 1; i >= 0; i--){
            result[i] = result[i] * rightproduct;
            rightproduct = rightproduct * arr[i];
        }
        return result;
    }
    public static void printArray(int[] arr){
        for(int num : arr){
            System.out.print(num+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4};
        int[] ans = productExceptSelf(arr);
        System.out.print("Output: ");
        printArray(ans);
    }
}
