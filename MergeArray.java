import java.util.Scanner;
public class MergeArray {
    public static int[] mergeArray(int[]a,int[]b){
        int[] c = new int[a.length + b.length];
        for(int i = 0; i < a.length; i++){
            c[i] = a[i];
        }
        for(int i = 0; i < b.length; i++){
            c[a.length + i] = b[i];
        }
        return c;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter the first array Element:");
        for(int i = 0; i < n1; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter the second array size: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter the second array Element:");
        for(int i = 0; i < n2; i++){
            arr2[i] = sc.nextInt();
        }
        int[] result = mergeArray(arr1,arr2);
        System.out.println("Merged Array: ");
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i]+" ");
        }
    }
}
