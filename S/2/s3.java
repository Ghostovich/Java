import java.io.*;

// Напишите метод, который составит строку,
// состоящую из 100 повторений слова TEST и метод,
// который запишет эту строку в простой текстовый файл, обработайте исключения.

public class s3 {
    public static void main(String[] args) {
        String line = "Test";
        String resultLine = repeatString(line);
        fillFile("file.txt", resultLine);

    }

    public static void fillFile(String fileName, String line) {
        FileWriter fileWriter = null;
        try {
            File file = new File(fileName);

            if (file.createNewFile()) {
                System.out.println("file.created");
            } else {
                System.out.println("file.existed");
                fileWriter = new FileWriter(file, false);
                fileWriter.append(line);
                fileWriter.close();
            }
        } catch (Exception e) {
        } finally {
            try {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                System.out.println("Error");
            }

        }
    }

    public static String repeatString(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            result.append(text);
        }
        return result.toString();
    }
}
