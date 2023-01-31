//Написать программу вычисления n-ого треугольного числа
// tn = 0,5*n*(n+1), n=1,2,3..

import java.util.*;

public class one {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n = getNumberByUser("Введите n: ");
        double result = getTN(n);
        System.out.println(result);
    }

    static int getNumberByUser(String text) {
        System.out.print(text);
        return input.nextInt();
    }

    static double getTN(int n) {
        double tn = 0.5 * n * (n + 1);
        return tn;
    }
}