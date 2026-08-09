import java.util.Scanner;
public class MajorityElementArray {
    public static int majorityElement(int arr[]){
        int candidate = 0;
        int count = 0;
        // Find Candidate
        for(int num : arr){
            if(count == 0){
                candidate = num;
            }
            if(num == candidate){
                count++;
            } else {
                count--;
            }
        }
        // Verify Candidate
        count = 0;
        for(int num : arr){
            if(num == candidate){
                count++;
            }
        }
        if(count > arr.length / 2){
            return candidate;
        }
        return -1; // No Majority Element
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {2, 2, 1, 2, 3, 2, 2};
        int result = majorityElement(arr);
        if(result != -1){
            System.out.println("Majority Element =" + result);
        } else {
            System.out.println("No Majority Element");
        }
    }
}
