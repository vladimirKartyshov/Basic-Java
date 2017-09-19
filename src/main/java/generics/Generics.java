package generics;

public class Generics {
    public static void main(String[] args) {

        CustomArrayList<String> strings = new CustomArrayList<String>();// вместо Т теперь подставится String

        for (int i = 0; i < 5; i++){
            strings.add("Hello world" + i);
        }
        for (int i = 0; i < strings.getLength(); i++){
            System.out.println(strings.get(i));
        }

        function(42);
        function("Hello world");
        function(5.3);
    }
    static <GENERIC_TYPE> void function(GENERIC_TYPE parameter){
        System.out.println(parameter.toString());
    }
}
