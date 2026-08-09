public class SubArraySumEqualkArray {
    public static int subarraySum(int arr[], int k){
        int count = 0;
        for(int i = 0; i <arr.length; i++){
            int sum = 0;
            for(int j = i; j <arr.length; j++){
                sum = sum + arr[j];
                if(sum == k){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 1};
        int k = 3;
        int result = subarraySum(arr, k);
        System.out.println("Number Of Subarrays =" +result);
    }
}
