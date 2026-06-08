import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int AMath = sc.nextInt();
        int AEng = sc.nextInt();
        int BMath = sc.nextInt();
        int BEng = sc.nextInt();
        if (AMath > BMath) System.out.println("A");
        else if (AMath < BMath) System.out.println("B");
        else if (AMath == BMath){
            if (AEng > BEng) System.out.println("A");
            else if (AEng < BEng) System.out.println("B");
        }
    }
}