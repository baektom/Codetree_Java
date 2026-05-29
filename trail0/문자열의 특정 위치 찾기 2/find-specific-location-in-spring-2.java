import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        String[] str = { "apple", "banana", "grape", "blueberry", "orange" };
        int cnt = 0;

        for (int i = 0; i < str.length; i++) {
            if (str[i].charAt(2) == ch || str[i].charAt(3) == ch) {
                cnt++;
            } else continue;
            System.out.println(str[i]);
        }
        System.out.println(cnt);
    }
}