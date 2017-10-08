package Lesson;
import java.util.*;
/*
Даны натуральные числа x и y. Вычислить произведение, используя лишь операцию сложения. Задачу решить двумя способами.
 */
public class Lesson_002_1 {
    public static void main(String[] args) {
        int x, y;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число X: ");
        x = in.nextInt();
        System.out.print("Введите число Y: ");
        y = in.nextInt();
        int chislo = 1;
        double summa = 0;
        while (chislo <= y) {
            int proizvedenie = x;
            summa += proizvedenie;
            chislo ++;
        };
        System.out.print("Произведение = " + summa);
    }
}
