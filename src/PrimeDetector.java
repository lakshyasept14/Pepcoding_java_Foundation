import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeDetector  {

    static void number(int number) throws  NullPointerException{
        if(number == -1){
            throw new NullPointerException("Exiting....");
        }
        else if (number < 1) {
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
