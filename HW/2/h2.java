import java.io.IOException;
import java.util.Arrays;
import java.util.logging.*;

// Реализуйте алгоритм сортировки пузырьком числового массива, 
// результат после каждой итерации запишите в лог-файл.

public class h2 {
    private static Logger logger = Logger.getLogger(h2.class.getName());

    public static void main(String[] args) throws SecurityException, IOException {
        Handler fileHandler = new FileHandler();
        logger.addHandler(fileHandler);
        // записывает файл по умолчанию, конфигурацию так и не сообразил как прикрутить(

        Integer[] array = { 6, 9, 3, 5, 8 };
        System.out.println(Arrays.toString(array));
        Integer[] newArray = sorting(array);
        System.out.println(Arrays.toString(newArray));
    }

    private static Integer[] sorting(Integer[] array) {
        boolean isSorted = false;
        int temp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;

                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
                logger.log(Level.INFO, Integer.toString(array[i]));
            }
        }

        return array;
    }
}
