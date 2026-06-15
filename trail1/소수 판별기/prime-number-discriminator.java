import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean satisfied = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) satisfied = false;
        }
        if (satisfied == true) System.out.print("P");
        else System.out.print("C");
    }
}