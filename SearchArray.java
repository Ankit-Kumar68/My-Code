import java.util.Scanner;
public class SearchArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,5,7,10,15,20};
        System.out.print("Enter the number to search: ");
        int x = sc.nextInt();
        boolean found = false;
        for(int i = 0; i <arr.length; i++){
            if(arr[i] == x){
                found = true;
                System.out.println("Element found at index"+ i);
                break;
            }
        }
        if(!found){
            System.out.println("Enter not found");
        }
    }
}
