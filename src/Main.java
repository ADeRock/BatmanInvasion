public class Main {
    public static void main(String[] args) {
        int maxNumber = 10;
        int previousNumber = 0;
        int nextNumber = 1;
        int numBatmans = 10;
        System.out.println("THE ANTIMONITOR IS BEGINNING HIS ATTACK!");
        System.out.println("THE MULTIVERSE IS CRASHING, AND THE AMOUNT OF BATMANS ARE INCREASING!");
//        System.out.println("Fibonacci Series of " + numBatmans + " numbers:");
        for (int i = 0; i < numBatmans; i++) {
            Batman batman = new Batman(i + 1, 3, 8);
            Thread thread = new Thread(batman);
            thread.start();
            System.out.println("");
        }
    }
}
