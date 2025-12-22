class NumberChecker1 {
    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    public static int[] storeDigits(int number) {
        int size = countDigits(number);
        int[] digits = new int[size];

        for (int i = size - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int d : digits) {
            if (d != 0)
                return true;
        }
        return false;
    }

    public static boolean isArmstrong(int number, int[] digits) {
        int power = digits.length;
        int sum = 0;

        for (int d : digits) {
            sum += Math.pow(d, power);
        }
        return sum == number;
    }

    public static void largestSecondLargest(int[] digits) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int d : digits) {
            if (d > max) {
                secondMax = max;
                max = d;
            } else if (d > secondMax && d != max) {
                secondMax = d;
            }
        }
        System.out.println("Largest: " + max);
        System.out.println("Second Largest: " + secondMax);
    }

    public static void smallestSecondSmallest(int[] digits) {
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int d : digits) {
            if (d < min) {
                secondMin = min;
                min = d;
            } else if (d < secondMin && d != min) {
                secondMin = d;
            }
        }
        System.out.println("Smallest: " + min);
        System.out.println("Second Smallest: " + secondMin);
    }
}
