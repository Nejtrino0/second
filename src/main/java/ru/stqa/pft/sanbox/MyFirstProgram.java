package ru.stqa.pft.sanbox;

public class MyFirstProgram {

    public static void main(String[] args) {


        hello("world");
        hello("user");
        hello("Alexey");
        hello("world");




    }

    public static void hello (String somebody ) {

        System.out.println("Hello, " + somebody + "!");


        System.out.println("площадь квадрата со стороной 5 = 25");

    }


    public static double area (double len ) {



        return len  * len ;
    }

}





