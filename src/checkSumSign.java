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