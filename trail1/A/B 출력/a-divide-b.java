import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int div = a % b;
        System.out.print(a/b + ".");
        for (int i = 1; i < 21; i++) {
            div *= 10;
            System.out.print(div/b);
            div %= b;
        }
    }
}