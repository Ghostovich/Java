
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * s3l2
 * Заполнить список названиями планет Солнечной системы в произвольном порядке с
 * повторениями.
 * Вывести название каждой планеты и количество его повторений в списке.
 */
public class s3l2 {
    public static void main(String[] args) {
        List<String> planets = Arrays.asList("Марс", "Юпитер", "Марс", "Сатурн",
                "Венера", "Юпитер", "Марс", "Сатурн");
        List<String> planetsNames = new ArrayList<>();
        List<Integer> planetsCounts = new ArrayList<>();
        for (String planet : planets) {
            if (!planets.contains(planet)) {
                planetsNames.add(planet);
                planetsCounts.add(1);
            } else {
                int index = planetsNames.indexOf(planet);
                planetsCounts.set(index, planetsCounts.get(index)+1);
            }
        }
        for (int i = 0; i < planetsNames.size(); i++) {
            System.out.printf("%s - %d\n", planetsNames.get(i), planetsCounts.get(i));
        }
    }
}