import java.util.Scanner;

// дано четное число N>0 и символы с1 и с2
// написать метод, который вернет строоку длины N, 
// которая состоит из чередующихся символов с1 и с2, начиная с с1

public class s1 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

    }

    static int getNumberByUser(String text) {
        System.out.print(text);
        return input.nextInt();
    }

}
