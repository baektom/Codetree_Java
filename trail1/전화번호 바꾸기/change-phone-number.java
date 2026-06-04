import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] phone = s.split("-");
        
        System.out.println(phone[0] + "-" + phone[2] + "-" + phone[1]);
    }
}