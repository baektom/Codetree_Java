import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[4];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < 4; j++) {
                // System.out.println("* ");
                arr[j] = sc.nextInt();
                sum += arr[j];
            }
            int avg = sum/4;
            if (avg >= 60) {
                cnt++;
                System.out.println("pass");
            } else System.out.println("fail");
        }
            System.out.println(cnt);
    }
}