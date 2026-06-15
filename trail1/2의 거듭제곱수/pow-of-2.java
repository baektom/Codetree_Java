import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        while (true) {
            if (n % 2 == 0) n /= 2;
            cnt++;
            if (n == 1) break;
        }
        System.out.print(cnt);
    }
}