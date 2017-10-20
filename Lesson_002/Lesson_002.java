package Lesson;
import java.util.*;
/*
Считая, что Земля - идеальная сфера с радиусом R 6350 км, определить до линии горизонта от точки с высотой над Землей,
равнйо 1, 2, ... 10 км.
 */
public class Lesson_002 {
    public static void main(String[] args) {
        int tvisota;
        final int R = 6350;
        String message;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите точку высоты в метрах = ");
        tvisota = in.nextInt();
        if (tvisota < 11) {
            while (tvisota < 11) {
                double rastoynie = Math.sqrt(Math.pow((R + tvisota), 2) - Math.pow(R, 2));
                System.out.println("Расстояние равно = " +rastoynie);
                tvisota ++;
            };
        } else {
            System.out.print("Это число не входит в промежуток 1, 2, ... 10 км");
        }
    }
}
