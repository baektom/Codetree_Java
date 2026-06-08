import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 3 && n <= 5) System.out.println("Spring");
        else if (n >= 6 && n <= 8) System.out.println("Summer");
        else if (n >= 9 && n <= 11) System.out.println("Fall");
        else System.out.println("Winter");
        
    }
}