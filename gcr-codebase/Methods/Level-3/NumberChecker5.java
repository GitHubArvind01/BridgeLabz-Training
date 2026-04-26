class NumberChecker5 {
    public static boolean isPerfect(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++)
            if (number % i == 0)
                sum += i;
        return sum == number;
    }

    public static boolean isAbundant(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++)
            if (number % i == 0)
                sum += i;
        return sum > number;
    }

    public static boolean isDeficient(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++)
            if (number % i == 0)
                sum += i;
        return sum < number;
    }

    public static boolean isStrong(int number) {
        int temp = number;
        int sum = 0;

        while (temp != 0) {
            int d = temp % 10;
            sum += factorial(d);
            temp /= 10;
        }
        return sum == number;
    }

    private static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++)
            fact *= i;
        return fact;
    }
}
