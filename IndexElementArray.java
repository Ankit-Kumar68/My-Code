import java.util.Scanner;
public class IndexElementArray {
    public static int index(int arr[], int key){
        for(int i = 0; i <arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
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
        System.out.println("Enter the search of Element:");
        int key = sc.nextInt();
        int index = index(arr,key);
        if(index != -1){
            System.out.println("Enter the array index" +index);
        } else {
            System.out.println("Enter the not array index:");
        }
    }
}
