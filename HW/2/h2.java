import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

// Реализуйте алгоритм сортировки пузырьком числового массива, 
// результат после каждой итерации запишите в лог-файл.

public class h2 {
    private static Logger logger = Logger.getLogger(h2.class.getName());

    public static void main(String[] args) {
        Integer[] array = { 6, 9, 3, 5, 8 };
        Integer[] newArray = sorting(array);
        System.out.println(Arrays.toString(array));
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
                    // logger.log(Level.INFO, Integer.toString(temp));
                }
            }
        }

        // for (int i = 0; i < 10; i++) {
        // logger.log(Level.INFO, Integer.toString(i));
        // }
        System.out.println(Arrays.toString(array));
        return array;
    }
}
