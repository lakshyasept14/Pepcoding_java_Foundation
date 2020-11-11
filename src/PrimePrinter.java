public class PrimePrinter {
    public static void primePrinter(){
        System.out.println("Welcome to Prime Printer program.");
        System.out.println("Enter the lower limit of the range (n1).");
        int low = Utils.inputInteger();
        System.out.println("Enter the upper limit of the range (n2).");
        int high = Utils.inputInteger();
        for (int number = low; number <= high; number ++){
            int freq = PrimeDetector.numberDivisibility(number);
            if (freq == 0){
                System.out.println(number);
            }
        }
    }
}
