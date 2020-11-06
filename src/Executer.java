import java.util.InputMismatchException;
import java.util.Scanner;

public class Executer {

    public static void main(String[] a) {
        System.out.println("How many numbers to detect?");
        int count;

        while (true) {
            try {
                Scanner scn = new Scanner(System.in);
                count = scn.nextInt();
                if(count == -1){
                   throw new NullPointerException("Exiting....");
                }
                else if (count < -1) {
                    throw new InputMismatchException();
                }
                for (int i = 1; i <= count; i++) {
                    System.out.println("Enter number to check for prime or -1 to exit");
                    PrimeDetector.number(scn.nextInt());
                }
                break;
            } catch (InputMismatchException exception) {
                System.out.println("Please enter a valid integer Or -1 to exit ");
            } catch (NullPointerException exception) {
                System.out.println(exception.getMessage());
                break;
            }
            finally {
                System.out.println("Thank you.");
            }

        }


    }

}
