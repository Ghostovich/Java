import java.util.*;

// Пусть дан LinkedList с несколькими элементами.
// Реализуйте метод, который вернет “перевернутый” список.

public class h1 {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("2");
        list.add("3");
        list.add("4");
        System.out.println(list);
        System.out.println(reverse(list));
    }

    private static LinkedList<String> reverse(LinkedList<String> list) {
        LinkedList<String> newList = new LinkedList<>();
        for (int i = 0; i < list.size(); i++) {
            String element = list.get(i);
            newList.addFirst(element);
        }
        return newList;
    }
}