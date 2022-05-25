package lesson7;

import java.util.Scanner;



public class HW7 extends Object{

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        String string1 = "Hello user!";
//
//        String string2 = "Hello ";
//        string2 += "user!";
//
//        String string3 = scanner.nextLine();  // "Hello user!"
//        String string4 = "Hello user!";
//
//
//
//        System.out.println("string1 > " + string1);
//        System.out.println("string2 > " + string2);
//        System.out.println("string3 > " + string3);
//        System.out.println("string4 > " + string4);
//        System.out.println("**********");
//        System.out.println("string1 = string2 > " + (string1 == string2));
//        System.out.println("string1 = string3 > " + (string1 == string3));
//        System.out.println("string1 = string4 > " + (string1 == string4));
//        System.out.println("**********");
//        System.out.println("string1 = string2 > " + (string1.equals(string2)));
//        System.out.println("string1 = string3 > " + (string1.equals(string3)));
//        System.out.println("string1 = string4 > " + (string1.equals(string4)));

        String testString = "Hello";
        StringBuilder stringBuilder = new StringBuilder("Hello");

        System.out.println("Start test: " + testString.equals(stringBuilder.toString()));

        long startTest = System.nanoTime(); //Hex-format // Unix-Time

        for (int i = 0; i < 50000; i++) {
            testString += i; //Hello0123456...49999
        }

        float endTest = System.nanoTime() - startTest;

        System.out.println(testString);
        System.out.println("Time cycle testString: " + (endTest * 0.000001f) + " ms");

        startTest = System.nanoTime();

        for (int i = 0; i < 50000; i++) {
            stringBuilder.append(i);
        }

        endTest = System.nanoTime() - startTest;

        System.out.println(stringBuilder.toString());
        System.out.println("Time cycle stringBuilder: " + (endTest * 0.000001f) + " ms");
        System.out.println(testString.equals(stringBuilder.toString()));

    }

}
