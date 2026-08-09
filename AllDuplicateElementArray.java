import java.util.Scanner;
public class AllDuplicateElementArray {
    public static void findduplicate(int arr[]){
        System.out.println("Duplicate Elements are:");
        for(int i = 0; i <arr.length; i++){
            boolean isPrinted = false;
            // Check if already printed
            for(int j = 0; j < i; j++){
                if(arr[i] == arr[j]){
                    isPrinted = true;
                    break;
                }
            }
            if(isPrinted){
                continue;
            }
            int count = 0;
            for(int k = 0; k <arr.length; k++){
                if(arr[i] == arr[k]){
                    count++;
                }
            }
            if(count > 1){
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 20, 10, 30, 20, 30, 40, 50, 20, 40, 50};
        findduplicate(arr);
    }
}
