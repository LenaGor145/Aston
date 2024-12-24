import java.util.Arrays;

public class Lesson2 {
    public static void main(String[] args) {
        printThreeWords();
        System.out.println();

        checkSumSign();
        System.out.println();

        printColor();
        System.out.println();

        compareNumbers();
        System.out.println();

        System.out.println(task5(5, 10));
        System.out.println();

        task6(5);
        System.out.println();

        System.out.println(task7(-3));
        System.out.println();

        task8("Привет, мир!", 3);
        System.out.println();

        System.out.println(task9(2024));
        System.out.println();

        task10();
        System.out.println();

        task11();
        System.out.println();

        task12();
        System.out.println();

        task13();
        System.out.println();

        System.out.println(Arrays.toString(task14(5, 7)));
        System.out.println();

    }

    public static void printThreeWords() {
        System.out.print("Orange\nBanana\nApple\n");
    }

    public static void checkSumSign() {
        int a = 5;
        int b = 10;
        /*if ((a + b) >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }*/
        System.out.println((a + b) >= 0 ? "Сумма положительная" : "Сумма отрицательная");
    }

    public static void printColor() {
        int value = 75;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Жёлтый");
        } else {
            System.out.println("Зелёный");
        }
    }

    public static void compareNumbers() {
        int a = 10;
        int b = 5;
        /*if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }*/
        System.out.println(a >= b ? "a >= b" : "a < b");
    }

    public static boolean task5(int a, int b) {
        return (a + b) >= 10 && (a + b) <= 20;
    }

    public static void task6(int number) {
        /*if (number >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }*/
        System.out.println(number >= 0 ? "Число положительное" : "Число отрицательное");
    }

    public static boolean task7(int number) {
        return number < 0;
    }

    public static void task8(String text, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }

    public static boolean task9(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return year % 4 == 0;
        }
    }

    public static void task10() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int arrLen = arr.length;
        for (int i = 0; i < arrLen; i++) {
            /*if (arr[i] == 1) {
                arr[i] = 0;
            } else if (arr[i] == 0) {
                arr[i] = 1;
            }*/
            arr[i] = arr[i] == 1 ? 0 : 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void task11() {
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void task12() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int arrLen = arr.length;
        for (int i = 0; i < arrLen; i++) {
            /*if (arr[i] < 6) {
                arr[i] *= 2;
            }*/
            arr[i] = arr[i] < 6 ? arr[i] *= 2 : arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void task13() {
        int n = 5;
        int[][] arr = new int[n][n];
        /*for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || j == n - 1- i) {
                    arr[i][j] = 1;
                }
            }
        }*/
        for (int i = 0; i < n; i++) {
            arr[i][i] = 1;
            arr[i][n - 1 - i] = 1;
        }
        //красывый вывод в консоль
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static int[] task14(int len, int initialValue) {
        int[] arr = new int[len];
        /*for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }*/
        Arrays.fill(arr, initialValue);
        return arr;
    }
}





