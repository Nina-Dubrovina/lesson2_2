//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//ДЗ по лекции 2, Дубровина Нина

        printThreeWords(); //вызов метода для задания 1

        int a = 2; //объявление переменных и вызов метода для задания 2
        int b = -3;
        checkSumSign(a, b);

        int value = 102; //для задания 3
        printColor(value);

        int c = -200; // для задания 4
        int d = -3;
        compareNumbers(c, d);

        int e = 11; // для задания 5
        int g = 8;
        if (checkSum(e, g)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        int h = -4; // для задания 6
        opredPolozhit(h);

        int i = -8; // для задания 7
        if (opredPolozhitFalse(i)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }


        String string = "Привет!"; // для задания 8
        int times = 4;
        printWordSomeTimes(string, times);

        int year = 2100;  //для задания 9
        if (happyYear(year)) {
            System.out.println(year + "  true");
        } else {
            System.out.println(year + " false");
        }

        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};  //для 10 задания
        for (int k = 0; k < arr.length; k++) {
            if (arr[k] == 0) {
                arr[k] = 1;
            } else {
                arr[k] = 0;
            }
        }
        System.out.println("\nЗадание 10");
        System.out.println("Измененный массив");
        printArr(arr);

        //для задания 11
        int[] array = new int[100];
        for (int l = 0; l < array.length; l++) {
            array[l] = l + 1;
        }

        System.out.println("Задание 11");
        printMassiv(array);

        //для задания 12
        int[] arr1 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("\nЗадание 12");
        printMassivUmnozh(arr1);

        //для 13 задания
        int size = 5;
        int[][] arr2 = new int[size][size];
        for (int n = 0; n < arr2.length; n++) {
            arr2[n][n] = 1;
        }
        System.out.println("\nЗадание 13");
        printMassivDvumern(arr2);

        //для задания 14
        int len = 3;
        int initialValue = 2;
        int[] massiv2 = Arr3(len, initialValue);
        for (int r = 0; r < massiv2.length; r++) {

            System.out.println(massiv2[r]);
        }

    }


    // задание 1: вывод построчно трех слов
    public static void printThreeWords() {

        String text = "Orange Banana Apple";
        String[] words = text.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
    }

    // задание 2: вывод полижительного / отрицательного результата сложения двух переменных

    public static void checkSumSign(int a, int b) {

        int sum = a + b;
        if (sum < 0) {
            System.out.println("Сумма отрицательная");
        } else {
            System.out.println("Сумма положительная");
        }
    }

// задание 3: сравнение пременной с диапазоном чисел

    public static void printColor(int value) {

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else if (value > 100) // при указании в данном случае else вместо else if программа ругалась. Так и не поняла, почему
        {
            System.out.println("Зеленый");

        }
    }

    //задание 4: сравнение значений переменных а и б между собой

    public static void compareNumbers(int c, int d) {

        if (c >= d) {
            System.out.println("c >= d");
        } else {
            System.out.println("c < d");
        }
    }

    //задание 5: сравнение суммы двух переменных с заданным диапазоном
    public static boolean checkSum(int e, int g) {
        System.out.println("\nЗадание 5");
        int sum = e + g;
        return (sum >= 10 && sum <= 20);
    }


    //задание 6. Определение положительного/отрицательного числа
    static void opredPolozhit(int h) {
        System.out.println("\nЗадание 6");
        if (h >= 0) System.out.println("Число " + h + " положительное");
        else System.out.println("Число " + h + " отрицательное");
    }

    //задание 7: написать метод, которому в качестве параметра передается целое число; вернуть true, если отрицательное, false - если положительное.
    static boolean opredPolozhitFalse(int i) {
        System.out.println("\nЗадание 7");
        if (i < 0) return true;
        return false;
    }

    //задание 8: аргументы: строка и число, метод выводит в консоль указанную строку указанное количество раз;
    public static void printWordSomeTimes(String string, int times) {
        System.out.println("\nЗадание 8");
        for (int j = 0; j < times; j++) {
            System.out.println(string);
        }
    }

    // задание 9 с високосными годами

    public static boolean happyYear(int year) {
        System.out.println("\nЗадание 9");
        if ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
    //задание 10: Задать целочисленный массив, состоящий из элементов 0 и 1. Заменить 0 на 1, 1 на 0

    public static void printArr(int[] arr) {
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();
    }


    //задание 11: массив из 100 чисел
    public static void printMassiv(int[] array) {
        for (int l = 0; l < array.length; l++) {
            System.out.print(array[l] + "");

        }
        System.out.println();
    }

    //задание 12: массив, значения в котром менее 6, умножаются на 2
    public static void printMassivUmnozh(int[] arr1) {
        for (int m = 0; m < arr1.length; m++) {
            if (arr1[m] < 6) {
                arr1[m] = arr1[m] * 2;
            }
            System.out.print(arr1[m] + "");
        }
    }

    //задание 13: заполнение диагонали матрицы 1-ками
    public static void printMassivDvumern(int[][] arr2) {

        for (int n = 0; n < arr2.length; n++) {
            for (int p = 0; p < arr2[n].length; p++) {

                System.out.println(arr2[n][p] + " ");
            }
            System.out.println();
        }
    }

    //задание 14 : возвращение одномерного массива
    public static int[] Arr3 (int length, int initialValue) {
        int[]arr4 = new int[length];
        for (int r = 0; r < length; r++) {
            arr4[r] = initialValue;
        }
        return arr4;
    }

}
