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
        System.out.print("\n");
        //Заполняем двумерный массив случйными числами
        System.out.print("Двумерный массив: \n");
            for (int i = 0; i < strok; i++) {
                for (int j = 0; j < stolb; j++) {
                    array[i][j] = (rnd.nextInt(40) + 10);
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
        //Находим наимаеньшии значения и заносим их в одномерный массив
        int min;
        int [] ar = new int[strok];
        min = array[0][0];
            for (int i =0; i < strok; i++) {
                for (int j = 0; j < stolb; j++) {
                    if (array[i][j] < min) {
                        min = array[i][j];
                    }
                }
                ar[i] = min;
                min = array[1][0];
            }
        System.out.print("\n");
        System.out.print("\n");
        //Вывод на экран одномерного массива
        System.out.print("Одномерный массив наименьших значений: \n");
        for (int i = 0; i < ar.length; i++) {
                System.out.print(ar[i] + " ");
        }
        System.out.print("\n");
        //Находим наибольшее значение в одномерном массиве
        int max = ar[0];
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > max) {
                max = ar[i];
            }
        }
        System.out.print("\n");
        System.out.print("\n");
        //Находим в какой строке находится это максимальное значение
        for (int i = 0; i < strok; i++) {
            for (int j = 0; j < stolb; j++) {
                if (array[i][j] == max) {
                    System.out.println("Максимальное значение одномерного массива\nнаходится в " + i + "-ой строке двумерного массива.");
                    System.out.print("\n");
                    break;
                }
            }
        }
    }
}
