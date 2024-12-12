
//1

public class Main {


    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }


    public static void main(String[] args) {
        printThreeWords();
    }

}




//2

public class checkSumSign {
    public static void main(String[] args) {
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
}


//3
public class Main{

    public static void main(String[] args) {
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
    }   }



//4

public class Main {

    public static void main(String[] args) {
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
}


//5


public class Main {

    public static void main(String[] args) {
        int x = 50;
        int y = 10;

        if ((x + y)>10 && (x + y)<20 ){
            System.out.println("true");
        }
        else {
            System.err.println("false");
        }
    }
}


//6
// ноль тут положительное число

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr1 = {0, -2, 4, 10, -22, 35, -14, 45};
        int pos = 0;
        int neg = 0;
        for (int x : arr1) {
            if (x >=0) {
                pos++;
            } else {
                neg++;
            }
        }

        int[] arrpos = new int[pos];
        int[] arrneg = new int[neg];

        int countpos = 0;
        int countneg = 0;
        for (int x : arr1) {
            if (x >= 0) {
                arrpos[countpos] = x;
                countpos++;
            } else {
                arrneg[countneg] = x;
                countneg++;
            }
        }

        System.out.println(Arrays.toString(arrneg) + " Отрицательные числа ");
        System.out.println(Arrays.toString(arrpos) + " Положительные числа ");
    }



}


//7

// Ноль тут будет положительным

public class Main {


    public static void main(String args[]) {
        Number[] nums = {10,-5,3,48,50, 0};

        for (Number num : nums) {
            System.out.println(num + " Является ли значение отрицательным? Ответ: " + isNegative(num));
        }
    }

    public static <T extends Number> boolean isNegative(T num) {
        return num.intValue() < 0;
    }
}


//8

public class Main {

    public static void main (String[] args) {

        String string="abc";

        int count=3;

        System.out.println("String :"+string.repeat(count));

    }
}


// 9

public class Main {

    public static void main(String args[]) {
        boolean a = true;
        boolean b = false;
        int year = 2024;
        if(year%4==0 && year%100 !=0 || year%400==0){
            System.out.println(a);
        }
        else {
            System.out.println(b);
        }



    }
}


//10

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                arr[i]++;
            else
                arr[i]--;
        }
        System.out.println(Arrays.toString(arr));
    }
}



//11
public class Main {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = i + 1;
            System.out.println(array[i]);
        }
    }
}


//12

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <6)
                arr[i]*=2;

        }

        System.out.println(Arrays.toString(arr));
    }
}


//13


public class Main {
    public static void main(String[] args) {

        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length - i - 1] = 1;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}


//14
import java.util.Scanner;

public class Main {
    public static void main(String[ ] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину массива: ");
        int len = scanner.nextInt();

        int[] array = new int[len];

        for (int i = 0; i < len; i++) {
            System.out.print("Введите элемент " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.println("Элементы массива:");
        for (int i : array) {
            System.out.println(i);
        }
    }
}


