import java.util.Scanner;
public class MostFrequentElementArray {
    public static void mostfrequent(int arr[]){
        int maxcount = 0;
        int element = arr[0];
        for(int i = 0; i <arr.length; i++){
            int count = 0;
            for(int j = 0; j <arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count > maxcount){
                maxcount = count;
                element = arr[i];
            }
        }
        System.out.println("Most Frequent Element =" +element);
        System.out.println("Frequency =" +maxcount);
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
        mostfrequent(arr);
    }
}
