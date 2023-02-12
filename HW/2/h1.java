// В файле содержится строка с исходными данными в такой форме:
// {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
// Требуется на её основе построить и вывести на экран новую строку, в форме SQL запроса:
// SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND city = "Moscow";
// Для разбора строки используйте String.split. Сформируйте новую строку, используя StringBuilder. 
// Значения null не включаются в запрос.

import java.util.*;

public class h1 {
    public static void main(String[] args) {
        String string = " {\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        System.out.println(getString(string));
    }

    public static String getString(String string) {
        StringBuilder result = new StringBuilder();
        String value = null;

        result = $("SELECT * FROM students WHERE name = \"{value}\" AND country = \"Russia\" AND city = \"Moscow\"");

        String.split
        .substr(1, Length)

        if null

        for (int i = 0; i < x; i++) {
            if (i % 2 == 0) {
                result.append(a);
            } else {
                result.append(b);
            }
        }
        return result.toString();
    }
}