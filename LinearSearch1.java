public class LinearSearch1 {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
        int target = 5;
        boolean found = false;
        for(int i = 0; i <arr.length; i++){
            if(arr[i] == target){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("Target exist in array");
        } else {
            System.out.println("Target not exist in array");
        }
    }
}
