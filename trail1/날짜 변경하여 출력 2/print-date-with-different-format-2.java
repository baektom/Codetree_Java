import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] year = s.split("-");
        
        System.out.println(year[2] + "." + year[0] + "." + year[1]);
    }
}