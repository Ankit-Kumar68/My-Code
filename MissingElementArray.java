import java.util.Scanner;
public class MissingElementArray {
    public static void findmissing(int arr[], int n){
        for(int i = 0; i < n; i++){
            boolean found = false;
            for(int j = 0; j <arr.length; j++){
                if(arr[j] == i){
                    found = true;
                    break;
                }
            }
            if(!found){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of N: ");
        int n = sc.nextInt();
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array element:");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Missing Elements:");
        findmissing(arr,n);
    }
}
