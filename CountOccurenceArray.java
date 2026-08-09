import java.util.Scanner;
public class CountOccurenceArray {
    public static int Countoccurence(int arr[], int key){
        int count = 0;
        for(int i = 0; i <arr.length; i++){
            if(arr[i] == key){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array element:");
        for(int i = 0; i <arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element to count: ");
        int key = sc.nextInt();
        int count = Countoccurence(arr,key);
        System.out.println("Occurence of "+ key + "=" +count);
    }
}
