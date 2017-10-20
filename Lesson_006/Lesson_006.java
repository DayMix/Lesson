package Lesson;
import java.util.*;
/*
Построить гистограмму из символов «%» количество которых соответствует длине слов в произвольной строке.
 */
public class Lesson_006 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int textlength = 0;
    int k = 0;
    String text;
    System.out.print("Введите строку:");
    text = in.nextLine();
    System.out.print("\n");
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                textlength++;
            } else {
                for (int j = 0; j < textlength; j++) {
                    System.out.print("%");
                }
                textlength = 0;
                System.out.print("\n");
            }
        }
        for (int i = 0; i < textlength; i++) {
            System.out.print("%");
        }
    }
}
