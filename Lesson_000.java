package Lesson;
import java.util.*;
/*
Даны два целых числа. Найдите их среднее арифметическое.
 */
public class Lesson_000 {
    public static void main(String[] args) {
        int a, b;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число A = ");
        a = in.nextInt();
        System.out.print("Введите число B = ");
        b = in.nextInt();
        double s = (a + b) / 2;
        System.out.print("Среднее арифметическое = ");
        System.out.print(s);
    }
}
