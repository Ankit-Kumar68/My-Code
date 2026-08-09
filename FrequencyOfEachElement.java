import java.util.Scanner;
public class FrequencyOfEachElement {
    public static void frequency(int arr[]){
        boolean visited[] = new boolean[arr.length];
        for(int i = 0; i <arr.length; i++){
            if(visited[i]){
                continue;
            }
            int count = 1;
            for(int j = i + 1; j <arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(arr[i] +" ->" +count);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = {10, 20, 10, 30, 20, 10, 40};
        frequency(arr);
    }
}
