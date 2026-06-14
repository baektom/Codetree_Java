import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        while (true) {
            if (!sc.hasNextInt()) break;
            int trans = sc.nextInt();
            if (!sc.hasNextInt()) break;
            int length = sc.nextInt();
            if (!sc.hasNext()) break;
            char c = sc.next().charAt(0);
            System.out.println(trans * length);
        }
    }
}   