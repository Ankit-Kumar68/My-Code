import java.util.Scanner;
public class IntersectionOfTwoArray {
    public static void intersection(int a[], int b[]){
        System.out.print("Intersection Element: ");
        for(int i = 0; i <a.length; i++){
            for(int j = 0; j <b.length; j++){
                if(a[i] == b[j]){
                    System.out.print(a[i]+" ");
                    break;
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a[] = {1, 2, 3, 4, 5};
        int b[] = {3, 4, 5, 6, 7};
        intersection(a, b);
    }
}
