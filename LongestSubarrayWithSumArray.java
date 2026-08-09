
public class LongestSubarrayWithSumArray {
    public static int longestSubarray(int arr[], int target){
        int start = 0;
        int sum = 0;
        int maxlength = 0;
        for(int end = 0; end <arr.length; end++){
            sum += arr[end];
            while(sum > target){
                sum -= arr[start];
                start++;
            }
            if(sum == target){
                int length = end - start + 1;
                if(length > maxlength){
                    maxlength = length;
                }
            }
        }
        return maxlength;
    }
    public static void main(String[] args){
        int[] arr = {1, 2, 1, 1, 1, 3, 2};
        int target = 5;
        int result = longestSubarray(arr, target);
        System.out.println("Longest Subarray length =" +result);
    }
}
