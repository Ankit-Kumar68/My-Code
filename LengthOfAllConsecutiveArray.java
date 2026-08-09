import java.util.Scanner;
public class LengthOfAllConsecutiveArray {
    public static void printConElementlength(int arr[]){
        int count = 1;
        for(int i = 0; i <arr.length - 1; i++){
            if(arr[i + 1] - arr[i] == 1){
                count++;
            } else {
                System.out.println(count);
                count = 1;
            }
        }
        System.out.println(arr[arr.length - 1]);
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
        printConElementlength(arr);
    }
}
