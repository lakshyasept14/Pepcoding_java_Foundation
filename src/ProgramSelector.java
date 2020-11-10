public class ProgramSelector {
    public static void main(String[] a){
        System.out.println("Write the number corresponding to the program you want to run or type -1 to exit.");
        System.out.println("1.Prime number detector(checks if the input numbers are prime or not)");
        System.out.println("2.Prime numbers from n1 to n2(prints all prime numbers from n1 to n2.)");
        while (true) {
            try {
                int choice = Utils.inputInteger();
                if (choice == 1) {
                    PrimeDetector.numberInput();
                }
                System.out.println("Please choose correct option.");
            } catch (NullPointerException exception) {
                System.out.println(exception.getMessage());
                System.out.println("Thank You");
                break;
            }
        }
    }
}

