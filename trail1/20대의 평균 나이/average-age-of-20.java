import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        double cnt = 0;
        while (true) {
            int a = sc.nextInt();
            if (a < 20 || a >= 30) break;
            sum += a;
            cnt++;
        }
        System.out.printf("%.2f", sum/cnt);
    }
}