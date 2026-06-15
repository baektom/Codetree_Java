import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int cnt = 0;
        for (int i = a; i <= b; i++) {
            if (i % c == 0) {
                cnt++;
            }
        }
        if (cnt >= 1) System.out.print("YES");
        else System.out.print("NO");    
    }
}