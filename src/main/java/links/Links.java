package links;


public class Links {

   private   Object number;

    public static void main(String[] args) {

        //одной и той-же областью памяти можно манипулировать с помощью разных ссылок
        Links A = new Links();
        A.number = 100;
        System.out.println(A.number);//вывод А=100

        Links B = A;
        System.out.println(B.number);//вывод В=100

        B.number = 200;
        System.out.println(A.number);//вывод А=200

        func(A);
        System.out.println(A.number);//вывод А=300

    }// в переменную А попало знач-е которое передали по ссылке в функции
     //нужно быть аккуратнее с манипуляциями с сылочными переменными внутри каких-то фун-й
    //Так же нужно быть осторожнее передавая ссылочные типы в чужие фун-и, которые могут
    //неожиданно для нас поменять значения внутри наших ссылочных типов.

    public static void func(Links links){
        links.number = 300;
    }
}
