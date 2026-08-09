import java.util.Scanner;
public class PrefixSumArray {
    public static void prefixSum(int arr[]){
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for(int i = 1; i <arr.length; i++){
            prefix[i] = prefix[i - 1] + arr[i];
        }
        System.out.println("Prefix Sum Array:");
        for(int i = 0; i <prefix.length; i++){
            System.out.print(prefix[i] + " ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {2, 4, 6, 8, 10};
        prefixSum(arr);
    }
}
