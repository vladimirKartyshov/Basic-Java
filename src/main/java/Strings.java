
public class Strings {

    public static void main(String[] args) {
        //работа со строками

        String string = "Hello world!";
        System.out.println(string.length());

        String string2 = string + " Hello world!";//объединяем
        System.out.println(string2);

        String string3 = string2.replace('o', 'u');//заменяем
        System.out.println(string3);

        String substring = string3.substring(0, 5);//выделяем
        System.out.println(substring);

        String [] strings = string2.split(" ");//вывели слова которые разделены пробелами
        for (int i = 0; i<strings.length; i++){
            System.out.println(strings[i]);
        }
    }
}
