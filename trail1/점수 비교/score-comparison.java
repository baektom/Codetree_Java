import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a_m = sc.nextInt();
        int a_e = sc.nextInt();
        int b_m = sc.nextInt();
        int b_e = sc.nextInt();

        System.out.println((a_m > b_m && a_e > b_e) ? 1 : 0);
    }
}