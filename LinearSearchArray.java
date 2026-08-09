public class LinearSearchArray {
    public static void main(String[] args){
        int arr[] = {2,5,3,9,18,38,36,53,5};
        int target = 5;
        boolean found = false;
        for(int i = 0; i <arr.length; i++){
            if(arr[i] == target){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("Target exists in array");
        } else {
            System.out.println("Target not exists in array");
        }
    }
}
