public class LinearSearch {
    public static void main(String[] args){
        int[] arr = {2,5,3,9,18,38,36,53,5};
        int target = 5;
        boolean found = false; // false means target array me nahi hai
        for(int i = 0; i <arr.length; i++){
            if(arr[i] == target){
                found = true; // true means target array me hai
                break;
            }
        }
        if(found){
            System.out.println("Target exists in Array");
        } else {
            System.out.println("Target not exitsts in array");
        }      
    }
}
