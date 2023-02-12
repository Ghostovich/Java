// В файле содержится строка с исходными данными в такой форме:
// {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
// Требуется на её основе построить и вывести на экран новую строку, в форме SQL запроса:
// SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND city = "Moscow";
// Для разбора строки используйте String.split. Сформируйте новую строку, используя StringBuilder. 
// Значения null не включаются в запрос.

public class h1 {
    public static void main(String[] args) {
        String string = " {\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";

        String[] values = getValues(string);
        String result = getText(values);
        System.out.println(result);
    }

    public static String[] getValues(String string) {
        String[] parts = string.split(",");

        String part1 = parts[0];
        String part2 = parts[1];
        String part3 = parts[2];
        String part4 = parts[3];

        String[] keyValue1 = part1.split(":");
        String[] keyValue2 = part2.split(":");
        String[] keyValue3 = part3.split(":");
        String[] keyValue4 = part4.split(":");

        String age = keyValue4[1];
        age = age.substring(0, age.length() - 1);
        String[] keyValue = new String[] { keyValue1[1], keyValue2[1], keyValue3[1], age };

        return keyValue;
    }

    private static String getText(String[] keyValue) {
        String text1 = "SELECT * FROM students WHERE";
        String text2 = " name = ";
        String text3 = " AND";
        String text4 = " country = ";
        String text5 = " AND city = ";
        String text6 = " AND age = ";

        String name = keyValue[0];
        String country = keyValue[1];
        String city = keyValue[2];
        String age = keyValue[3];

        StringBuilder result = new StringBuilder();
        result.append(text1);
        if (!name.contains("\"null\"")) {
            result.append(text2);
            result.append(name);
        }
        if (!country.contains("\"null\"")) {
            result.append(text3);
            result.append(text4);
            result.append(country);
        }
        if (!city.contains("\"null\"")) {
            result.append(text5);
            result.append(city);
        }
        if (!age.contains("\"null\"")) {
            result.append(text6);
            result.append(age);
        }
        return result.toString();
    }

}
