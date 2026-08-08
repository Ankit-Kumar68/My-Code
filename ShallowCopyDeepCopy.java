public class ShallowCopyDeepCopy {
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50};
        int[] x = arr; // x is shallow copy of arr
        x[0] = 100;
        System.out.println(arr[0]);
    }
}
