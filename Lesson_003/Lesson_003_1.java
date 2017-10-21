package Lesson.Lesson_003_1;
import java.util.*;
/*
Даны натуральное число  n  и вещественные числа x1, x2, x3,...,xn.
Выяснить, верно ли, что сумма тех вещественных чисел
которые больше 20.5, меньше p.
 */
public class Lesson_003_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        int n = in.nextInt();
        System.out.print("Введите число p: ");
        int p = in.nextInt();
        int summa = 0;
            for (int i = 0; i < n; i++) {
                System.out.print("Введите вещественное число: ");
                double vesth = in.nextDouble();
                    if (vesth >= 20.5) {
                        summa += vesth;
                    }
            }
            if (summa < p) {
                System.out.print("Сумма вещ. чисел меньше числа p");
            } else {
                System.out.print("Сумма вещ. чисел не меньше числа p");
            }
    }
}
