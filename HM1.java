import java.util.Scanner;

/**
 * HM1
 */
public class HM1 {

    public static void main(String[] args) {

        factorial(4);
        // prime_number(1000);
        // System.out.println(calculator());
        
    }

       /**
     * Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n/
     */
    public static void factorial(int n) {
        int result_sum = 0;
        int result_mult = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                result_sum = result_sum + j;
                result_mult = result_mult * j;
            }  
            System.out.println();
        }
        System.out.println();
        System.out.println(String.format("Cумма чисел от 1 до %d", n));
        System.out.println(result_sum);
        System.out.println();
        System.out.println(String.format("Произведение чисел от 1 до %d", n));
        System.out.println(result_mult);
    }

    /**
    *Вывести все простые числа от 1 до 1000
    */
    public static void prime_number(int n){
        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0){
                    count += 1;
                }
            }
            if (count == 2) {
                System.out.println(i);
            }
            else {
                count = 0;
            }
        }
    }

    /**
     * Реализовать простой калькулятор
     */
    public static String calculator() {
        System.out.print("Введите число а: ");
        Scanner Number = new Scanner(System.in);
        int a = Number.nextInt();

        System.out.print("Введите действие (+,-,*,/): ");
        char c = Number.next().charAt(0);

        System.out.print("Введите число b: ");
        int b = Number.nextInt();
        
        if(c == '+') {
            String str = String.format("%d + %d = %d", a, b, (a+b));
            return str;
        } else if (c == '-') {
            String str = String.format("%d - %d = %d", a, b, (a-b));
            return str;
        } else if (c == '*') {
            String str = String.format("%d * %d = %d", a, b, (a*b));
            return str;
        } else if (c == '/') {
            String str = String.format("%d / %d = %d", a, b, (a/b));
            return str;
        } else {
            String str = "Ошибка ввода";
            return str;
        }
    }

}