import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int AAge = sc.nextInt();
        char AGender = sc.next().charAt(0);
        int BAge = sc.nextInt();
        char BGender = sc.next().charAt(0);
        if ((AAge >= 19 && AGender == 'M') || (BAge >= 19 && BGender == 'M')) System.out.println(1);
        else System.out.println(0);
    }
}