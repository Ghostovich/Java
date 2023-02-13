// В файле содержится строка с данными:
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"}, 
// {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"}, 
// {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
// Напишите метод, который разберёт её на составные части и, 
// используя StringBuilder создаст массив строк такого вида:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

public class h3 {
    public static void main(String[] args) {
        String string = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
                "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
                "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";

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
        String part5 = parts[4];
        String part6 = parts[5];
        String part7 = parts[6];
        String part8 = parts[7];
        String part9 = parts[8];

        String[] keyValue1 = part1.split(":");
        String[] keyValue2 = part2.split(":");
        String[] keyValue3 = part3.split(":");
        String[] keyValue4 = part4.split(":");
        String[] keyValue5 = part5.split(":");
        String[] keyValue6 = part6.split(":");
        String[] keyValue7 = part7.split(":");
        String[] keyValue8 = part8.split(":");
        String[] keyValue9 = part9.split(":");

        // String age = keyValue4[1];
        // age = age.substring(0, age.length() - 1);

        String[] keyValue = new String[] { keyValue1[1], keyValue2[1], keyValue3[1],
                keyValue4[1], keyValue5[1], keyValue6[1], keyValue7[1], keyValue8[1], keyValue9[1] };

        return keyValue;
    }

    private static String getText(String[] keyValue) {

        String text1 = "Студент ";
        String text2 = " получил ";
        String text3 = " по предмету ";

        String name1 = keyValue[0].substring(1, keyValue[0].length() - 1);
        String rating1 = keyValue[1].substring(1, keyValue[1].length() - 1);
        String matter1 = keyValue[2].substring(1, keyValue[2].length() - 2);
        String name2 = keyValue[3].substring(1, keyValue[3].length() - 1);
        String rating2 = keyValue[4].substring(1, keyValue[4].length() - 1);
        String matter2 = keyValue[5].substring(1, keyValue[5].length() - 2);
        String name3 = keyValue[6].substring(1, keyValue[6].length() - 1);
        String rating3 = keyValue[7].substring(1, keyValue[7].length() - 1);
        String matter3 = keyValue[8].substring(1, keyValue[8].length() - 3);

        StringBuilder result = new StringBuilder();
        result.append(text1);
        result.append(name1);
        result.append(text2);
        result.append(rating1);
        result.append(text3);
        result.append(matter1);
        result.append("\n");
        result.append(text1);
        result.append(name2);
        result.append(text2);
        result.append(rating2);
        result.append(text3);
        result.append(matter2);
        result.append("\n");
        result.append(text1);
        result.append(name3);
        result.append(text2);
        result.append(rating3);
        result.append(text3);
        result.append(matter3);
        return result.toString();
    }
}
