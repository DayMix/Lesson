package Lesson;
import java.io.*;
import java.util.*;
/*
Имеется текстовый файл. Удалить из него третью строку. Результат записать в другой файл.
 */
public class Lesson_008 {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        System.out.print("Введите диск куда сохранить файл: ");
        String file = scn.nextLine();
        System.out.print("Введите название текстового файла с расширением: ");
        String fileName = scn.nextLine();
        System.out.print("Введите количество строк: ");
        int k = scn.nextInt();
        scn.nextLine();
        Random rnd = new Random();
        //Заполняем строки текстового файла
        FileWriter fileWriter = new FileWriter(file + ":\\" + fileName);
                for (int i = 0; i < k; i++) {
                    System.out.print("Введите количество цифр в [" + i + "] строке: ");
                    int n = scn.nextInt();
                   for (int j = 0; j < n; j++) {
                       fileWriter.write((rnd.nextInt(20) + 1) + " ");
                   }
                   fileWriter.write("\n");
                }
        fileWriter.close();

        //Читаем созданный текстовый файл
        FileReader fileReader = new FileReader(file + ":\\" + fileName);
        Scanner reader = new Scanner(fileReader);
        //Выводим содержимое файла на экран
        int i = 0;
        System.out.print("\n");
        System.out.println("Содержимое файла: ");
            while (reader.hasNextLine()) {
                System.out.println(i + "-я строка: " + reader.nextLine());
                i++;
            }
        //Удаляем 3-ю строку
        System.out.print("\n");
        System.out.println("Измененный файл: ");
        for 
    }
}
