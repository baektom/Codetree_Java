import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < 2; i++) {
            for (int a = 0; a < n; a++) {
                for (int b = 1; b <= n; b++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}