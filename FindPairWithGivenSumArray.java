import java.util.Scanner;
public class FindPairWithGivenSumArray {
    public static void findpair(int arr[], int target){
        boolean found = false;
        for(int i = 0; i <arr.length; i++){
            for(int j = i + 1; j <arr.length; j++){
                if(arr[i] + arr[j] == target){
                    System.out.println("Pair Found: " + arr[i] + " " + arr[j]);
                    found = true;
                }
            }
        }
        if(!found){
            System.out.println("No Pair Found");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        findpair(arr, target);
    }
}
