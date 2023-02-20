import java.util.ArrayList;
import java.util.List;

// Создать список типа ArrayList<String>.
// Поместить в него как строки, так и целые числа. 
// Пройти по списку, найти и удалить целые числа.

public class s3l3 {
    public static void main(String[] args) {
        List strAndNum = new ArrayList<String>();
        strAndNum.add("Москва");
        strAndNum.add(125);
        strAndNum.add("Казань");
        strAndNum.add(145);
        strAndNum.add("Омск");

        for (int i = 0; i < strAndNum.size(); i++) {
            if (strAndNum.get(i) instanceof Integer){
                strAndNum.remove(i);
                i--;
            }
        }
        System.out.println(strAndNum);
    }
}
