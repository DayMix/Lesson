package Lesson;
import java.util.*;
/*
Составьте программу обмена значениями трех переменных величин a, b, c по следующей схеме:
b присвоить значение c, a присвоить значение b, c присовоить значение a.
 */
public class Lesson_000_2_A {
    public static void main(String[] args) {
        int  a, b, c, g, d, s;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число a = ");
        a = in.nextInt();
        System.out.print("Введите число b = ");
        b = in.nextInt();
        System.out.print("Введите число c = ");
        c = in.nextInt();
        //Обмен значениями
        s = a;
        d = c;
        g = b;
        b = c;
        a = g;
        c = s;
        //Вывод измененных переменных
        System.out.print("Полученное число a = ");
        System.out.println(a);
        System.out.print("Полученное число b = ");
        System.out.println(b);
        System.out.print("Полученное число c = ");
        System.out.print(c);
    }
}
