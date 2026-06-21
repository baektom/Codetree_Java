import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            if (a == 0) break;
            if (a % 2 == 0) a /= 2;
            else a += 3;
            System.out.print(a + " ");
        }
    }
}