import java.util.Scanner;
public class MostLeastFrequentArray {
    public static void Leastfrequent(int arr[]){
        int mincount = arr.length;
        int element = arr[0];
        for(int i = 0; i <arr.length; i++){
            int count = 0;
            for(int j = 0; j <arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count < mincount){
                mincount = count;
                element = arr[i];
            }
        }
        System.out.println("Most Frequent element =" +element);
        System.out.println("Frequency =" +mincount);
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
        Leastfrequent(arr);
    }
}
