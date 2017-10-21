package Lesson.Lesson_009;
import java.util.*;
/*
Тестовый класс
 */
public class TestClassSumma {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите трехзначное число: ");
        int trehznach = in.nextInt();
        classSumma summa = new classSumma();
        summa.trehznach = trehznach;
        summa.razchet();
        System.out.print(summa.message + summa.summa);
    }
}
