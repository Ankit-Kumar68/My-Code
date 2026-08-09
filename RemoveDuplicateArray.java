import java.util.Scanner;
public class RemoveDuplicateArray {
    public static void removeDuplicate(int arr[]){
        System.out.print("Array after removing duplicate: ");
        for(int i = 0; i <arr.length; i++){
            boolean isDuplicate = false;
            for(int j = 0; j < i; j++){
                if(arr[i] == arr[j]){
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate){
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 20, 30, 20, 40, 10, 50, 30};
        removeDuplicate(arr);
    }
}
