import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            int x = sc.nextInt();
            if (x % 2 != 0 && x % 3 == 0) sum += x;
        }
        System.out.print(sum);
    }
}