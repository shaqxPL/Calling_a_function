package com.company;

import java.util.Scanner;
// INSTANCJA - pojedyńcze wystąpienie niezależnego zgodnego z danym wzorce (tak jak raidy w WOWie)
public class Main {

    public static void main(String[] args) {
//       Wywołanie instancji klasy MyMethods i przypisanie jej do obiektu "method"
//       Co umożliwi następnie wywołanie metod z tej klasy (MyMethods)
        MyMethods method = new MyMethods();

        //Wywołanie metody hello()
        method.hello();

        //Wywołanie metody hello_2()
        System.out.println(method.hello_2());

        //Wywołanie metody hello_3()
        String hi = MyMethods.hello_3();
        System.out.println(hi);

        System.out.println(method.summing(2,2));

        System.out.println(method.summing_2(5,5));

        multiply();
    }



    public static void multiply(){
//        Tworzymy instancje klasy Scanner i przypisujemy ją do obiektu UserInput
//        Po to żeby można było wprowadząć liczby do systemu podczas działania metody.
        Scanner userInput = new Scanner(System.in);
        System.out.println("Input first number: ");
//        za pomocą metody nextInt() z klasy Scanner przypisujemy do zmiennej
//        to co wprowadzi użytkownik
        int a = userInput.nextInt();
        System.out.println("Input second number: ");
//        za pomocą metody nextInt() z klasy Scanner przypisujemy do zmiennej
//        to co wprowadzi użytkownik
        int b = userInput.nextInt();

        System.out.println(a + " x " + b + " = " + a * b);

    }


}
