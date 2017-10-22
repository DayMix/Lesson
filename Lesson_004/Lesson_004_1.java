package Lesson;
import java.util.*;
/*
Дан массив. Переписать его элементы в другой массив такого же размера следующим образом:
сначала должны идти все отрицательные элементы, а затем все остальные.
Использовать только один проход по исходному массиву.
 */
public class Lesson_004_1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int razmer = scn.nextInt();
        Random rnd = new Random();
        int[] array = new int[razmer];
        int[] arrayIzmen = new int[razmer];
        int a = 0;
        int a1 = 1;
            for (int i =0; i < razmer; i++) {
                array[i] = rnd.nextInt(41) - 20;
                    if (array[i] < 0) {
                        arrayIzmen[a] = array[i];
                        a++;
                    } else {
                        arrayIzmen[razmer - a1] = array[i];
                        a1++;
                    }
            }
            System.out.print("Исходный массив: ");
            for (int i = 0; i < razmer; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.print("\n");
            System.out.print("Измененный массив: ");
            for (int i = 0; i < razmer; i++) {
                System.out.print(arrayIzmen[i] + " ");
            }
    }
}
