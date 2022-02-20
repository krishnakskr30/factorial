public class Factorial {
    private final int number;

    public Factorial(int number) {

        this.number = number;
    }

    public int calculateFactorial() {
        int iterator = 1;
        int factorialOfNumber = 1;

        while (iterator <= this.number) {
            factorialOfNumber *= iterator;
            iterator++;
        }
        return factorialOfNumber;
    }
}
