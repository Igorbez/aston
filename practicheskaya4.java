import java.util.Arrays;

public class practicheskaya4 {
    public static void main(String[] args)
    {
        printThreeWords();
        checkSumSign();
        printColor(25);
        compareNumbers();
        boolean isSumInRange = isSumInRange(5, 3);
        isNumberPositive(5);
        boolean isNumberNegative = isNumberNegative(5);
        repeatString("Hello", 3);
        boolean isYearLeapYear = isYearLeapYear(2024);
        int[] array = {0, 1, 0, 1, 0};
        replaceZerosWithOnes(array);
        fillArrayWithNumbers(array);
        multiplySmallNumbers(array);
        fillDiagonalWithOnes(array);
        int[] newArray = createArrayWithInitialValue(5, 10);
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 5;
        int b = 3;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor(int value) {
        if (value < 0) {
            System.out.println("Красный");
        } else if (value >= 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 10;
        int b = 5;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean isSumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void isNumberPositive(int number) {
        if (number >= 0) {
            System.out.println(number + " is a positive number.");
        } else {
            System.out.println(number + " is a negative number.");
        }
    }

    public static boolean isNumberNegative(int number) {
        return number < 0;
    }

    public static void repeatString(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }

    public static boolean isYearLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void replaceZerosWithOnes(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else if (array[i] == 1) {
                array[i] = 0;
            }
        }
    }

    public static void fillArrayWithNumbers(int[] array) {
        int[] array1 = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        for (int value : array) {
            System.out.println(value);
        }
    }


    public static void multiplySmallNumbers(int[] array) {
        int[] numbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 6) {
                numbers[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }


    public static void fillDiagonalWithOnes(int[] array) {
        int size = 5;
        int[][] array2 = new int[size][size];
        for (int i = 0; i < size; i++) {
            array2[i][i] = 1;
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] createArrayWithInitialValue(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}
