import java.util.Scanner;
public class LargestConsecutiveArray {
    public static void printLargestConElement(int arr[]){
        int count = 1;
        int max = 0;
        int ei = 0;
        int si = 0;
        for(int i = 0; i <arr.length - 1; i++){
            if(arr[i + 1] - arr[i] == 1){
                count++;
            } else {
                if(count > max){
                    max = count;
                    ei = i;
                }
                count = 1;
            }
        }
        if(count > max){
            max = count;
            ei = arr.length - 1;
        }
        si = ei - max + 1;
        for(int i = si; i <=ei; i++){
            System.out.print(arr[i]+" ");
        }
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
        printLargestConElement(arr);
    }
}
