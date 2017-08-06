package files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Files {

    public static void main(String[] args) throws IOException {

        File dir = new File(".");//объект File соответствует нашему корневому каталогу
        String [] names = dir.list(); //  смотрим содержимое

        for (int i = 0; i<names.length; i++){
            System.out.println(names[i]);
        }

        File file = new File("pom.xml");
        System.out.println(file.length());//смотрим длину файла pom.xml

        FileInputStream input = new FileInputStream(file);// читаем
        int lenght = input.available();// проверяем сколько байт доступно для чтения в файле
        System.out.println(lenght);

        byte [] data = new byte[lenght];// создан массив байтов длиной lenghts
        input.read(data);// если добавить цикл for можно вывести содержимое файла в цифрах

        String text = new String(data);// в этой строке преобразуем байтовый массив в текст
        System.out.println(text);// и выводим содержимое файла в тексте

        FileOutputStream output = new FileOutputStream(file, true);// добавили append чтобы не перезапис-ть файл
                                                                   // а добавить запись к файлу
        String newText = "<!-- Hello world -->";//чтобы не испортить проект этим комитом
        byte [] newTextBytes = newText.getBytes();//эта конструкция превращает текст в массив байтов

        output.write(newTextBytes);// а массив байтов можно уже записать в файл

        output.close();
    }

}
