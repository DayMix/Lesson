package Lesson;
import java.util.*;
/*
Задано N троек чисел a, b, c. Вводя их по очереди и интерпретируя как длины сторон треугольника,
определить сколько троек можно использовать для построения треугольника. Каждую тройку сопровождать выводом,
является ли она треугольником или нет.
 */
public class Lesson_003 {
    public static void main(String[] args) {
        int a, b, c, kolichn;
        int summachisel = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите сколько раз надо вводить числа a, b, c: ");
        kolichn = in.nextInt();
        //Делаем ввод чисел
        for (int i = 0; i < kolichn; i++) {
            System.out.print("Введите число a: ");
            a = in.nextInt();
            System.out.print("Введите число b: ");
            b = in.nextInt();
            System.out.print("Введите число c: ");
            c = in.nextInt();
            //Определяем является ли тройка чисел треугольником
            if (a <= (b + c) & b <= (a + c) & c <= (b + a)) {
                System.out.println("Эти числа являются треугольником");
                summachisel ++;
            } else {
                System.out.println("Эти числа не являются треугольником");
            }
        }
        System.out.print("Для построения треугольника можно использовать [" + summachisel + "] троек чисел a, b, c");
    }
}
