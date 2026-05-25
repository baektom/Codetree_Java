import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int gender = sc.nextInt();
        int adult = sc.nextInt();
        if (gender == 0) {
            if (adult >= 19) {
                System.out.println("MAN");
            } else {
                System.out.println("BOY");
            }
        } else if (gender == 1) {
            if (adult >= 19) {
                System.out.println("WOMAN");
            } else {
                System.out.println("GIRL");
            }
        }
    }
}