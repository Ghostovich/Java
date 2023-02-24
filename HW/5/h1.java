import java.util.*;

// Реализуйте структуру телефонной книги с помощью HashMap,
// учитывая, что один человек может иметь несколько телефонов

/**
 * h1
 */
public class h1 {
    public static void main(String[] args) {
        Map<String, String> directory = new HashMap<String, String>();
        String contactNumsIvanov = new String("89201408789" + ", " + "8910284891");
        String contactNumsPonomarenko = new String("89208748789" + ", " + "891054891" + ", " + "8912342391");
        directory.put("Иванов", contactNumsIvanov);
        directory.put("Жеглов", "823930930");
        directory.put("Пономаренко", contactNumsPonomarenko);
        System.out.println(directory);
    }
}
