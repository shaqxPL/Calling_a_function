package com.company;

public class MyMethods {
     //    Jeżeli metoda jest typu void, nigdy nie kończy się return-em.(hello)
     //    Jeżeli metoda jest innego typu niż void, musi kończyć się return.(hello2)

    public void hello(){
        System.out.println("hello");
    }

    public String hello_2(){
        return "hello2";
    }

    public static String hello_3(){
        return "hello3";
    }

    public int summing(int a,int b){
        return a + b;
    }

//    W parametrach metody podajemy parametr "... numbers" dzieki któremu
//    metoda obsłuży dowolną ilość liczb jaka zostanie jej przekazana
    public int summing_2(int ... numbers){
//        Stworzenie zmiennej sumy i przypisanie jej 0 żeby zaczeło liczyć od 0.
        int sum = 0;
//       Tworzymy pętle w celu iterowania po każdym elemencie w "numbers"
        for (int x: numbers){
//       Zwiększamy sumę dodając do niej każdą liczbę która jest kolejno iterowana.
            sum = sum + x;
        }
//        return po pętli żeby suma była wywołana tylko raz
//        a nie po kązdej iteracji pętli
        return sum;
    }


}
