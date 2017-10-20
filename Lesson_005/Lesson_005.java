package Lesson;
import java.util.*;
/*
Дан числовой двумерный массив. Сформировать одномерный массив
содержащий наименьшие значения в каждой строке. Выбрать среди
этих значений наибольшее и выдать в какой строке оно находится
 */
public class Lesson_005 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число столбцов в массиве: ");
        int stolb = in.nextInt();
        System.out.print("Введите число строк массиве: ");
        int strok = in.nextInt();
        Random rnd = new Random();
        int [] [] array = new int[strok][stolb];
        //Заполняем двумерный массив случйными числами
            for (int i = 0; i < strok; i++) {
                for (int j = 0; j < stolb; j++) {
                    array[i][j] = (rnd.nextInt(8) + 1);
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }

    }
}
