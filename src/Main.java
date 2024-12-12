import java.util.Arrays;
import java.util.Scanner;


public class Main {


    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }


    public static void checkSumSign() {
        int num1 = 6;
        int num2 = -100;
        int num3 = num1+num2;
        if(num3>0){
            System.out.println("Сумма положительная");
        }
        else if(num3<0){
            System.out.println("Сумма отрицательная");
        }
    }



    public static void printColor() {
        int value = 100;
        if(value>=101){
            System.out.println("Зеленый");
        }
        else if(value<=0){
            System.out.println("Красный");
        }
        else {
            System.out.println("Желтый");
        }
    }

    public static void compareNumbers () {
        int a = 50;
        int b = 50;

        if(a>b){
            System.out.println("a больше b");
        }
        else if(a<b){
            System.out.println("a меньше b");
        }
        else if(a==b){
            System.out.println("a равно b");
        }
    }

    static boolean sum_of_two_numbers(int a, int b) {
        return a + b >=10 && a + b <=20;
        }


    public static void testing_for_positivity(int a) {
        System.out.println(a >= 0? "Positive" : "Negative");

    }


    static boolean  integer_check(int a) {
            return a < 0;
        }


    static void  output_a_line_many_times(String line, int n) {

        for (int i = 0; i < n; i++)
            System.out.println(line);
    }


    static boolean leap_year(int year) {
        return year % 100 != 0 && year % 4 == 0 || year % 400 ==0;
    }


    public static void array_with_loop(int[] replaceValues) {
        for (int i = 0; i < replaceValues.length; i++) {
            replaceValues[i] = (replaceValues[i] > 0)? 0 : 1;
            System.out.print(replaceValues[i] + " ");
        }
    }


    public static void empty_integer_array(int size) {
        int[] fillArr = new int[size];
        for (int i = 0; i < fillArr.length; i++) {
            fillArr[i] = i + 1;
            System.out.print(fillArr[i] + " ");
        }
    }



public static void array_with_multiplication(int[] multiplyOn2) {
    for (int i = 0; i < multiplyOn2.length; i++) {
        if (multiplyOn2[i] < 6) {
            multiplyOn2[i] = multiplyOn2[i] * 2;
        }
        System.out.print(multiplyOn2[i] + " ");
    }
}




    public static void square_two_dimensional_array() {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, x = arr[i].length - 1; j < arr[i].length; j++, x--) {
                if (i == j || i == x) arr[i][j] = 1;
                else arr[i][j] = 0;
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }



public static void one_dimensional_array(int len, int initialValue) {
            int[] arr = new int[len];
            for (int i = 0; i < len; i++) {
                arr[i] = initialValue;
                System.out.print("[" + i + "]" + arr[i] + " ");
    }

}



public static void main(String[] args) {
    int[] replaceValues = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
    int[] multiplyOn2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers ();
        sum_of_two_numbers(10,10);
        testing_for_positivity(10);
        integer_check(10);
        output_a_line_many_times("ASDF",8);
        leap_year(2024);
        array_with_loop(replaceValues);
        empty_integer_array(50);
        array_with_multiplication(multiplyOn2);
        square_two_dimensional_array();
        one_dimensional_array(10,10);






}


}





