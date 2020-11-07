import java.util.InputMismatchException;
import java.util.*;

public class PrimeDetector {
    public static void numberInput() {
        System.out.println("How many numbers to detect?");
        int count;

        while (true) {
            try {
                Scanner scn = new Scanner(System.in);
                count = scn.nextInt();
                if (count == -1) {
                    throw new NullPointerException("Exiting....");
                } else if (count < -1) {
                    throw new InputMismatchException();
                }
                for (int i = 1; i <= count; i++) {
                    System.out.println("Enter number to check for prime or -1 to exit");
                    number(scn.nextInt());
                }
                break;
            } catch (InputMismatchException exception) {
                System.out.println("Please enter a valid integer Or -1 to exit ");
            } catch (NullPointerException exception) {
                System.out.println(exception.getMessage());
                break;
            }
        }
        System.out.println("Thank You");
    }


        private static void number ( int number) throws NullPointerException {
            if (number == -1) {
                throw new NullPointerException("Exiting....");
            } else if (number < 1) {
                System.out.println("Enter a valid number");
                number(new Scanner(System.in).nextInt());
            } else {
                for (int div = 2; div * div <= number; div++) {
                    if (number % div == 0) {
                        System.out.println(" The number is not a prime.");
                        return;
                    }
                }
                System.out.println(" The number is prime.");
            }
        }

    }