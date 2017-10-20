package Lesson;
import java.util.*;
/*
В массиве хранится информация о количестве побед, одержанных 20 футбольными комндами.
Определить номер команд, имеющих меньше трех побед.
 */
public class Lesson_004 {
    public static void main(String[] args) {
        final int n = 20;
        final int pobed = 3;
        int [] pobedi = new int[n];//Объявляем переменную и определяем массив
        Random random = new Random();
        System.out.print("Массив с победами футбольных команд: ");
        //Забиваем массив случайными числами
        for (int i = 0; i < n; i++) {
            pobedi[i] = random.nextInt(11);
            System.out.print(pobedi[i] + " ");
        }
        System.out.print("\nНомера команд у которых меньше трех побед: ");
        //Определяем номер который	имеет меньше трех побед
        for (int i = 0; i < n; i++) {
            if (pobedi[i] < pobed) {
                System.out.print(i + " ");
            }
        }
    }
}
