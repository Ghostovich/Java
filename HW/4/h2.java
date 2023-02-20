import java.util.LinkedList;
import java.util.Scanner;

// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.

public class h2 {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("2");
        list.add("3");
        list.add("4");
        System.out.println("Original: ");
        System.out.println(list);
        System.out.println();
        System.out.println("Enqueue: ");
        System.out.println(enqueue(list));
        System.out.println();
        System.out.println("Dequeue: ");
        dequeue(list);
        System.out.println();
        System.out.println("First: ");
        System.out.println(first(list));
    }

    private static LinkedList<String> enqueue(LinkedList<String> list) {
        LinkedList<String> newList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные: ");
        String input = scanner.nextLine();
        // enqueue() - помещает элемент в конец очереди
        for (int i = 0; i < list.size(); i++) {
            String element = list.get(i);
            newList.add(element);
        }
        newList.addLast(input);
        return newList;
    }

    private static void dequeue(LinkedList<String> list) {
        // dequeue() - возвращает первый элемент из очереди и удаляет его
        LinkedList<String> newList = new LinkedList<>();
        String firstElem = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            String element = list.get(i);
            newList.add(element);
        }
        newList.remove(0);
        System.out.println(firstElem);
        System.out.println(newList);
    }

    private static String first(LinkedList<String> list) {
        // first() - возвращает первый элемент из очереди, не удаляя
        String firstElem = list.get(0);
        return firstElem;
    }
}