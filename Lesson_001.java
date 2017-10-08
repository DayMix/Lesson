package Lesson;
import java.util.*;
/*
Дано двузначное число. Определить равен ли квадрат этого числа учетверенной сумме кубов его цифр.
Например для числа 48 ответ положительный, для числа 52 отрицательный.
 */
public class Lesson_001 {
    public static void main(String[] args) {
        int dvuz;
        String message;
        Scanner in = new Scanner(System.in);
        System.out.print("Программа предназначена для того, что бы узнать равен ли квадрат двузначного числа сумме кубов его цифр. \n");
        System.out.print("Введите двузначное число = ");
        dvuz = in.nextInt();
        int pervay = dvuz / 10;//Находим первую цифру
        int vtoray = dvuz % 10;//Находим вторую цифру
        double kvadrat = Math.pow(dvuz,2);//Вводим переменную и находим квадрат числа
        double summa = 4 * (Math.pow(pervay,3) + Math.pow(vtoray,3));//Вводим переменную и находим сумму кубов его цифр
            if (kvadrat == summa) {
                message = "Квадрат числа равен сумме кубов его цифр.";
            } else {
                message = "Квадрат числа не равен сумме кубов его цифр.";
            };
        System.out.println(message);
    }
}
