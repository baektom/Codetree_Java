import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        if (n >= 90 && b >= 95) System.out.println(100000);
        else if (n >= 90 && b >= 90) System.out.println(50000);
        else System.out.println(0);        
    }
}