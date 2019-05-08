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


    }


    public static double area (double len ) {



        return len  * len ;
    }

}


