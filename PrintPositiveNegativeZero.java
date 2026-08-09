import java.util.Scanner;
public class PrintPositiveNegativeZero {
    public static void printElements(int arr[]){
        System.out.print("Positive elements: ");
        for(int i = 0; i <arr.length; i++){
            if(arr[i] > 0){
                System.out.print(arr[i] +" ");
            }
        }
        System.out.print("Negative elements: ");
        for(int i = 0; i <arr.length; i++){
            if(arr[i] < 0){
                System.out.print(arr[i] +" ");
            }
        }
        System.out.print("Zero elements: ");
        for(int i = 0; i <arr.length; i++){
            if(arr[i] == 0){
                System.out.print(arr[i] +" ");
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements");
        for(int i = 0; i <arr.length; i++){
            arr[i] = sc.nextInt();
        }
        printElements(arr);
    }
}
