package lesson1;

public class Homework1 {
    public static void main(String[] args) {
        //printThreeWords();
        //checkSumSign();
        //printColor();
        compareNumbers();


    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

    }

    public static void checkSumSign() {
        int a = 12;
        int b = -123;
        if ((a + b) > 0) {
            System.out.println("summ is positive");
        } else if ((a + b) < 0) {
            System.out.println("summ is negative");
        } else {
            System.out.println("summ is 0");
        }
    }
//    4. Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением.
//    Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”, если лежит в пределах от
//    0 (0 исключительно) до 100 (100 включительно), то “Желтый”, если больше 100 (100 исключительно) - “Зеленый”;
    public static void printColor(){
        int value = 75;
        if(value<= 0 ){
            System.out.println("RED");
        } else if (value> 0 & value<=100) {
            System.out.println("Yellow");
        } else {
            System.out.println("Green");
        }
    }
//    5. Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b, и инициализируйте
//    их любыми значениями, которыми захотите. Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”,
//    в противном случае “a < b”;
    public static void compareNumbers(){
        int a =1;
        int b =3;
        if(a>=b){
            System.out.println("a >= b");
        }else {
            System.out.println("a < b");
        }
    }

}
