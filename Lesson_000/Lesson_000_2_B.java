package Lesson;
import java.util.*;
/*
Составьте программу обмена значениями трех переменных величин a, b, c по следующей схеме:
b присвоить значение a, c присвоить значение b, a присовоить значение c.
 */
public class Lesson_000_2_B {
    public static void main(String[] args) {
        int  a, b, c, g, d, t;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число a = ");
        a = in.nextInt();
        System.out.print("Введите число b = ");
        b = in.nextInt();
        System.out.print("Введите число c = ");
        c = in.nextInt();
        //Обмен значениями
        t = a;
        d = c;
        g = b;
        b = t;
        a = d;
        c = g;
        System.out.print("Полученное число a = ");
        System.out.println(a);
        System.out.print("Полученное число b = ");
        System.out.println(b);
        System.out.print("Полученное число c = ");
        System.out.print(c);
    }
}
