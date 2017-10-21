package Lesson.Lesson_009;

/*
Написать класс, позволяющий найти сумму цифр трехзначного числа,
если последняя цифра – четная. Написать тестовый класс для проверки
 */
public class classSumma {
    int trehznach;
    String message;
    int summa;
    void razchet() {
        int pervoay = trehznach / 100;
        int vtor = trehznach / 10;
        int vtoray = vtor % 10;
        int tretie = trehznach % 10;
            if (tretie % 2 == 0) {
                summa = pervoay + vtoray + tretie;
                message = "Сумма цифр = ";
            } else {
                message = "Не могу найти сумму цифр, т.к. последняя цифра не четная.";
            }
    }
}
