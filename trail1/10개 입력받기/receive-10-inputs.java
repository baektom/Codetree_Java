import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int sum = 0;
        double cnt = 0;
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 0) break;
            cnt++;
            sum += arr[i];
        }
        double avg = sum/cnt;
        System.out.printf("%d %.1f", sum, avg);
    }
}