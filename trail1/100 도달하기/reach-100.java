import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int a = sc.nextInt();
        System.out.print(i + " " + a + " ");
        while (true) {
            int temp = i + a;
            i = a;
            a = temp;
            System.out.print(temp + " ");
            if (temp > 100) break;
        }
    }
}