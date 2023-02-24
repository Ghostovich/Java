import java.util.HashMap;
import java.util.Map;

// Пусть дан список сотрудников: Иван, Пётр, Антон и так далее.
// Написать программу, которая найдет и выведет повторяющиеся имена 
// с количеством повторений. Отсортировать по убыванию популярности

public class h2 {
    public static void main(String[] args) {
        String[] names = new String[] { "Иван", "Николай", "Иван", "Женя", "Николай", "Иван", "Гена", "Николай",
                "Иван", "Джон", "Джон" };
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            Integer count = 1;
            if (names.contains(i)) {
                count += 1;
            }
            map.put(names[i], count);
            count = 1;
        }
        System.out.println(map);
    }
}