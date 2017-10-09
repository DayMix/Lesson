import java.util.*;
/*
Найти число пар соседних элементов списочного массива,
являющихся четными числами.
 */
public class Lesson_007 {
    public static void main(String[] args) {
    int k = 0;
    int n;
    Scanner in = new Scanner(System.in);
    System.out.print("Введите число элементов в массиве: ");
    n = in.nextInt();
    Random rnd = new Random();
    ArrayList<Integer> ar = new ArrayList<>();
        //Заполнение массива случайными числами и вывод его на экран
        System.out.print("Исходный массив: ");
        for (int i = 0; i < n; i++) {
            ar.add(rnd.nextInt(21) + 2);
            System.out.print(ar.get(i) + " ");
        }
        //Находим число пар соседних элементов массива
        for (int i = 0; i < n; i += 2) {
            if ((ar.get(i) % 2 == 0) && (ar.get(i++) % 2 == 0)) {
                k++;
            }
        }
        //Вывод числа четных пар массива
        System.out.print("\nЧисло пар четных соседних элементов массива: " + k);
    }
}
