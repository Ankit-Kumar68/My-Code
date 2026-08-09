import java.util.Scanner;
public class AllConsecutiveElementArray1 {
    public static void printConElement(int arr[]){
        for(int i = 0; i <arr.length - 1; i++){
            if(arr[i + 1] - arr[i] == 1){
                System.out.print(arr[i]+" ");
            } else {
                System.out.print(arr[i]+" ");
                System.out.println();
            }
        }
        System.out.println(arr[arr.length - 1]);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array Element:");
        for(int i = 0; i <arr.length; i++){
            arr[i] = sc.nextInt();
        }
        printConElement(arr);
    }
}
