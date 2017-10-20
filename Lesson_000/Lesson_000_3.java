package Lesson;
import java.util.*;
/*
Дано вещественное число a. Пользуясь только операцией умножения получить:
Math.pow(a,4) за две операции
Math.pow(a,6) за три операции
Math.pow(a,7) за четыре операции
Math.pow(a,8) за три операции
Math.pow(a,9) за четыре операции
Math.pow(a,10) за четыре операции
Math.pow(a,13) за пять операции
Math.pow(a,15) за пять операции
Math.pow(a,21) за шесть операции
Math.pow(a,28) за шесть операции
Math.pow(a,64) за шесть операции
 */
public class Lesson_000_3 {
    public static void main(String[] args) {
        int a;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число a = ");
        a = in.nextInt();
        double s = a * a;
        double a4 = s * s;
        double a6 = a4 * s;
        double a7 = a6 * a;
        double a8 = a7 * a;
        double a9 = a8 * a;
        double a10 = a9 * a;
        double a13 = a9 * a4;
        double a15 = a7 * a8;
        double a21 = a15 * a6;
        double a28 = a15 * a13;
        double a64 = a28 * a28 * a8;
        System.out.print("Полученное число a(4) = ");
        System.out.println(a4);
        System.out.print("Полученное число a(6) = ");
        System.out.println(a6);
        System.out.print("Полученное число a(7) = ");
        System.out.println(a7);
        System.out.print("Полученное число a(8) = ");
        System.out.println(a8);
        System.out.print("Полученное число a(9) = ");
        System.out.println(a9);
        System.out.print("Полученное число a(10) = ");
        System.out.println(a10);
        System.out.print("Полученное число a(13) = ");
        System.out.println(a13);
        System.out.print("Полученное число a(15) = ");
        System.out.println(a15);
        System.out.print("Полученное число a(21) = ");
        System.out.println(a21);
        System.out.print("Полученное число a(28) = ");
        System.out.println(a28);
        System.out.print("Полученное число a(64) = ");
        System.out.println(a64);
    }
}
