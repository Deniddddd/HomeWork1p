import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner conversion = new Scanner(System.in);
        double mil = 1.6;
        System.out.println("Введите значение:");
        double sum = conversion.nextDouble();
        double converted = mil*sum;
        System.out.println("Конвертація милі в кілометрів "+converted);
        System.out.println("Гарного дня");
    }
}
