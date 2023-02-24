import java.util.*;

// Реализуйте структуру телефонной книги с помощью HashMap,
// учитывая, что один человек может иметь несколько телефонов

/**
 * h1
 */
public class h1 {
    public static void main(String[] args) {
        List<String> contactNumbers = new ArrayList<>();
        Map<String, String> directory = new HashMap<String, String>();
        contactNumbers.add("8377383");
        // contactNumbers.add("8938");
        directory.put("Иванов", "43443");
        // directory.put("Иванов", new ArrayList<>().add(new String("9494")));
        // directory.put("Жеглов", contactNumbers);
        // directory.put("Шарапов", contactNumbers);
        System.out.println(directory);
    }
}