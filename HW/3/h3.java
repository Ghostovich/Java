// Задан целочисленный список ArrayList. 
// Найти минимальное, максимальное и среднее арифметичское этого списка

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class h3 {
    static Random random = new Random();
    public static void main(String[] args) {
        List<Integer> randomNumbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            randomNumbers.add(random.nextInt(0,100));
        }
        System.out.println(randomNumbers);
        Integer min = randomNumbers.get(0);
        Integer max = randomNumbers.get(0);
        double sum = 0;
        for (int i = 0; i < randomNumbers.size(); i++) {
            for (int num : randomNumbers) {
                if (num < min) {
                    min = num;
                }
                if (num > max) {
                    max = num;
                }
            }
        }
        for (int i = 0; i <randomNumbers.size(); i++) {
            sum += randomNumbers.get(i);
        }
        double midSum = sum/randomNumbers.size();
        System.out.println("Минимальное: " + min);
        System.out.println("Максимальное: " + max);
        System.out.println("Среднее арифметическое: " + midSum);
    }
}

