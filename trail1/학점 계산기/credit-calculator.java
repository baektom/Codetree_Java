import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n];
        double sum = 0, cnt = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
            sum += arr[i];
            cnt++;
        }
        double avg = sum/cnt;
        if (avg >= 4.0) System.out.printf("%.1f \nPerfect", avg);
        else if (avg >= 3.0) System.out.printf("%.1f \nGood", avg);
        else System.out.printf("%.1f \nPoor", avg);
    }
}