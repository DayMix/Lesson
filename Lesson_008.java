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
        int i = 0;
        System.out.print("\n");
        System.out.println("Содержимое файла: ");
        //Заносим содержимое файла в ArrayList
        ArrayList<String> array = new ArrayList<>();
            while (reader.hasNextLine()) {
                array.add(reader.nextLine());
                System.out.println(i + "-я строка: " + array.get(i));
                i++;
            }
        //Удаляем 3-ю строку и выводим измененный ArrayList
        System.out.print("\n");
        System.out.print("Измененый файл: \n");
            for (i = 0; i < array.size(); i++) {
                if (i == 2) {
                    array.remove(2);
                }
                System.out.println(i + "-я строка: " + array.get(i));
            }
        fileReader.close();

        //Создаем новый текстовый файл и заносим в него измененный ArrayList
        System.out.print("Введите диск куда сохранить новый текстовый файл: ");
        String file1 = scn.nextLine();
        System.out.print("Введите название нового текстового файла с расширением: ");
        String fileName1 = scn.nextLine();
        FileWriter fileWriter1 = new FileWriter(file1 + ":\\" + fileName1);
    }
}
