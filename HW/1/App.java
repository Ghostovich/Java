//Написать программу вычисления n-ого треугольного числа
// tn = 0,5*n*(n+1), n=1,2,3..

import java.util.*;

public class App {
  private static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    int n = getNumberByUser("Введите n: ");
    double result = getTN(n);
    System.out.println(result);

  }

  // 2.0 Ввод числа
  static int getNumberByUser(String text) {
    System.out.print(text);
    return input.nextInt();
  }

  // 2.5 Получение кол-ва четных чисел
  static double getTN(int n) {
    double tn = 0.5 * n * (n + 1);
    // * n * (n + 1)
    return tn;
  }
}
