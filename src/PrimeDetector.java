import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeDetector {
    public static void numberInput() throws NullPointerException, InputMismatchException {
        System.out.println(" Welcome to Prime Detector.");
        System.out.println("How many numbers to detect?");
        int count = Utils.inputInteger();
        for (int i = 1; i <= count; i++) {
            System.out.println("Enter number to check for prime or -1 to exit");
            number(Utils.inputInteger());
        }
        System.out.println("Do you wish to continue checking more numbers? write yes to continue..");
        Scanner scn = new Scanner(System.in);
        String checkpoint = scn.nextLine();
        if (checkpoint.equals("yes")) {
            numberInput();
        }
    }


    private static void number(int number) {
        for (int div = 2; div * div <= number; div++) {
            if (number % div == 0) {
                System.out.println(" The number is not a prime.");
                return;
            }
        }
        System.out.println(" The number is prime.");
    }
}


