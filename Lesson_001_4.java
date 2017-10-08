package Lesson;
import java.util.*;
/*
Известен год, номер месяца и день рождения человека, а также год, номер месяца и день сегодняшнего дня.
Определить возраст человека (число полных лет).
 */
public class Lesson_001_4 {
    public static void main(String[] args) {
        int godr, nomerr, denr, gods, nomers, dens, vozr;
        String message;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите год рождения = ");
        godr = in.nextInt();
        System.out.print("Введите номер месяца рождения = ");
        nomerr = in.nextInt();
        System.out.print("Введите день рождения = ");
        denr = in.nextInt();
        System.out.print("Введите сегодняшний год = ");
        gods = in.nextInt();
        System.out.print("Введите номер сегодняшнего месяца = ");
        nomers = in.nextInt();
        System.out.print("Введите сегодняшний день = ");
        dens = in.nextInt();
        int voz = gods - godr;
        //Вычесляем число полных лет
        if (nomerr <= nomers) {
            if (nomerr == nomers) {
                if (denr > dens) {
                    vozr = voz - 1;
                    message = "Вам полных лет: ";
                } else {
                    vozr = voz;
                    message = "Вам полных лет: ";
                };
            } else {
                vozr = voz;
                message = "Вам полных лет: ";
            };
        } else {
            vozr = voz - 1;
            message = "Вам полных лет: ";
        };
        System.out.print(message + vozr);
    }
}
