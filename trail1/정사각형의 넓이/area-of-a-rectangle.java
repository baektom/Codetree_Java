import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a < 5) System.out.println((a*a) + "\n" + "tiny");
        else System.out.println(a*a);
    }
}