import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        double cnt = 0;
        for (int i = 1; i <= 10; i++) {
            int a = sc.nextInt();
            if (a >= 0 && a <= 200) {
                sum += a;
                cnt++;
            }
        }
        System.out.printf("%d %.1f", sum, sum/cnt);
    }
}