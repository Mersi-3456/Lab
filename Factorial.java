class Factorial {

    public static long compute(int n) {

        if (n < 0) {
            throw new IllegalArgumentException("Please enter the correct number");
        }

        long result = 1;

        for (int i = 2; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    public static void main(String[] args) {

        int number = 5;

        System.out.println("The factorial of " + number + " is " + compute(number));
    }
}