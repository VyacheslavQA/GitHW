package lesson2;

public class HW2 {
    public static void main(String[] args) {
        System.out.println(sum10end20(2, 9));
        positiveNumber(-7);
        System.out.println(integerNumber(-1));
        stringNumber("Hello Alexandr" , (1));
    }

    // 1. Написать метод, принимающий на вход два целых числа и проверяющий,
    //что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
    //в противном случае – false.
    static boolean sum10end20(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
        if (sum > 10 && sum < 20) return true;
        else return false;
    }

    //2. Написать метод, которому в качестве параметра передается целое число,
    //метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    //Замечание: ноль считаем положительным числом.

    static void positiveNumber(int a) {

        if (a >= 0)
            System.out.println("Number " + a + "positive");
        else System.out.println("Number " + a + " negative");
    }

    //3. Написать метод, которому в качестве параметра передается целое число.
    //Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.

    static boolean integerNumber(int a) {
        if (a < 0) return true;
        return false;
    }

    //4. Написать метод, которому в качестве аргументов передается строка и число,
    //метод должен отпечатать в консоль указанную строку, указанное количество раз;static String stringNumber(int i, String str) {

     static void stringNumber(String word, int times) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello Alexandr =" + i);
        }

    }

}


