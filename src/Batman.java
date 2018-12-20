public class Batman implements Runnable{
    private int maxNumber;
    private int previousNumber;
    private int nextNumber;

    Batman(int a, int b, int c) {
        maxNumber = c;
        previousNumber = a;
        nextNumber = b;
    }

    public void run() {
        for (int i = 1; i <= maxNumber; ++i) {
            System.out.print(previousNumber + " ");

            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
        }

    }
}
