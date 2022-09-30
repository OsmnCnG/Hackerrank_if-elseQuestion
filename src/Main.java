import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int n;

        System.out.println("Enter Integer n:");
        n = keyboard.nextInt();


        if (n <= 100 && n >= 1) {
            if (n % 2 != 0) {
                System.out.println("Weird");
            } else {
                if (n >= 2 && n <= 5) {
                    System.out.println("Not Weird");
                } else if (n >= 6 && n <= 20) {
                    System.out.println("Weird");
                } else if (n > 20) {
                    System.out.println("Not Weird");
                }
            }
        }

    }
}