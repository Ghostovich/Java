import java.util.*;

// дано четное число N(>0) и символы с1 и с2
// написать метод, который вернет строоку длины N, 
// которая состоит из чередующихся символов с1 и с2, начиная с с1

public class s1 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n = getNumberByUser(text:'Введите четное число N(>0): ');
        char c1 = getCharByUser(text:'Введите символ с1: ');
        char c2 = getCharByUser(text:'Введите символ с2: ');
    }

    public static int getNumberByUser(String text) {
        System.out.print(text);
        return input.nextInt();
    }

    public static char getCharByUser(String text) {
        System.out.print(text);
        String c = input.next();
        return c.charAt(index:0);
    }

    public static String(){

    }
}
