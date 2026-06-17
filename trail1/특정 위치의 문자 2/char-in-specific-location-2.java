import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        char[] arr = new char[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.next().charAt(0);
        }
        for (int i = 1; i < 10; i += 3) {
            System.out.print(arr[i] + " ");
        }
    }
}