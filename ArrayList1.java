import java.util.ArrayList;
public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(25);
        list.add(23);
        list.add(22);
        list.add(32);
        list.add(34);
        System.out.println("ArrayList: "+ list);
        System.out.println("First Element: "+ list.get(0));
        list.remove(2);
        System.out.println("After Remove: "+ list);
        System.out.println("Size" +list.size());
    }
}
