import java.util.InputMismatchException;
import java.util.Scanner;

public class Utils {
    public static int inputInteger() throws NullPointerException, InputMismatchException {
        int count;
        while (true) {
            try {
                Scanner scn = new Scanner(System.in);
                count = scn.nextInt();
                if (count == -1) {
                    throw new NullPointerException("Exiting....");
                } else if (count < -1 || count == 0) {
                    throw new InputMismatchException();
                }
                break;
            } catch (InputMismatchException exception) {
                System.out.println("Please enter a valid integer Or -1 to exit ");
            }
        }
        return count;
    }
}