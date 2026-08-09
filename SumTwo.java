import java.util.Scanner;
public class SumTwo {
    public static void twosum(int arr[], int target){
        boolean found = false;
        for(int i = 0; i <arr.length; i++){
            for(int j = 0; j < i + 1; j++){
                if(arr[i] + arr[j] == target){
                    System.out.println("pair: " + arr[i] + " + " + arr[j] + " = " + target);
                    found = true;
                }
            }
        }
        if(!found){
            System.out.println("No pair found");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] arr = {1, 2, 3, 4, 5, 6};
        int target = 9;
        twosum(arr, target);
    }
}
