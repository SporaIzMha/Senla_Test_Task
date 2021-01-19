import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanNum = new Scanner(System.in);
        int number1;
        int number2;
        int tmp;
        boolean flag;

        System.out.print("Введите целое число: ");
        number1 = scanNum.nextInt();
        System.out.print("Введите целое число: ");
        number2 = scanNum.nextInt();
        tmp = nod(number1, number2);
        System.out.println(tmp);
        tmp = nok(number1, number2);
        System.out.println(tmp);
    }
    
    public static int nod(int a, int b) {
        int minFromAandB = Math.min(a, b);
        int maxFromAandB = Math.max(a, b);
 
        for (int i = minFromAandB; i > 0; i--) {
            if ((minFromAandB % i == 0) && (maxFromAandB % i == 0)) {
                return i;
            }
        }
        return 1;
    }
    
    public static int nok(int a, int b) {
        int maxFromAandB = Math.max(a, b);
 
        for (int i = maxFromAandB; i > 0; i++) {
            if ((i % a == 0) && (i % b == 0)) {
                return i;
            }
        }
        return 0;
    }
}
