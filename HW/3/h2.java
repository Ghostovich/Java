import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Пусть дан произвольный список целых чисел. Удалить из него чётные числа

public class h2 {
    static Random random = new Random();
    public static void main(String[] args) {
        List<Integer> randomNumbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            randomNumbers.add(random.nextInt(0,100));
        }
        System.out.println(randomNumbers);

        for (int i = 0; i < randomNumbers.size(); i++) {
            if (randomNumbers.get(i)%2==0){
                randomNumbers.remove(i);
                i--;
            }
            if (randomNumbers.get(i) == null){
                break;
            }
        }
        System.out.println(randomNumbers);
    }
}
