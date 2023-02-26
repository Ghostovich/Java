import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. 
// Критерии фильтрации можно хранить в Map. Например:
// “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …
// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

public class Marketplace {
  private static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    List<Notebook> notebooks = new ArrayList<>();

    Notebook notebook = new Notebook(16, 512, "Windows", "Черный",
        "Acer", (float) 3, "Turbo");
    notebooks.add(notebook);

    notebook = new Notebook(8, 256, "IOS", "Белый",
        "Macbook", (float) 2.5, "3");
    notebooks.add(notebook);

    notebook = new Notebook(16, 1024, "Windows", "Серебристый",
        "HP", (float) 3.5, "Pavillion");
    notebooks.add(notebook);

    notebook = new Notebook(24, 2048, "Windows", "Фиолетовый хром",
        "DEXP", (float) 4.3, "Hyper");
    notebooks.add(notebook);

    changeCritery("Выберите критерий поиска: \n 1 - по объёму опреративной памяти\n" +
        " 2 - по объёму жесткого диска\n 3 - по частоте процессора\n 4 - показать все", notebooks);
  }

  private static void changeCritery(String text, List<Notebook> notebooks) {
    System.out.println(text);
    System.out.print("Ввод: ");
    Integer num = input.nextInt();
    System.out.println();

    if (num == 1) {
      System.out.print("Введите размер оперативной памяти в гигабайтах: ");
      Integer ram = input.nextInt();
      System.out.println();
      for (Notebook notebook : notebooks) {
        if (ram == notebook.getOperativeMemory()) {
          System.out.println("Вам подходит: ");
          System.out.println();
          System.out.println(notebook);
        }
      }
    }

    if (num == 2) {
      System.out.print("Введите размер жесткого диска в гигабайтах: ");
      Integer hdd = input.nextInt();
      System.out.println();
      for (Notebook notebook : notebooks) {
        if (hdd == notebook.getHddSize()) {
          System.out.println("Вам подходит: ");
          System.out.println();
          System.out.println(notebook);
        }
      }
    }

    if (num == 3) {
      System.out.print("Введите значение частоты процессора в герцах: ");
      Float cpu = input.nextFloat();
      System.out.println();
      for (Notebook notebook : notebooks) {
        if (cpu == notebook.getSpeedCPU()) {
          System.out.println("Вам подходит: ");
          System.out.println();
          System.out.println(notebook);
        }
      }
    }

    if (num == 4) {
      for (Notebook nt : notebooks) {
        System.out.println(nt);
      }
    }
  }
}
