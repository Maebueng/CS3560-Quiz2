public class Calculator {

    public int sum(int firstNumberToAdd, int secondNumberToAdd) {
        return firstNumberToAdd + secondNumberToAdd;
    }

    public int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int multiply(int firstNumberToMultiply, int secondNumberToMultiply) {
        return firstNumberToMultiply * secondNumberToMultiply;
    }

    public int divide(int dividend, int divisor) {
        return dividend / divisor;
    }

    public boolean isEven(int value) {
        return value % 2 == 0;
    }
}
