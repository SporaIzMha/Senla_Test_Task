import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanNum = new Scanner(System.in);
        int number;
        int tmp;
        boolean flag;

        flag = true;
        System.out.print("Введите целое число: ");
        if (scanNum.hasNextInt()) {
            number = scanNum.nextInt();
            if (number % 2 == 0) {
                System.out.println("Введённое число является чётным");
            } else {
                System.out.println("Введённое число не является чётным");
            }
            for (int i = 2; i < number; i++) {
                tmp = number % i;
                if (tmp == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("Введённое число является простым");
            } else {
                System.out.println("Введённое число является составным");
            }
        } else {
            System.out.println("Введённое число не является целым :(");
        }
    }
}
