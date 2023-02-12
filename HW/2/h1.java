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
        System.out.println(Show(getValue(string)));
    }

    public static String getValue(String string) {
        String name = null;
        String country = null;
        String city = null;
        String age = null;

        String.split
        .substr(1, Length)


        
        return name;
        return country;
        return city;
        return age;
    }

    public static String Show(String name, String country, String city, String age) {
        StringBuilder result = new StringBuilder();

        result = "SELECT * FROM students WHERE name ="+ name + "AND country ="+ country+" AND city ="+ city;

        if null

        return result.toString();
    }
}