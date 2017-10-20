package Lesson;
import java.util.*;
/*
Составьте программу обмена значениями двух переменнных величин.
 */
public class Lesson_000_1 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число a = ");
        a = in.nextInt();
        System.out.print("Введите число b = ");
        b = in.nextInt();

        c = a;
        a = b;
        b = c;
        System.out.print("Полученное число a = ");
        System.out.println(a);
        System.out.print("Полученное число b = ");
        System.out.print(b);
    }
}
