import java.util.ArrayList;
public class ArrayListInJavaBasic {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(25);
        arr.add(21);
        arr.add(18);
        arr.add(10);
        arr.add(5);

        System.out.println(arr.get(2));
        arr.set(3,50);

        System.out.println(arr);
        int n = arr.size(); // arr.length
        for(int i = 0; i <n; i++){
            System.out.print(arr.get(i)+" ");
        

            arr.remove(arr.size()-1);
            System.out.println(arr);

        }
    }
}
