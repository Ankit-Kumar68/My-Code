import java.util.Scanner;
public class RangeSumQuriesArray {
    public static int rangeSum(int arr[], int left, int right){
        int sum = 0;
        for(int i = left; i <= right; i++){
            sum = sum + arr[i];
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {2, 4, 6, 8, 10};
        int left = 1;
        int right = 3;
        int result = rangeSum(arr, left, right);
        System.out.println("Range Sum =" +result);
    }
}
