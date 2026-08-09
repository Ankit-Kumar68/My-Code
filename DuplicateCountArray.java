import java.util.Scanner;
public class DuplicateCountArray {
    public static void countduplicate(int arr[]){
        int duplicatecount = 0;
        for(int i = 0; i <arr.length; i++){
            boolean isDuplicate = false;
            for(int j = 0; j < i; j++){
                if(arr[i] == arr[j]){
                    isDuplicate = true;
                    break;
                }
            }
            if(isDuplicate){
                continue;
            }
            int count = 0;
            for(int k = 0; k <arr.length; k++){
                if(arr[i] == arr[k]){
                    count++;
                }
            }
            if(count > 1){
                duplicatecount++;
            }
        }
        System.out.println("Total Duplicate Element =" +duplicatecount);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array Element:");
        for(int i = 0; i <arr.length; i++){
            arr[i] = sc.nextInt();
        }
        countduplicate(arr);
    }
}
