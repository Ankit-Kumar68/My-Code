public class MissingArray {
    public static int missingArray(int arr[]){
        int n = arr.length + 1;
        int sum = n*(n+1)/2;
        int arraysum = 0;
        for(int ele : arr){
            arraysum += ele;
        }
        return sum - arraysum;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,5};
        System.out.println(missingArray(arr));
    }
}
